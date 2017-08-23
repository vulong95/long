/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BankAction;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quay
 */
public class RunServer {

    public static void main(String[] args) {
        try {
            BankAction ac = new BankAction();
            LocateRegistry.createRegistry(55901);
            Naming.rebind("rmi://localhost:55901/Server", ac);
            System.out.println("Star...");
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(RunServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
