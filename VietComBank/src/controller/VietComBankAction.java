/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.VietComBankDAO;
import dto.VietComBank;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Aptech
 */
public class VietComBankAction extends UnicastRemoteObject implements VietComBankIn {

    VietComBankDAO dao = null;

    public VietComBankAction() throws RemoteException {
        super();
        dao = new VietComBankDAO();
    }

    @Override
    public VietComBank add(VietComBank v) throws RemoteException {
        return dao.add(v);
    }

    @Override
    public List<VietComBank> readAll() throws RemoteException {
        return dao.readAll();
    }

    @Override
    public VietComBank update(VietComBank v) throws RemoteException {
        return dao.update(v);
    }

    @Override
    public boolean delete(String cardnumber) throws RemoteException {
        return dao.delete(cardnumber);
    }

    @Override
    public VietComBank readByCardid(String cardid) throws RemoteException {
        if (check(cardid)) {
            return dao.readByCardid(cardid);
        } else {
            return null;
        }
    }

    @Override
    public boolean check(String cardid) throws RemoteException {
        //Kiem tra 
        boolean kq = true;
        if (!(cardid.startsWith("0161") || cardid.startsWith("0162"))) //goi
        {
            kq = false;
            return false;
        }

        //Kiem tra do dai
        char[] c = cardid.toCharArray();
        if (c.length != 11) {
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
