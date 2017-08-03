/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EmployeeDAO;
import dto.Employee;
import java.util.List;

/**
 *
 * @author Quay
 */
public class EmployeeAction {

    EmployeeDAO dao = new EmployeeDAO();

    public Employee create(Employee e) {
        return dao.create(e);
    }

    public List<Employee> readAll() {
        return dao.readAll();
    }

    public Employee update(Employee e) {
        return dao.update(e);
    }

    public boolean delete(String code) {
        return dao.delete(code);
    }
}
