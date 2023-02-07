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

//exercise 3 p19; q6
public class EncodeWord
{
    public static void main(String[] args)
    {
        //variables
        String output = "";
        
        //getting input
        String input = JOptionPane.showInputDialog("Enter whatever you'd like");
        
        //running a loop that goes through the whole input character by character
        for(int character = 0; character < input.length(); character++)
        {
            char charAsciiValue = input.charAt(character);
            String charAsString = "" + charAsciiValue;
            
            //checking the character is a vowel
            if(!("aeiou".contains(charAsString)))
            {
                //adding the next ascii character of the current character to the output
                output+=(char)(charAsciiValue +1);
            }
            //if the character is a vowel
            else
            {
                //getting the previous ascii character of the current character into the output
                output+=(char)(charAsciiValue-1);
            }
        }
        
        //printing the output
        System.out.println(output);
    } 
}
