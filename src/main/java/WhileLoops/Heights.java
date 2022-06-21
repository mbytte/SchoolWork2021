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

//pg186
public class Heights 
{
    public static void main(String[] args) 
    {
        //variables
        double tallestHeight = 0;
        double shortestHeight = 0;
        
        //input
        String heightStr = JOptionPane.showInputDialog("What is the height?");
        double heightDbl = Double.parseDouble(heightStr);
        shortestHeight = heightDbl;
        
        //looping until a negative number is inputted
        while(heightDbl > 0)
        {
            //adding do data
            if(heightDbl > tallestHeight)
            {
                //rounding off to 1 decimal place
                double roundedHeight =  (Math.round(heightDbl*10))/10.0;
                tallestHeight = roundedHeight;
            }
            if(heightDbl < shortestHeight)
            {
                shortestHeight = heightDbl;
            }
            //getting more input 
            heightStr = JOptionPane.showInputDialog("What is the height?");
            heightDbl = Double.parseDouble(heightStr);
        }
        
        //printing out tallest person
        System.out.println(tallestHeight);
        System.out.println(shortestHeight);
    }
}
