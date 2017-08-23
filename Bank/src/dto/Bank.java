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
public class Bank implements Serializable, Comparable<Bank> {

    private String code;
    private String name;
    private int phone;
    private String address;
    private double price;

    public Bank() {
    }

    public Bank(String code, String name, int phone, String address, double price) {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.price = price;
    }

    public Bank(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bank{" + "code=" + code + ", name=" + name + ", phone=" + phone + ", address=" + address + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Bank t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
