/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Meganl
 */
public class DurationAndPeriod 
{
    public static void main(String[] args) 
    {
        //comparing the date of today and a birthday to get the age
        LocalDate myBday = LocalDate.of(2005, Month.MAY, 10);
        LocalDate today = LocalDate.now();
        Period age = Period.between(myBday, today); //order matters: myBday - today = age
        System.out.println("I am " + age.getYears()+ " years, " + age.getMonths() + " months and " + age.getDays() + " days old");
        
        
        
        //comparing times to see what the duration between them is
        LocalTime appointmentTime = LocalTime.of(16, 30, 0, 0); //16:30
        LocalTime now = LocalTime.now();
        Duration timeToGo = Duration.between(now, appointmentTime);//order matters: appointmentTime - now = duration
        System.out.println("My appointment is " + timeToGo.toSeconds() + " seconds from now");
        
        //converting into a time object in order to get the hours, minutes and seconds in a duration of time
        long seconds = timeToGo.toSeconds();
        //If there is 7 hours, 15 minutes and 12 seconds to go
        //this time object will be set to 07:15:12.
        LocalTime t = LocalTime.ofSecondOfDay(seconds);
        System.out.println("My appointment is " + t.getHour() + " hours, " + t.getMinute() + " minutes and " + t.getSecond() + "seconds away from now");
    }
}
