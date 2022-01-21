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
public class Weight extends Equipment implements Serializable
{
    double weight;

    public Weight() 
    {
        super();
        weight = 0;
    }
    
    public Weight(String n,double p,int q, double w) 
    {
        super(n,p,q);
        this.weight = w;
    }
    
    public String toString ()
    {
        String s = "";
        s += "Weight : " + weight;
        s += "\n" + super.toString();
        return s;
    }

}
