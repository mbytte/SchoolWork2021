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
//exercise 3 pg 19
public class IsolateChars 
{
    public static void main(String[] args) 
    {
        //q3
        //getting input
        String userInpStr = JOptionPane.showInputDialog("Put a word in");
        
        //displaying the first letter of the word
        System.out.println("The first letter is: " + userInpStr.charAt(0));
        //displaying the last letter of the word
        System.out.println("The last letter is: " + userInpStr.charAt(userInpStr.length() - 1));
        
        //displaying the word backwards
        for(int letter = userInpStr.length() - 1; letter >= 0; letter--)
        {
            System.out.print(userInpStr.charAt(letter));
        }
        //adding a new line
        System.out.println("");
        
        
        
        //displaying the word in a mubo jumbo typa way (1st letter, last letter, 2nd letter, 2nd to last letter, ect)
        //variables
        int lastLetters = userInpStr.length() - 1;
        
        for(int firstLetters = 0; firstLetters <= lastLetters; firstLetters++)
        {
            //breaking the loop when the characters equal each other
            if(firstLetters == lastLetters)
            {
                System.out.println(userInpStr.charAt(firstLetters));
                break;
            }
            //printing out the letters
            System.out.println(userInpStr.charAt(firstLetters));
            System.out.println(userInpStr.charAt(lastLetters));
            lastLetters--;
        }    
        
        
        //finding the middle letter
        //even number
        if(userInpStr.length()%2 == 0)
        {
            System.out.print("Middle letters: " + userInpStr.charAt((userInpStr.length()/2) -1) + userInpStr.charAt(userInpStr.length()/2));
        }
        //odd number
        else
        {
            int middleLetter = userInpStr.length()/2;
            System.out.println("Middle letter: " + userInpStr.charAt(middleLetter));
        }
        
        
        //starting a new line
        System.out.print("Vowels: ");
        //displaying only the vowels
        for(int letter = 0; letter < userInpStr.length(); letter++)
        {
            //making the whole word lowercase
            userInpStr = userInpStr.toLowerCase();
            
            //checking if it has a vowel in it
            if((userInpStr.charAt(letter)) == 'a' || (userInpStr.charAt(letter)) == 'e' || (userInpStr.charAt(letter)) == 'i' || (userInpStr.charAt(letter)) == 'o' || (userInpStr.charAt(letter)) == 'u')
            {
                System.out.print(userInpStr.charAt(letter));
            }
        }
        //starting a new line
        System.out.println("");
        
        
        int numSpaces = 0;
        
        for(int character = 0; character < userInpStr.length(); character++)
        {
            if(Character.isSpaceChar(userInpStr.charAt(character)))
            {
                numSpaces++;
            }
        }
        //printing the number of spaces
        System.out.println("Number of spaces: " + numSpaces);
    }
}
