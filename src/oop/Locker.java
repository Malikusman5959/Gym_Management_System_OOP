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
public class Locker implements Serializable
{
    private int passcode;
    private double amount;

    public Locker() 
    {
        passcode = 0;
        amount = 0;
    }
    
    public Locker(int passcode, double amount) 
    {
        this.passcode = passcode;
        this.amount = amount;
    }

    public int getPasscode() 
    {
        return passcode;
    }

    public void setPasscode(int passcode) 
    {
        this.passcode = passcode;
    }

    public double getAmount() 
    {
        return amount;
    }

    public void setAmount(double amount) 
    {
        this.amount = amount;
    }
    
    //add amount to locker
    public boolean addAmount (double am)
    {
        amount += am;
        return true;
    }
    
    //withdraw amount from the locker
    public boolean withdrawAmount (double am)
    {
        if (amount >= am)
        {
            amount -= am;
            return true;
        }
        return false;
    }
   
 
}
