/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author USMAN
 */
public class HelperMethods 
{
    
    //checking alphabetic string
    public static boolean isAlpha(String a)
    {
        for (int i = 0 ; i < a.length() ; i++)
        {
            if (Character.isLetter((a.charAt(i))) == true || a.charAt(i) == ' ')
            {
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    
    //checking numeric string
    public static boolean isNumber(String a)
    {
        for (int i = 0 ; i < a.length() ; i++)
        {
            if (Character.isDigit((a.charAt(i))) == false){
                return false;
            }
        }
        return true;
    }
    
    //checking float number string
    public static boolean isFloat(String a)
    {
        for (int i = 0 ; i < a.length() ; i++)
        {
            if (Character.isDigit((a.charAt(i))) == false && a.charAt(i) != '.'){
                return false;
            }
        }
        return true;
    }
    
    
    public static boolean isValidPassword (String password)
    {
        
        int indicator = 0;
        int digits = 0;
        for (int i = 0 ; i < password.length() ; i++){
        if (Character.isDigit((password.charAt(i))) == true){
        digits += 1;}    
        if (Character.isDigit((password.charAt(i))) == false && Character.isLetter((password.charAt(i))) == false ){
        indicator = 1;
        break;}
            }
        
        if (password.length() < 8 || indicator == 1 || digits < 2)
        {
            return false;
        }
        else
        {
            return true;
        }
    
    }
    
    
}
