/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Account;
import java.util.ArrayList;
import java.util.List;
import ulti.ProcessFile;

/**
 *
 * @author Administrator
 */
public class AccountDAO {
    List<Account> acc = null;
    ProcessFile pr = null;

    public AccountDAO() {
        acc = new ArrayList<>();
        pr = new ProcessFile();
    }
    public Account create (Account ac){
        acc.add(ac);
        pr.saveAccount(ac);
        return ac;
    }
}
