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
public class VietComBank implements Serializable, Comparable<VietComBank> {

    private String cardnumber;
    private String name;
    private String address;

    public VietComBank() {
    }

    public VietComBank(String cardnumber, String name, String address) {
        this.cardnumber = cardnumber;
        this.name = name;
        this.address = address;
    }

    public VietComBank(String cardnumber, String address) {
        this.cardnumber = cardnumber;
        this.address = address;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "VietComBank{" + "cardnumber=" + cardnumber + ", name=" + name + ", address=" + address + '}';
    }

    @Override
    public int compareTo(VietComBank t) {
        return this.cardnumber.compareTo(t.cardnumber);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

}
