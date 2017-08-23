/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BankDAO;
import dto.Bank;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Quay
 */
public class BankAction extends UnicastRemoteObject implements BankIn {

    BankDAO dao = null;

    public BankAction() throws RemoteException {
        super();
        dao = new BankDAO();
    }

    @Override
    public Bank add(Bank b) throws RemoteException {
        return dao.add(b);
    }

    @Override
    public List<Bank> readAll() throws RemoteException {
        return dao.readAll();
    }

    @Override
    public Bank readByCode(String code) throws RemoteException {
        if (check(code)) {
            return dao.readByCode(code);
        } else {
            return null;
        }
    }

    @Override
    public Bank update(Bank b) throws RemoteException {
        return dao.update(b);
    }

    @Override
    public boolean delete(String code) throws RemoteException {
        return dao.delete(code);
    }

    @Override
    public boolean check(String code) throws RemoteException {
        boolean kq = true;
        if (!(code.startsWith("0161") || code.startsWith("0162"))) {
            kq = false;
            return false;
        }
        char[] c = code.toCharArray();
        if (code.length() != 11) {
            return false;
        }
        for (char cc : c) {
            if (!Character.isDigit(cc)) {
                return false;
            }
        }
        return true;
    }
}
