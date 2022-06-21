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
public class PastPaperCompareNames 
{
    public static void main(String[] args) 
    {
        //variables
        String input = JOptionPane.showInputDialog("Input a name");
        String mostAlpabetical = input;

        //asking the user to input 5 names and seeing which one is more alphabetical
        for(int i = 0; i < 4; i++)
        {
            //getting input
            input = JOptionPane.showInputDialog("Input a name");
            
            //checking if this name was more alphabetical than the current most alphabetical name
            if(input.compareTo(mostAlpabetical) < 0)
            {
                mostAlpabetical = input;
            }
        }
        
        //output
        System.out.println("The first name alphabetically is " + mostAlpabetical);
    }
}
