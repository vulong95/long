/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.VietComBankAction;
import dto.VietComBank;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aptech
 */
public class RunServer {

    public static void main(String[] args) {
        try {
            VietComBankAction ac = new VietComBankAction();
            LocateRegistry.createRegistry(55901);
            Naming.rebind("rmi://localhost:55901/VServer", ac);
            System.out.println("Start...");
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(RunServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
