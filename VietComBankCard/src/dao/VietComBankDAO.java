/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.VietComBank;
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
public class VietComBankDAO {

    final private String SQLADD = "INSERT INTO CUSTOMER VALUES (?,?,?)";
    final private String SQLREADALL = "SELECT * FROM CUSTOMER";
    final private String SQLUPDATE = "UPDATE CUSTOMER SET ADDRESS = ? WHERE CARDNUMBER =?";
    final private String SQLDELETE = "DELETE FROM CUSTOMER WHERE CARDNUMBER =?";
    Connection con = null;
    List<VietComBank> lV = null;

    public VietComBankDAO() {
        con = new DBConnector().getCon();
        lV = new ArrayList<>();
    }

    public VietComBank add(VietComBank v) {
        try {
            PreparedStatement pr = con.prepareStatement(SQLADD);
            pr.setString(1, v.getCardnumber());
            pr.setString(2, v.getName());
            pr.setString(3, v.getAddress());
            int i = pr.executeUpdate();
            return v;
        } catch (SQLException ex) {
            Logger.getLogger(VietComBankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<VietComBank> readAll() {
        lV = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQLREADALL);
            if (rs != null) {
                while (rs.next()) {
                    VietComBank v = new VietComBank();
                    v.setCardnumber(rs.getString(1));
                    v.setName(rs.getString(2));
                    v.setAddress(rs.getString(3));
                    lV.add(v);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(VietComBankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lV;
    }

    public VietComBank update(VietComBank v) {
        try {
            PreparedStatement pr = con.prepareStatement(SQLUPDATE);
            pr.setString(1, v.getAddress());
            pr.setString(2, v.getCardnumber());
            int i = pr.executeUpdate();
            return v;
        } catch (SQLException ex) {
            Logger.getLogger(VietComBankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean delete(String cardnumber) {
        try {
            PreparedStatement pr = con.prepareStatement(SQLDELETE);
            pr.setString(1, cardnumber);
            int i = pr.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VietComBankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
