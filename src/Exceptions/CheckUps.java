/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author vittorio
 */
public class CheckUps {
    
    public static String TextoSNumeros(String Text){
        String Msg="";
        int B = NumberFormat(Text);
        if(B==0)
            Msg = " Contiene Numeros";
        return Msg;
    }
    
    public static int NumberFormat(String Text){
        int B=0;
        try {Integer.parseInt(Text);
        } catch (NumberFormatException nfe){B=1;}
        return B;
    }
    
    
}
