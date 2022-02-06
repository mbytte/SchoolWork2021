/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringCharacters;

import javax.swing.JOptionPane;

/**
 *
 * @author megan
 */
//exercise 5 p277
public class LastInList
{
    public static void main(String[] args)
    {
        //variables
        String input = JOptionPane.showInputDialog("Input a name. Enter @@@ to exit");
        String inputLowcase = input.toLowerCase();
        int numNames = 0;
        String alphabetLast = inputLowcase;
     
        //running a loop until @@@ is entered
        while(!(input.equals("@@@")))
        {
            //adding to the number of names
            numNames++;
            
            //chcking if the new word entered is more alphabetically last than the current alphabetically last name
            if(alphabetLast.charAt(0) < inputLowcase.charAt(0))
            {
                alphabetLast = inputLowcase;
            }
            
            //asking for a new name
            input = JOptionPane.showInputDialog("Input a name. Enter @@@ to exit");
            inputLowcase = input.toLowerCase();
        }
        
        //output
        System.out.println("The total number of names entered was: " + numNames + " names");
        System.out.println("The name that was alphabetically last was: " + alphabetLast);
    }
}
