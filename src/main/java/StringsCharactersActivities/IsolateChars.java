/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsCharactersActivities;

import javax.swing.JOptionPane;

/**
 *
 * @author megan
 */
public class IsolateChars
{
    public static void main(String[] args)
    {
        //variables
        String input = JOptionPane.showInputDialog("Input a word");
        
        
        //printing the first and last letters of the word
        System.out.println("First letter: " + input.charAt(0));
        System.out.println("Last letter: " + input.charAt(input.length()-1));
        
        
        //displaying the word backwards
        for(int letterNum = input.length()-1; letterNum > -1; letterNum--)
        {
            System.out.print(input.charAt(letterNum));
        }
        //leaving a line
        System.out.println("");
        
        
        //displaying the 1st letter then the last, then the 2nd letter, then the 2nd last, ect.
        int lastLetters = input.length()-1;
        int firstLetters = 0;
        while(lastLetters >= firstLetters)
        {
            //checking if there is any more letters than that
            if(lastLetters == firstLetters)
            {
                System.out.println(input.charAt(firstLetters));
                break;
            }
            else
            {
                //printing out the letters
                System.out.println(input.charAt(firstLetters));
                System.out.println(input.charAt(lastLetters));
                //getting the nextl letters
                firstLetters++;
                lastLetters--;
            }   
        }
        
        
        //displaying the middle characters
        //even amount of characters
        if(input.length()%2 == 0)
        {
            System.out.println("Middle characters:" + input.charAt(input.length()/2 - 1) + input.charAt(input.length()/2));
        }
        //odd number of characters
        else
        {
            System.out.println("Middle character:" + input.charAt(input.length()/2));
        }
        
        
        //displaying only the vowels in the string and getting the amount of spaces in the string
        //variables
        String output = "";
        int numSpaces = 0;
        for(int letterNum = 0; letterNum < input.length(); letterNum ++)
        {
            //only adding to the output if the current letter is not a vowel
            if(!("aeiou".contains(input.charAt(letterNum) + "")))
            {
                output+=input.charAt(letterNum);
            }
            //checking if the current character is a space
            if(Character.isSpaceChar(input.charAt(letterNum)))
            {
                numSpaces++;
            }
        }
        //printing the output
        System.out.println(output);
        System.out.println("Number of spaces: " + numSpaces);
    }
}
