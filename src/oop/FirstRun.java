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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USMAN
 */
public class FirstRun 
{

     public static void main(String[] args) 
     {
         
         
        //default admin 
        Admin admin = new Admin ("Usman Amjad" , "12345678");
        System.out.println("Admin Login \n ID : "+ admin.id + "\n Password : " + admin.getPassword());
        
        //locker
        Locker locker = new Locker (1111,900000000);
        
        //arrays
        ArrayList <Trainer> listOfTrainers = new ArrayList <Trainer> ();
        listOfTrainers.add (new Trainer ("Fahad Ali" , "Male" , "12/12/1985" , "0333-9874563","Street No 5, Royal Avenue , Islamabad" , "00000000" , 2018 ,  "Morning"));
        listOfTrainers.add (new Trainer ("Wahab Riaz" , "Male" , "02/11/1990" , "0300-9000063","Blue Area , Islamabad" , "00000000" , 2017 ,  "Evening"));
        listOfTrainers.add (new Trainer ("Ashfaq Khan" , "Male" , "22/01/1994" , "0303-9844763","Street No 10, Royal Avenue , Islamabad" , "00000000" , 2012 ,  "Morning"));
        listOfTrainers.add (new Trainer ("Hania Amir" , "Female" , "12/10/1996" , "0331-9874003","Siddiqui Chowk , Islamabad" , "00000000" , 2010 ,  "Evening"));
        listOfTrainers.add (new Trainer ("Asmah Qazi" , "Female" , "11/11/1982" , "0300-5874563","F-7 , Islamabad" , "00000000" , 2000 ,  "Morning"));
        listOfTrainers.add (new Trainer ("Areej Masood" , "Female" , "10/03/1994" , "0323-9874563","Chaklala Scheme 3 , Rawalpindi" , "00000000" , 2012 ,  "Evening"));
        listOfTrainers.add (new Trainer ("Maria Shah" , "Female" , "13/02/1989" , "0301-8874563","Faizabad , Rawalpindi" , "00000000" , 2016 ,  "Morning"));
        listOfTrainers.add (new Trainer ("Arika Sajjad" , "Female" , "01/05/1994" , "0332-6874563","Saddar , Rawalpindi" , "00000000" , 2011 ,  "Evening"));
        listOfTrainers.add (new Trainer ("Fawad Ali" , "Male" , "15/10/1989" , "0304-0874563","6th Road , Rawalpindi" , "00000000" , 2015 ,  "Morning"));
        listOfTrainers.add (new Trainer ("Usama Bilaal" , "Male" , "19/11/1979" , "0308-7874563","I-8 , Islamabad" , "00000000" , 2014 ,  "Evening"));
        ArrayList <Trainee> listOfTrainees = new ArrayList <Trainee> ();
        listOfTrainees.add (new Trainee ("Hamaza Ali" , "Male" , "12/12/1985" , "0333-9874563","Street No 5, Royal Avenue , Islamabad"  , "00000000" , "10/11/2018" , 169 , 61 , null , "Morning" , "Muscle Gain"));
        listOfTrainees.add (new Trainee ("Muhammad Aamir" , "Male" , "02/11/1990" , "0333-9874563","Blue Area , Islamabad" , "00000000" , "22/10/2017" , 166 , 60 , null , "Evening" , "Weight Loss"));
        listOfTrainees.add (new Trainee ("Anjum Shehzad" , "Male" , "22/01/1994" , "0303-9844763","Street No 10, Royal Avenue , Islamabad" , "00000000" , "20/02/2010" , 170 , 55 , null , "Morning" , "Shredding"));
        listOfTrainees.add (new Trainee ("Ayesha hamid" , "Female" , "12/10/1996", "0331-9874003","Siddiqui Chowk , Islamabad" , "00000000" , "24/02/2011" , 177 , 59 , null , "Evening" , "Muscle Gain"));
        listOfTrainees.add (new Trainee ("Maryam shah" , "Female" , "11/11/1982" ,  "0300-5874563","F-7 , Islamabad" , "00000000" , "20/11/2016" , 172 , 65 , null , "Morning" , "Weight Loss"));
        listOfTrainees.add (new Trainee ("Warda Shehzad" , "Female" , "13/02/1989", "0323-9874563","Chaklala Scheme 3 , Rawalpindi" , "00000000" , "10/03/2015" , 183 , 70 , null , "Morning" , "Shredding"));
        listOfTrainees.add (new Trainee ("Andaleeb Swati" , "Female" , "01/05/1994" , "0333-9874563","Dubai Boys Hostel, Royal Avenue , Islamabad" , "00000000" , "10/05/2018" , 160 , 68 , null , "Evening" , "Muscle Gain"));
        listOfTrainees.add (new Trainee ("Zeqi Syed" , "Male" , "02/11/2000" , "0332-6874563","Saddar , Rawalpindi" , "00000000" , "02/11/2017" , 168 , 54 , null , "Morning" , "Weight Loss"));
        listOfTrainees.add (new Trainee ("Asim Malok" , "Male" , "15/10/1989" , "0304-0874563","6th Road , Rawalpindi" , "00000000" , "18/12/2011" , 189 , 65 , null , "Evening" , "Shredding"));
        listOfTrainees.add (new Trainee ("Farooq Satti" , "Male" , "19/11/1979" , "0308-7874563","I-8 , Islamabad" , "00000000" , "02/10/2013" , 178 , 70 , null , "Evening" , "Weight Loss"));
        
       
        ArrayList <Machine> listOfMachines = new ArrayList <Machine> ();
        ArrayList  <Weight> listOfWeights = new ArrayList <Weight> ();
        ArrayList <HandlingEquipment> listOfHandlers = new ArrayList <HandlingEquipment> ();
        
        
        Timings time = new Timings ("04:00" , "09:00" , "05:00" , "11:00" , "Sunday");
        
        //create gym
        Gym gym = new Gym ("Throw back fitness club" , "Royal Avenue, Park Road , Tarlai Kalan , Islamabad" , "0331-8547854", "Usman Amjad", time , admin ,listOfTrainers,listOfTrainees ,listOfMachines,listOfWeights,listOfHandlers , locker); 
       
    
        FrontPage frontPage = new FrontPage (gym);
        frontPage.setVisible(true);
      
         
         
     }
    
     
    
    
}
