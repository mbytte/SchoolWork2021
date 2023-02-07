/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoops;

import javax.swing.JOptionPane;

/**
 *
 * @author Meganl
 */

//pg187
public class Rainfall 
{
    public static void main(String[] args) 
    {
        //variables
        int totalRainfall = 0;
        int maxRainfall = 0;
        int maxRainfallDay = 0;
        int day = 0;
        
        //input 
        String rainInput = JOptionPane.showInputDialog("How much rain was there today");
        int rainInputInt = Integer.parseInt(rainInput);
        
        while(rainInputInt >= 0)
        {
            day++;
            totalRainfall+=rainInputInt;
            
            if(rainInputInt > maxRainfall)
            {
                maxRainfall = rainInputInt;
                maxRainfallDay = day;
            }
            
            //getting more input
            rainInput = JOptionPane.showInputDialog("How much rain was there today");
            rainInputInt = Integer.parseInt(rainInput);
        }
        
        //getting average rainfall
        double average = totalRainfall/day;
        
        //displaying data
        System.out.println("The total rainfall was " + totalRainfall);
        System.out.println("The average is " + average);
        System.out.println("The max rainfall is " + maxRainfall + " on day "  + maxRainfallDay);
    }
}
