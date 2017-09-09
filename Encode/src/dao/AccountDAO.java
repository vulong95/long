/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Account;
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
 * @author quay
 */
public class AccountDAO {

    final private String SQLADD = "INSERT INTO ACCOUNT VALUES(?,?,?)";
    final private String SQLREADBYUSER = "SELECT * FROM ACCOUNT WHERE USERNAME = ?";
    Connection con = null;

    public AccountDAO() {
        con = new DBConnector().getCon();
    }

    public Account add(Account ac) {
        try {
            PreparedStatement ps = con.prepareStatement(SQLADD);
            ps.setString(1, ac.getUsername());
            ps.setString(2, new HashUlti().hashmd5(ac.getPassword()));
            ps.setInt(3, ac.getRoleid());
            int i = ps.executeUpdate();
            return ac;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Account readByUser(String username) {
        try {
            PreparedStatement ps = con.prepareStatement(SQLREADBYUSER);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Account ac = new Account();
                    ac.setUsername(rs.getString(1));
                    ac.setPassword(rs.getString(2));
                    ac.setRoleid(rs.getInt(3));
                    return ac;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Account checkLogin(String username, String password) {
        Account ac = readByUser(username);
        if (ac != null) {
            if (ac.getPassword().equals(password)) {
                return ac;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Account ac = new Account("nguyen", "123", 2);
        AccountDAO dao = new AccountDAO();
        dao.add(ac);
    }
}
