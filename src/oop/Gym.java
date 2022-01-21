



package oop;

import java.io.Serializable;
import java.util.ArrayList;




public class Gym implements Serializable
{
    
    String name;
    String address;
    String contactNo;
    String ownerName;
    Timings timings;
    Admin admin;
    ArrayList <Trainer> listOfTrainers;
    ArrayList <Trainee> listOfTrainees;
    ArrayList <Machine> listOfMachines;
    ArrayList <Weight>  listOfWeights;
    ArrayList <HandlingEquipment>  listOfHandlers;
    Locker locker;
    
    public Gym ()
    {
        name = "none";
        address = "none";
        contactNo = "none";
        ownerName = "none";
        admin = null;
        listOfTrainers = new ArrayList <Trainer> ();
        listOfTrainees = new ArrayList <Trainee> ();
        listOfMachines = new ArrayList <Machine> ();
        listOfWeights = new ArrayList <Weight> ();
        listOfHandlers = new ArrayList <HandlingEquipment> ();
        locker = new Locker ();
        
    }
    
  public  Gym (String nme, String ad, String cn, String on,Timings timings, Admin adm ,ArrayList lOTrnrs , ArrayList lOTrnes , ArrayList lOMachns , ArrayList lOWts, ArrayList lOHndlrs , Locker lkr)
    {
        name = nme;
        address = ad;
        contactNo = cn;
        ownerName = on;
        this.timings = timings;
        admin = adm;
        listOfTrainers = lOTrnrs;
        listOfTrainees = lOTrnes;
        listOfMachines = lOMachns;
        listOfWeights = lOWts;
        listOfHandlers = lOHndlrs;
        locker = lkr;
    }
    
    
    //change gym details
    public boolean changeGymInfo (String field, String update)
    {
        if (field.equalsIgnoreCase("name"))
        {
            this.name = update;
            return true;
        }
        else if (field.equalsIgnoreCase("address"))
        {
            this.address = update;
            return true;
        }
        else if (field.equalsIgnoreCase("contactNo"))
        {
            if (update.length() == 12 && update.charAt(0) == '0' && update.charAt(1) == '3' && update.charAt(4) == '-' && HelperMethods.isNumber(update.substring(0,4)) == true && HelperMethods.isNumber(update.substring(5,12)) == true)
            {
                this.contactNo = update;
                return true;
            }
            else
            {
                return false;
            }
            
        }
        else 
        {
            this.ownerName = update;
        }
        return false;
    }
    
    //change admin
    public void changeAdmin (String name, String pswrd)
    {
       Admin ad = new Admin (name,pswrd);
       this.admin = ad;
    }
    
    //add a trainee
    public void addTrainee (String n,String g,String d,String cn,String ad ,String p, String doj , int h , int w  , Trainer tr , String st , String pt)
    {
        Trainee t = new Trainee (n,g,d,cn,ad,p,doj,h,w,tr,st,pt);
        listOfTrainees.add(t);
    }
    
    //remove a trainee
    public boolean removeTrainee (String regno)
    {
        //search trainee in list of trainees, if found delete it
        for (int i = 0 ; i < listOfTrainees.size() ; i++)
        {
            if(listOfTrainees.get(i).regNo.equalsIgnoreCase(regno))
            {
                listOfTrainees.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    //add a trainer
    public void addTrainer (String n, String g, String d, String cn, String ad, String p ,int yoe, String st)
    {
        Trainer t = new Trainer (n,g,d,cn,ad,p,yoe,st);
        listOfTrainers.add(t);
    }
    
    //remove a trainer
    public boolean removeTrainer (String id)
    {
        //search trainer in list of trainers, if found delete it
        for (int i = 0 ; i < listOfTrainers.size() ; i++)
        {
            if(listOfTrainers.get(i).id.equalsIgnoreCase(id))
            {
                listOfTrainers.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    //add machine
    public void addMachine (String n,double p,int q, String t)
    {
        Machine m = new Machine (n,p,q,t); 
        
        if (listOfMachines.indexOf(m) == -1)
        {
            listOfMachines.add(m);
        }
        else
        {
            int index = listOfMachines.indexOf(m);
            listOfMachines.get(index).quantity += q;
        }
    }
    
    //remove machine
    public String removeMachine (Machine m , int quantity)
    {
        if (listOfMachines.indexOf(m) == -1)
        {
            return "Machine Not Found!";
        }
        else
        {
            int index = listOfMachines.indexOf(m);
            if (listOfMachines.get(index).quantity > quantity)
            {
                listOfMachines.get(index).quantity -= quantity;
                return "true";
            }
            else if (listOfMachines.get(index).quantity == quantity)
            {
                listOfMachines.remove(m);
                return "true";
            }
            else
            {
                return "Entered Quantity is greater than the existing Quantity!";
            }
        }
    }
    
    //add weights
    public void addWeights (String n,double p,int q, double w)
    {
        Weight m = new Weight ( n,p,q,w );
        if (listOfWeights.indexOf(m) == -1)
        {
            listOfWeights.add(m);
        }
        else
        {
            int index = listOfWeights.indexOf(m);
            listOfWeights.get(index).quantity += q;
        }
    }
    
    //remove weights
    public String removeWeights (Weight m , int quantity)
    {
        if (listOfWeights.indexOf(m) == -1)
        {
            return "Item Not Found!";
        }
        else
        {
            int index = listOfWeights.indexOf(m);
            if (listOfWeights.get(index).quantity > quantity)
            {
                listOfWeights.get(index).quantity -= quantity;
                return "true";
            }
            else if (listOfWeights.get(index).quantity == quantity)
            {
                listOfWeights.remove(m);
                return "true";
            }
            else
            {
                return "Entered Quantity is greater than the existing Quantity!";
            }
        }
    }
    
    //add handlers
    public void addHandlers (String n,double p,int q)
    {
        HandlingEquipment m = new HandlingEquipment (n,p,q);
        if (listOfHandlers.indexOf(m) == -1)
        {
            listOfHandlers.add(m);
        }
        else
        {
            int index = listOfHandlers.indexOf(m);
            listOfHandlers.get(index).quantity += q;
        }
    }
    
    //remove handlers
    public String removeHandlers (HandlingEquipment m , int quantity)
    {
        if (listOfHandlers.indexOf(m) == -1)
        {
            return "Item Not Found!";
        }
        else
        {
            int index = listOfHandlers.indexOf(m);
            if (listOfHandlers.get(index).quantity > quantity)
            {
                listOfHandlers.get(index).quantity -= quantity;
                return "true";
            }
            else if (listOfHandlers.get(index).quantity == quantity)
            {
                listOfHandlers.remove(m);
                return "true";
            }
            else
            {
                return "Entered Quantity is greater than the existing Quantity!";
            }
        }
    }
    
   
    //find a trainee
    public Trainee findTrainee (String regno)
    {
        for (int i = 0 ; i < listOfTrainees.size() ; i++)
        {
            if (listOfTrainees.get(i).regNo.equalsIgnoreCase(regno))
            {
                return listOfTrainees.get(i);
            }
        }
        return null;
    
    }
    
    //find a trainer
    public Trainer findTrainer (String Id)
    {
        for (int i = 0 ; i < listOfTrainers.size() ; i++)
        {
            if (listOfTrainers.get(i).id.equalsIgnoreCase(Id))
            {
                return listOfTrainers.get(i);
            }
        }
        return null;
    
    }
    
    //find a trainee
    public Trainee findTraineeN (String name)
    {
        for (int i = 0 ; i < listOfTrainees.size() ; i++)
        {
            if (listOfTrainees.get(i).name.equalsIgnoreCase(name))
            {
                return listOfTrainees.get(i);
            }
        }
        return null;
    
    }
    
    //find a trainer
    public Trainer findTrainerN (String name)
    {
        for (int i = 0 ; i < listOfTrainers.size() ; i++)
        {
            if (listOfTrainers.get(i).name.equalsIgnoreCase(name))
            {
                return listOfTrainers.get(i);
            }
        }
        return null;
    
    }
    
}
