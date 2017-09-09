/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDAO;
import dto.Account;

/**
 *
 * @author quay
 */
public class AccountAction {

    AccountDAO dao = new AccountDAO();

    public Account add(Account ac) {
        return dao.add(ac);
    }

    public Account readByUser(String username) {
        return dao.readByUser(username);
    }

    public Account checkLogin(String username, String password) {
        return dao.checkLogin(username, password);
    }
}
