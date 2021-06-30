/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySql_Checks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author vittorio
 */
public class ConnectionSQL {
    
    public static Connection Test(String Database, String User, String Password){
        String nombreBD = Database;
        String login = User;
        String pass = Password;
        String url = "jdbc:mysql://localhost:3306/"+nombreBD+"?useUnicode=true&use"+
                "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"+"serverTimezone=UTC";
        
        String SQLEx, SQLEs, Msg="";
        int VenErr;
         Connection AzurLane = null;
        
        try{
            AzurLane =  DriverManager.getConnection(url, login, pass);
            
        }catch(SQLException A){
            SQLEx = "SQLException: "+ A.getMessage();
            SQLEs = "SQLState: " +A.getSQLState();
            VenErr = A.getErrorCode();
            Msg = "Informacion del Error\n"+SQLEx+"\n"+SQLEs+"\n"+"Vendor Error: " +VenErr;
        }
        if(Msg.compareTo("") != 0){
            JOptionPane.showMessageDialog(null, Msg, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }else{
            JOptionPane.showMessageDialog(null, "Connection Open", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            return AzurLane;
        }
    }
}
