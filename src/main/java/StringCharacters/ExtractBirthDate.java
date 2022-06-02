/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringCharacters;

import javax.swing.JOptionPane;

/**
 *
 * @author Meganl
 */
public class ExtractBirthDate 
{
    public static void main(String[] args) 
    {
        //variables
        String inputID = JOptionPane.showInputDialog("Enter ID number");
        String birthDayID = inputID.substring(0, 6);
        int centuryNum = Integer.parseInt(inputID.substring(0, 2));
        
        //getting the century
        //20th century if the year is above or equal to 50
        if(centuryNum >= 50)
        {
            centuryNum = 19;
        }
        //21st century if the year is below 50
        else
        {
            centuryNum = 20;
        }
        
        //printing out the birthday
        System.out.println("" + birthDayID.substring(4, 6) + "/" + birthDayID.substring(2, 4) +  "/" + centuryNum + birthDayID.substring(0,2));
    }
}
