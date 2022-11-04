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
//exercise 5 p28
public class ExtractInitials
{
    public static void main(String[] args)
    {
        //variables
        String input = JOptionPane.showInputDialog("Input a name");
        String surname = input.substring(input.lastIndexOf(' '));
        String firstNames = input.substring(0, input.lastIndexOf(' '));
        String initials = "" + firstNames.charAt(0); //adding the first letter of the word because it will definitely be an initial
        int startNum = 0;
        int letterNum = 0;
        
        //getting initials
        while(letterNum < firstNames.length())
        {
            //gets the next letter after a space (beginning of new word)
            if(letterNum == firstNames.indexOf(' ', startNum))
            {
                initials+=firstNames.charAt(letterNum+1);
                //setting startNum to the letter after the case of a space
                startNum = letterNum+2;
            }
            //adding to letterNum
            letterNum++;
        }
        //printing out the initials and the surname together
        System.out.println(initials + surname);
    }
}
