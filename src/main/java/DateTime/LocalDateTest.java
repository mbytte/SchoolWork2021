/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Meganl
 */
public class LocalDateTest 
{
    public static void main(String[] args) 
    {
        //period = Measures length of time in years,days and months
        //creating the variables
        //localdate can not be made like a normal object but the object gets made when you put in the values in the of thingy majig
        LocalDate bdayDate = LocalDate.of(2005, Month.MAY, 10);
        LocalDate nowDate = LocalDate.now();
        int age = nowDate.getYear() - bdayDate.getYear();
        System.out.println(age);
        
        
        
        //duration = Measures length of time in seconds and nanoseconds
        //comparing two bdays and seeing which came first
        LocalDate bday1Date = LocalDate.of(2005, Month.MAY, 10);
        LocalDate bday2Date = LocalDate.of(2006, Month.JANUARY, 3);
        if(bday1Date.isBefore(bday2Date))
        {
            System.out.println("Megan");
        }
        else
        {
            System.out.println("Gajen");
        }
        
        
        //adding weeks and days to a date (hooray)
        LocalDate now = LocalDate.now();
        LocalDate newDate = now.plusWeeks(3).plusDays(4);
        System.out.println(newDate);
        
        
        
        
    }
}
