/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.EmployeeDAO;
import dto.Employee;
import java.util.Scanner;

/**
 *
 * @author Quay
 */
public class RunEmployee {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code: ");
        String code = sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();
        dao.create(new Employee(code, name, age, salary));
        for(Employee e: dao.readAll()){
            System.out.println(e.toString());
        }
        System.out.println("Enter code want to update: ");
        sc = new Scanner(System.in);
        code = sc.nextLine();
        System.out.println("Enter new salary: ");
        salary = sc.nextDouble();
        dao.update(new Employee(code, salary));
        System.out.println("Enter code want to delete: ");
        sc = new Scanner(System.in);
        code = sc.nextLine();
        dao.delete(code);
    }
}
