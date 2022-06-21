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
public class AvgGirlsNames 
{
    public static void main(String[] args) 
    {
        int overallNameLength = 0;
        int numNames = 0;
        
        //input
        String name = JOptionPane.showInputDialog("Enter a name");
        
        while(!(name.equals("*")))
        {  
            //adding to variables if the name is not *
            numNames++;
            int nameLength = name.length();
            overallNameLength+=nameLength;  
            
            //getting more input
            name = JOptionPane.showInputDialog("Enter a name");             
        }
        
        //calculating avererage name length
        double average =overallNameLength/numNames;
        System.out.println("The average name length is: " + average);
        
    }
}
