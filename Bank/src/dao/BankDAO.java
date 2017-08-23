/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Bank;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ultis.DBConnector;

/**
 *
 * @author Quay
 */
public class BankDAO {
    
    final private String SQLADD = "INSERT INTO BANK VALUES(?,?,?,?,?)";
    final private String SQLREADALL = "SELECT * FROM BANK";
    final private String SQLREADBYCODE = "SELECT * FROM BANK WHERE CODE = ?";
    final private String SQLUPDATE = "UPDATE BANK SET PRICE = ? WHERE CODE =?";
    final private String SQLDELETE = "DELETE FROM BANK WHERE CODE =?";
    Connection con = null;
    List<Bank> l = null;
    
    public BankDAO() {
        con = new DBConnector().getCon();
        l = new ArrayList<>();
    }
    
    public Bank add(Bank b) {
        try {
            PreparedStatement pr = con.prepareStatement(SQLADD);
            pr.setString(1, b.getCode());
            pr.setString(2, b.getName());
            pr.setInt(3, b.getPhone());
            pr.setString(4, b.getAddress());
            pr.setDouble(5, b.getPrice());
            int i = pr.executeUpdate();
            return b;
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Bank> readAll() {
        l = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQLREADALL);
            if (rs != null) {
                while (rs.next()) {
                    Bank b = new Bank();
                    b.setCode(rs.getString(1));
                    b.setName(rs.getString(2));
                    b.setPhone(rs.getInt(3));
                    b.setAddress(rs.getString(4));
                    b.setPrice(rs.getDouble(5));
                    l.add(b);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
    
    public Bank readByCode(String code) {
        try {
            PreparedStatement pr = con.prepareStatement(SQLREADBYCODE);
            pr.setString(1, code);
            ResultSet rs = pr.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Bank b = new Bank();
                    b.setCode(rs.getString(1));
                    b.setName(rs.getString(2));
                    b.setPhone(rs.getInt(3));
                    b.setAddress(rs.getString(4));
                    b.setPrice(rs.getDouble(5));
                    return b;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Bank update(Bank b) {
        try {
            PreparedStatement pr = con.prepareStatement(SQLUPDATE);
            pr.setDouble(1, b.getPrice());
            pr.setString(2, b.getCode());
            int i = pr.executeUpdate();
            return b;
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean delete(String code) {
        try {
            PreparedStatement pr = con.prepareStatement(SQLDELETE);
            pr.setString(1, code);
            int i = pr.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
