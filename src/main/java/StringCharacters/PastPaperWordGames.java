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
public class PastPaperWordGames 
{
    public static void main(String[] args) 
    {
        //variables
        String lastWordEntered = JOptionPane.showInputDialog("Input a word");
        String currentWord = JOptionPane.showInputDialog("Give me another word");
        int numPoints = 0;
        
        //running the loop until the last letter of the first word and first letter of the original word don't match up
        while(lastWordEntered.charAt(lastWordEntered.length()-1) == currentWord.charAt(0))
        {
            //adding to the number of points
            numPoints++;
            
            //setting the current word to the last word entered
            lastWordEntered = currentWord;
            
            //getting more input
            currentWord = JOptionPane.showInputDialog("Give me another word");
        }
        
        //output
        System.out.println("You got " + numPoints + " point/s!");
    }
}
