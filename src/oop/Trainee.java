package oop;

import java.io.Serializable;


public class Trainee extends Person implements Serializable
{
    String regNo;
    String password;
    String dateofjoining;
    int height;
    int weight;
    double monthlyFee;
    double fine;
    Trainer trainer;
    String sessionType;
    String ProgramType;
    
    
    public Trainee()
    {
        super();
        regNo = "none";
        password = "none";
        dateofjoining = "none";
        height = 0;
        weight = 0;
        monthlyFee = 0;
        fine = 0;
        trainer = null;
        sessionType = "none";
        ProgramType = "none";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Trainee (String n,String g,String d,String cn,String ad ,String p, String doj , int h , int w  , Trainer tr , String st , String pt)
    {
        super(n,g,d,cn,ad);
        regNo = generateRegNo();
        password = p;
        dateofjoining = doj;
        height = h;
        weight = w;
        fine = 0;
        trainer = tr;
        sessionType = st;
        ProgramType = pt;
        monthlyFee = calculateMonthlyFee();
    }
    

    public void setDateofjoining(String doj) 
    {
        
        if (doj.length() == 10 && doj.charAt(2) == '/' && doj.charAt(5) == '/' &&  HelperMethods.isNumber(doj.substring(0,2)) == true && HelperMethods.isNumber(doj.substring(3,5)) == true && HelperMethods.isNumber(doj.substring(6,10)) == true && Integer.parseInt(doj.substring(0,2)) <= 31 && Integer.parseInt(doj.substring(3,5)) <= 12 && Integer.parseInt(doj.substring(6,10)) >= 2019  )
        {
           this.dateofjoining = dateofjoining;
        }
        
    }

    public void setHeight(String height) 
    {
        
        if (height.length() == 3 && HelperMethods.isNumber(height.substring(0,3)) == true)
        {
            this.height = Integer.parseInt(height);
        }
    }

    public void setWeight(String weight) 
    {
        
        if (weight.length() >= 2 && weight.length() <= 3 && HelperMethods.isNumber(weight.substring(0)) == true)
        {
            this.weight = Integer.parseInt(weight);
        }
        
    }

    public void setMonthlyFee() 
    {
        
        
            this.monthlyFee = calculateMonthlyFee();
        
        
    }

    public void setFine(String fine) 
    {
        
        if (HelperMethods.isNumber(fine.substring(0)) == true && Integer.parseInt(fine) >= 0)
        {
            this.fine = Integer.parseInt(fine);
        }
        
    }

    public void setTrainer(Trainer trainer) 
    {
        this.trainer = trainer;
    }

    public void setSessionType(String sessionType) 
    {
        this.sessionType = sessionType;
    }

    public void setProgramType(String ProgramType) 
    {
        this.ProgramType = ProgramType;
    }
        
    public String generateRegNo() 
    {
        String s = "";
        s += (name.substring(0,2)).toUpperCase();
        s += (int)(1000 + Math.random()* 1001);
        return s;
    }
    
    public double calculateMonthlyFee ()
    {
        double fee = 0;
        //basic service charges
        fee += 500 ;
        //program charges
        if (this.ProgramType.equalsIgnoreCase("Weight loss"))
        {
            fee += 500;
        }
        
        else if (this.ProgramType.equalsIgnoreCase("Muscle Gain"))
        {
            fee += 300;
        }
        
        else
        {
            fee += 200;
        }
        //Teenager discount 
        if (Integer.parseInt(this.dob.substring(6,10)) >= 2001)
        {
            fee -= 200;
        }
        //trainer charges 
        if (this.trainer != null)
        {
            fee += 2000;
        }
        //morning session discount
        if (this.sessionType.equalsIgnoreCase("Morning"))
        {
            fee -= 200;
        }
        
        return fee;
    }
    
    
    public void addFine (double f)
    {
        fine += f;
    }
     
    @Override
    public String toString()
    {
     
        String s = "";
        s += "Registartion No : " + regNo;
        s += "\nPassword : " + password;
        s += "\nDate of Joining : "+dateofjoining;
        s += "\nFee Monthly : "+monthlyFee;
        s += "\nFine : " + fine;
        s += "\nSession Type : "+sessionType;
        s += "\nProgram Type : "+ProgramType;
        if (trainer != null)
        {
        s += "\nTrainer's name : "+trainer.name;
        }
        s += "\nHeight : " + height;
        s += "\nWeight : " + weight;
        s += "\n\nPERSONAL DETAILS\n\n";
        s += super.toString();
     
        return s;
    }

    
    
}
