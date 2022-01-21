/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USMAN
 */
public class Filing 
{
 
    public static void Write (Gym gym)
    {
        //write gym to file
        try {
            
            ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream ("GYM.txt"));
            
            oos.writeObject(gym);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Filing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Filing.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
    
    public static Gym Read ()
    {
        //reading gym  from file
        Gym g = null;
        
        try {
            
            ObjectInputStream ois = new ObjectInputStream (new FileInputStream ("GYM.txt"));
            g = (Gym) ois.readObject();
            ois.close();
        }
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Filing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Filing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Filing.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
        return g;
    }
    
    
    
}
