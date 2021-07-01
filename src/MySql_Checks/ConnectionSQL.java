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
        String url = "jdbc:mysql://127.0.0.1:3306/"+nombreBD+"?useUnicode=true&use"+
                "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"+"serverTimezone=UTC&useSSL=false";
        String SQLEx, SQLEs, Msg="";
        int VenErr;
         Connection AzurLane = null;
        //Detalles para que la conexion pueda ser realizada y regresar un objeto de tipo Connection
         
         
        try{
            AzurLane =  DriverManager.getConnection(url, login, pass); //Conexion
            
        }catch(SQLException A){//Mensaje de error si no funciona la conexion
            SQLEx = "SQLException: "+ A.getMessage();
            SQLEs = "SQLState: " +A.getSQLState();
            VenErr = A.getErrorCode();
            Msg = "Informacion del Error\n"+SQLEx+"\n"+SQLEs+"\n"+"Vendor Error: " +VenErr;
        }
        if(Msg.compareTo("") != 0){
            JOptionPane.showMessageDialog(null, Msg, "Error", JOptionPane.ERROR_MESSAGE);//Si hubo errores
            return null;
        }else{
            JOptionPane.showMessageDialog(null, "Connection Open", "Success", JOptionPane.INFORMATION_MESSAGE);
            //si todo sale bien
            return AzurLane;
        }
    }
}
