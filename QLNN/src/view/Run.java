/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AccountDAO;
import dto.Account;

/**
 *
 * @author Administrator
 */
public class Run {
    public static void main(String[] args) {
        AccountDAO dao = new AccountDAO();
        Account acc = new Account("ha", "hi", "he");
        dao.create(acc);
    }
}
