/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.Serializable;

/**
 *
 * @author USMAN
 */
public class Machine extends Equipment implements Serializable
{
    String type;
    
    public Machine() 
    {
        super();
        type = "none";
    }
    
    public Machine (String n,double p,int q, String t) 
    {
        super(n,p,q);
        this.type = t;
    }
    
    public String toString ()
    {
        String s = "";
        s += "Type  : " + type;
        s += "\n" + super.toString();
        return s;
    }
}
