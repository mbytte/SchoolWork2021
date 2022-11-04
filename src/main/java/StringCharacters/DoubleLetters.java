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

//exercise 3 p19
public class DoubleLetters 
{
    public static void main(String[] args) 
    {
        //getting input
        String input = JOptionPane.showInputDialog("Give a word");
        
        //variables
        char prevLetter = input.charAt(0);
        String output = "" + prevLetter;
        
        //getting rid of the double letters
        for(int i = 0; i < input.length(); i++)
        {
            char currentLetter = input.charAt(i);
            if(currentLetter != prevLetter)
            {
                output+=currentLetter;
            }
            //setting the current letter to the prev letter for next loop
            prevLetter = currentLetter;
        }
        
        //output
        System.out.println(output);
    }
}
