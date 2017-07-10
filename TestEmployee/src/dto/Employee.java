/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author Quay
 */
public class Employee implements Serializable {

    private String code;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String code, String name, int age, double salary) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public Employee(String code, double salary) {
        this.code = code;
        this.salary = salary;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "code=" + code + ", name=" + name + ", age=" + age + ", salary=" + salary + '}';
    }

}
