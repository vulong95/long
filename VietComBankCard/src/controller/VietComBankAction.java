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
 * @author Quay
 */
public class VietComBankAction extends UnicastRemoteObject implements VietComBankIn {

    VietComBankDAO dao = null;

    public VietComBankAction() throws RemoteException {
        super();
        dao = new VietComBankDAO();
    }

    @Override
    public VietComBank add(VietComBank v) {
        return dao.add(v);
    }

    @Override
    public List<VietComBank> readAll() {
        return dao.readAll();
    }

    @Override
    public VietComBank update(VietComBank v) {
        return dao.update(v);
    }

    @Override
    public boolean delete(String cardnumber) {
        return dao.delete(cardnumber);
    }
}
