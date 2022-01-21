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
public class Timings implements Serializable
{
    String morningS;
    String morningE;
    String eveningS;
    String eveningE;
    String holiday;
    
    public Timings ()
    {
         morningS = "";
         morningE = "";
         eveningS = "";
         eveningE = "";
         holiday = "";
    
    }
    
    public Timings (String ms , String me, String es , String ee , String h )
    {
         morningS = ms+"AM";
         morningE = me+"AM";
         eveningS = es+"PM";
         eveningE = ee+"PM";
         holiday = h;
    }

    public void setMorningS(String morningS) {
        this.morningS = morningS;
    }

    public void setMorningE(String morningE) {
        this.morningE = morningE;
    }

    public void setEveningS(String eveningS) {
        this.eveningS = eveningS;
    }

    public void setEveningE(String eveningE) {
        this.eveningE = eveningE;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }
    
    
    
}
