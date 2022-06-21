/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringCharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meganl
 */
public class Challenge 
{
    public static void main(String[] args) 
    {
        try 
        {
            //creating the scanner of the txt file
            Scanner filesc = new Scanner(new File("data//text.txt"));
                   
            //variables
            int numLettersUC = 0;
            int numLetttersLC = 0;
            int numWhitespace = 0;
            int otherChars = 0;
            
            //loop to go through the whole file
            while(filesc.hasNextLine())
            {
                //variables
                String nextLine = filesc.nextLine();
                
                for(int i = 0; i < nextLine.length(); i++)
                {
                    char character =  nextLine.charAt(i);
                    
                    //checking what type of character it is
                    if(Character.isLetter(character))
                    {
                        //checking if the letter is uppercase or lowercase
                        //uppercase
                        if(Character.isUpperCase(character))
                        {
                            numLettersUC++;
                        }
                        //lowercase
                        else
                        {
                            numLetttersLC++;
                        }
                    }
                    
                    else if(Character.isWhitespace(character))
                    {
                        numWhitespace++;
                    }
                    
                    else
                    {
                        otherChars++;
                    }
                }
                
            }
            
            //display
            System.out.println("Number of lowercase letters: " + numLetttersLC);
            System.out.println("Number of uppercase letters: " + numLettersUC);
            System.out.println("Number of whitespace characters: " + numWhitespace);
            System.out.println("Number of other characters: " + otherChars);
            
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Challenge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
