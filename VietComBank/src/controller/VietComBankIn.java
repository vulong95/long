/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.VietComBank;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Aptech
 */
public interface VietComBankIn extends Remote {

    public VietComBank add(VietComBank v) throws RemoteException;

    public List<VietComBank> readAll() throws RemoteException;

    public VietComBank readByCardid(String carid) throws RemoteException;

    public VietComBank update(VietComBank v) throws RemoteException;

    public boolean delete(String cardnumber) throws RemoteException;
    
    public boolean check(String cardid) throws RemoteException;
}
