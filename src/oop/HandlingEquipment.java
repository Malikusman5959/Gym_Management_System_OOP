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
public class HandlingEquipment extends Equipment implements Serializable
{
    
    public HandlingEquipment() 
    {
        super();
    }
    
    public HandlingEquipment (String n,double p,int q) 
    {
        super(n,p,q);
    }
   
    public String toString ()
    {
        String s = "";
        s += super.toString();
        return s;
    }
}

