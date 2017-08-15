/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quay
 */
public class DBConnector {

    Connection con = null;
    
    public DBConnector() {
        FileReader fr = null;
        BufferedReader br = null;
        String url = null;
        String username = null;
        String password = null;
        try {
            fr = new FileReader(System.getProperty("user.dir") + "/db.properties");
            br = new BufferedReader(fr);
            url = br.readLine();
            username = br.readLine();
            password = br.readLine();
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection(url, username, password);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getCon() {
        return con;
    }
    
}
