/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author unitech
 */
public class Database {
    Connection con=null;
    public static Connection connect(){
        try{
            String host="jdbc:derby://localhost:1527/MANAGEMENT";
            String username="NINE";
            String password="saints";
            Connection con=DriverManager.getConnection(host, username, password);
            return con;
        }
        catch(Exception e){
          // JOptionPane.showMessageDialog(e);
        }
        return null;
    }
    
    
    
}
