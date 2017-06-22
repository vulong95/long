/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulti;

import dto.Account;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ProcessFile {

    public boolean saveAccount(Account ac) {
        FileWriter fw = null;
        BufferedWriter bufw = null;
        try {
            fw = new FileWriter((System.getProperty("user.dir") + "/Account.txt"), true);
            bufw = new BufferedWriter(fw);
            bufw.write(ac.toString());
            bufw.newLine();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(ProcessFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(ProcessFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }
}
