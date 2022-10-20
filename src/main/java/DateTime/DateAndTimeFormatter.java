/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Meganl
 */
public class DateAndTimeFormatter 
{
    public static void main(String[] args) 
    {
        //variables
        LocalDateTime day = LocalDateTime.now();
        //creates the formats of which the date will be presented
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MM-YY");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd MMMM YYYY");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd MMM YY");
        
        //getting the day to be in the chosen format and printing it out into that format
        System.out.println(day.format(dtf1));
        System.out.println(day.format(dtf2));
        System.out.println(day.format(dtf3));
        System.out.println(day.format(dtf4));
        
        
        
        
    }
}
