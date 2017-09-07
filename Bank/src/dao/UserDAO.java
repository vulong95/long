/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.BankUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ultis.DBConnector;
import ultis.HashUlti;

/**
 *
 * @author Aptech
 */
public class UserDAO {

    final private String SQLCREATE = "INSERT INTO BANKUSER VALUES(?,?)";
    final private String SQLREADBYUSER = "SELECT PASSWORD FROM BANKUSER WHERE USERNAME = ?";
    Connection con = null;

    public UserDAO() {
        con = new DBConnector().getCon();
    }

    public BankUser create(BankUser b) {
        try {
            PreparedStatement pr = con.prepareStatement(SQLCREATE);
            pr.setString(1, b.getUsername());
            pr.setString(2, new HashUlti().hashmd5(b.getPassword()));
            int i = pr.executeUpdate();
            return b;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public BankUser readByUser(String username) {
        try {
            PreparedStatement pr = con.prepareStatement(SQLREADBYUSER);
            pr.setString(1, username);
            ResultSet rs = pr.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    BankUser b = new BankUser(username, rs.getString(1));
                    return b;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean checkLogin(String username, String password) {
        BankUser b = readByUser(username);
        if (b != null) {
            return b.getPassword().equals(password);
        }
        return false;
    }

    public static void main(String[] args) {
        BankUser b = new BankUser("admin", "admin");
        UserDAO u = new UserDAO();
        u.create(b);
        if (u.checkLogin("admin", new HashUlti().hashmd5("admin"))) {
            System.out.println("ok");
        } else {
            System.out.println("Fail");
        }
    }
}
