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

//pg188
//trick question. NOT a while loop
public class ThreeLetterWords 
{
    public static void main(String[] args) 
    {
        //only going to run 5 times
        for(int i = 0; i<5; i++)
        {
            //getting inputted words
            String inputWord = JOptionPane.showInputDialog("Type any three letter word.");
            
            //check if the word is three letters
            int inputWordLength = inputWord.length();
            if(!(inputWordLength==3))
            {
                //amazing, informative very very nice message
                System.out.println("You need to learn how to count. That was not 3 letters, idiot");
                break;
            }
            
            //printing out the three letter word
            System.out.println(inputWord);
        }
    }
}
