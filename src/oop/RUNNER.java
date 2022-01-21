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
public class RUNNER {
    
    public static void main(String[] args) 
    {
        Gym gym = Filing.Read();
        
        System.out.println(gym.admin.id + "\n" + gym.admin.getPassword());
        
        FrontPage frontPage = new FrontPage (gym);
        frontPage.setVisible(true);
         
        
    }
    
}
