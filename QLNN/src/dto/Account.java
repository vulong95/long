/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Account implements Serializable, Comparable<Account>{
    private String name;
    private String password;
    private String description;

    public Account() {
    }

    public Account(String name, String password, String description) {
        this.name = name;
        this.password = password;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name + "," + this.password + "," + this.description; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    public int compareTo(Account o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
