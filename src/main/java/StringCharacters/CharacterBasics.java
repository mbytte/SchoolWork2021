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

//exercise 1 p5
public class CharacterBasics 
{
    public static void main(String[] args) 
    {
        //white space is any code that, when run, will perform a specific function rather than just being printed. 
        //e.g. /t: /n
        
        
        
        //Q3
        Character.isDigit(0); //determines if the character type is a digit
        Character.isLetterOrDigit(0); //determines if the character type is a digit or letter
        Character.isJavaIdentifierPart(0); //determines if the charachter is an identifier
        Character.toLowerCase(0); //switches the character to the lowercase version of it
        Character.isWhitespace(0); //checks if the character is whitespace
        
        
        
        //Q4
        String inputStr = JOptionPane.showInputDialog("Input a character");
        
        //variables
        char input = inputStr.charAt(0);
        int numLetters = 0;
        int numDigits = 0;
        int otherChars = 0;
        
        //adding to the quantities
        if(Character.isLetter(input))
        {
            numLetters++;
        }
        else if(Character.isDigit(input))
        {
            numDigits++;
        }
        else
        {
            otherChars++;
        }
        
        //creating a loop until the letter "x" is inputted
        while((input != 'x') || (input != 'X'))
        {
            //adding to the quantities
            if(Character.isLetter(input))
            {
                numLetters++;
            }
            else if(Character.isDigit(input))
            {
                numDigits++;
            }
            else
            {
                otherChars++;
            }  
        }
    }
}
