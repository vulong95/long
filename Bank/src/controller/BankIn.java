/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.Bank;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Quay
 */
public interface BankIn extends Remote {

    public Bank add(Bank b) throws RemoteException;

    public List<Bank> readAll() throws RemoteException;

    public Bank readByCode(String code) throws RemoteException;

    public Bank update(Bank b) throws RemoteException;

    public boolean delete(String code) throws RemoteException;

    public boolean check(String code) throws RemoteException;
}
