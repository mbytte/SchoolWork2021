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
public class PastPaperRemoveChars 
{
    public static void main(String[] args) 
    {
        //variables
        String input = JOptionPane.showInputDialog("Enter a sentence");
        String unwantedChars = JOptionPane.showInputDialog("Now, enter any characters you don't want to see in the string you entered");
        String output = "";
        
        //running a loop that will run though all the characters and then removing any of the unwanted characters
        for(int charNum = 0; charNum < input.length(); charNum++)
        {
           //if the char in this loop is in the unwantedChars string, then it is not added to the output string
           if(!(unwantedChars.contains(input.charAt(charNum) + "")))
           {
               output+=input.charAt(charNum);
           }
        }
        
        //printing the output
        System.out.println(output);
    }
}
