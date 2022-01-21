package oop;


import java.io.Serializable;
import java.util.ArrayList;
import oop.Person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMAN
 */
public class Trainer extends Person implements Serializable
{
    
    String id;
    private String password;
    int noOfTrainees;
    ArrayList <Trainee>  listOfTrainees;
    double pay = noOfTrainees*2000 + 2000;
    int yearofEmployment;
    int experience;
    String shiftType;
    
    public Trainer()
    {
        super();
        id = "none";
        password = "none";
        noOfTrainees = 0;
        listOfTrainees = new ArrayList ();
        yearofEmployment = 0;
        experience = 0;
        shiftType = "";
       
    }
    
    public Trainer(String n, String g, String d, String cn, String ad, String p ,int yoe, String st)
    {
        super(n,g,d,cn,ad);
        id = generateId();
        password = p;
        noOfTrainees = 0;
        listOfTrainees = new ArrayList ();
        yearofEmployment = yoe;
        experience = calculateExperience(yearofEmployment);
        shiftType = st;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public int calculateExperience(int yoe)
    {
        return 2019-yoe;
    }
    
    public String generateId() 
    {
        String s = "TR.";
        s += (name.substring(0,2)).toUpperCase();
        s += (int)(1000 + Math.random()* 1001);
        return s;
    }
    
    //view all trainees
    public String displayListOfTrainees ()
    {
        String s = "";
        for (int i = 0 ; i < listOfTrainees.size() ; i++)
        {
                s += "\n\n" + listOfTrainees.get(i).toString();
        }
        return s;
    }
    
    //view a trainees record
    public String viewTraineeRecord (String rn)
    {
            //finding the trainee
            int index = -1;
            for (int i = 0 ; i < listOfTrainees.size() ; i++)
            {
                if (listOfTrainees.get(i).regNo.equals( rn ))
                {
                    index = i;
                    break;
                }
            }
            //display data
            if (index != -1)
            {
                return listOfTrainees.get(index).toString();
            }
            else
            {
                return "Trainee Not Found!";
            }
            
    }
    
    //add new trainee
    public boolean addTrainee (Trainee t)
    {
        if (noOfTrainees == 5)
        {
            return false;
        }
        else
        {
            
            listOfTrainees.add(t) ;
            noOfTrainees++;
            return true;
        }
        
    }
    
   
    
    @Override
    public String toString()
    {
        String s = "";
        s += "ID : " + id;
        s += "\nNo Of Trainees Assigned : "+noOfTrainees;
        s += "\nMonthly Pay : "+pay;
        s += "\nYear of Employment : "+yearofEmployment;
        s += "\nExperience : "+experience;
        s += "\nShift Type : "+shiftType;
        s += "\n\nPERSONAL DETAILS\n\n";
        s += super.toString();
        return s;
    }

}
