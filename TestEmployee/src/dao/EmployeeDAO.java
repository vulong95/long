/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ultis.DBConnect;

/**
 *
 * @author Quay
 */
public class EmployeeDAO {

    final private String SQLCREATE = "INSERT INTO EM VALUES(?,?,?,?)";
    final private String SQLREADALL = "SELECT * FROM EM";
    final private String SQLUPDATE = "UPDATE EM SET SALARY = ? WHERE CODE = ?";
    final private String SQLDELETE = "DELETE FROM EM WHERE CODE = ?";
    Connection con = null;
    List<Employee> lE = null;

    public EmployeeDAO() {
        con = new DBConnect().getCon();
        lE = new ArrayList<>();
    }

    public Employee create(Employee e) {
//        PreparedStatement pr;
        try {
            PreparedStatement pr = con.prepareStatement(SQLCREATE);
            pr.setString(1, e.getCode());
            pr.setString(2, e.getName());
            pr.setInt(3, e.getAge());
            pr.setDouble(4, e.getSalary());
            int i = pr.executeUpdate();
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Employee> readAll() {
        lE = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQLREADALL);
            if (rs != null) {
                while (rs.next()) {
                    Employee e = new Employee();
                    e.setCode(rs.getString(1));
                    e.setName(rs.getString(2));
                    e.setAge(rs.getInt(3));
                    e.setSalary(rs.getDouble(4));
                    lE.add(e);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lE;
    }

    public Employee update(Employee e) {
        try {
            PreparedStatement pr = con.prepareStatement(SQLUPDATE);
            pr.setDouble(1, e.getSalary());
            pr.setString(2, e.getCode());
            int i = pr.executeUpdate();
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
