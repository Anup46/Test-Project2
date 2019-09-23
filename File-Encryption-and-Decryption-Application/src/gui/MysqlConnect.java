 
package gui;

import java.sql.*;
import javax.swing.*;


/**
 *
 * @author Anup Kumar
 */
public class MysqlConnect {
    Connection con= null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con= DriverManager.getConnection("jdbc:sqlite:password.db"); 
            return con;
        
        }
        catch(Exception e){
JOptionPane.showMessageDialog(null, e);
      } 
        return null;
   }      
    
 }
