

package oop;

import java.io.Serializable;



public class Admin extends Gym implements Serializable
{
    String name;
    public String id;
    private String password;


    public Admin()
    {
        name = "none";
        id = "none";
        password = "none";
    }
    
    public Admin (String n , String p)
    {
        name = n;
        id = generateId();
        password = p;
    }
    
    //generate login id
    public String generateId() 
    {
        String s = "Ad.";
        s += (name.substring(0,2)).toUpperCase();
        s += (int)(1000 + Math.random()* 1001);
        return s;
    }
    
    //set login id
    public void setId () 
    {
        id = generateId();
    }
    
    //change password
    public void setPassword(String password) 
    {
        int indicator = 0;
        int digits = 0;
        for (int i = 0 ; i < password.length() ; i++)
        {
            if (Character.isDigit((password.charAt(i))) == true)
            {
                digits += 1;
            }    
            if (Character.isDigit((password.charAt(i))) == false && Character.isLetter((password.charAt(i))) == false )
            {
                indicator = 1;
                break;
            }
        }
        
        if (password.length() >= 8 && indicator == 0 && digits >= 2)
        {
            this.password = password;
        }
    }
    
    public String getPassword() {
        return password;
    }
    
    public String toString ()
    {
        String s = "";
        s += "Name : " + name;
        s += "\nId : " + id;
        s += "\nPassword : " + password;
        return s;
    }
    
    
}
