/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author quay
 */
public class Account implements Serializable, Comparable<Account> {

    private String username;
    private String password;
    private int roleid;

    public Account() {
    }

    public Account(String username, String password, int roleid) {
        this.username = username;
        this.password = password;
        this.roleid = roleid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    @Override
    public int compareTo(Account t) {
        return this.username.compareTo(t.username);
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", password=" + password + ", roleid=" + roleid + '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

}
