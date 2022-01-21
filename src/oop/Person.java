
package oop;

import java.io.Serializable;
import java.util.Scanner;



public abstract class Person implements Serializable
{
    String name;
    int age;
    String gender;
    String dob;
    String contactNo;
    String address;
    
    public Person()
    {
        name = "none";
        age = 0;
        gender = "none";
        dob = "none";
        contactNo = "none";
        address = "none";
    }
    
    
    public Person(String n,String g,String d,String cn,String ad)
    {
        name = n;
        dob = d;
        age = calculateAge(dob);
        gender = g;
        contactNo = cn;
        address = ad;
    }
    
    
    public void setName(String name) 
    {
        if (HelperMethods.isAlpha(name) == true)
        {
            this.name = name;
        } 
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public void setAge() 
    {
        this.age = calculateAge(dob);
    }
    
    public void setDob(String dOB) 
    {
        
        if (dOB.length() == 10 && dOB.charAt(2) == '/' && dOB.charAt(5) == '/' &&  HelperMethods.isNumber(dOB.substring(0,2)) == true && HelperMethods.isNumber(dOB.substring(3,5)) == true && HelperMethods.isNumber(dOB.substring(6,10)) == true && Integer.parseInt(dOB.substring(0,2)) <= 31 && Integer.parseInt(dOB.substring(3,5)) <= 12 && Integer.parseInt(dOB.substring(6,10)) <= 2018 && Integer.parseInt(dOB.substring(6,10)) > 1910 )
        {
            this.dob = dOB;
        }
        
    }

    
    public void setContactNo(String cellNo) 
    {
        if (cellNo.length() == 12 && cellNo.charAt(0) == '0' && cellNo.charAt(1) == '3' && cellNo.charAt(4) == '-' && HelperMethods.isNumber(cellNo.substring(0,4)) == true && HelperMethods.isNumber(cellNo.substring(5,12)) == true)
        {
            this.contactNo = cellNo;
        }
        
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }
    
    
    
    public int calculateAge (String dob)
    {
        return (2019 - Integer.parseInt(dob.substring(6,10)));
    }
    
    @Override
    public String toString()
    {
        String s = "";
        s += "\nName : "+name;
        s += "\nAge : "+age;
        s += "\nGender : "+gender;
        s += "\nDate of Birth : "+dob;
        s += "\nContact no : "+contactNo;
        s += "\nAddress : "+address;
     
        return s;
    }
  
}



   


        
        
        
        
        
        
        