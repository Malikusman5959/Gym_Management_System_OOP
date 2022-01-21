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
public abstract class Equipment implements Serializable
{
    
    String name;
    double price;
    int quantity;

    public Equipment() 
    {
        this.name = "none";
        this.price = 0;
        this.quantity = 0;
    }
    
    public Equipment(String name, double price, int quantity) 
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    
    public boolean addPieces (int amount)
    {
        quantity += amount;
        return true;
    }
    
    public boolean removePieces (int amount)
    {
        if (quantity <= amount)
        {
            quantity -= amount;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString ()
    {
        String s = "";
        s += "Equipment Name : \t\t\t" + name;
        s += "\nQuantity : \t\t\t" + quantity;
        s += "\nPrice per Piece : \t\t\t" + price;
        return s;
    }        
            
}
