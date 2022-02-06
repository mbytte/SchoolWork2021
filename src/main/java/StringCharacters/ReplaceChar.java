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
public class ReplaceChar
{
    public static void main(String[] args)
    {
        //variables
        String input = JOptionPane.showInputDialog("Input a sentence");
        int startPosition = 0;
        int letterNum = 0;
        String output = "";
        
        //running through the whole word but only until it reaches a certain character
        while(letterNum < input.length())
        {
            //runs until the first case of  a space is reached from the starting point
            if(letterNum != input.indexOf(" ", startPosition))
            {
                output+=input.charAt(letterNum);
            } 
            //if the character reached is now a space then then a * is added to the output and the startPosition is changed to the letterNum+1 (character after the space)
            else
            {
                output+="*";
                startPosition = letterNum+1;
            }
            letterNum++;
        }
        
        //output
        System.out.println(output);
    }
}
