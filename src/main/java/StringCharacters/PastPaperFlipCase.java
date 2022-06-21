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
public class PastPaperFlipCase 
{
    public static void main(String[] args) 
    {
        //variables
        String input = JOptionPane.showInputDialog("Input a string containing uppercase and lowercase letters");
        String output = "";
        
        //looping through each character in the string
        for(int charNum = 0; charNum < input.length(); charNum++)
        {
            //if the character is lowercase, it is changed to an uppercase and added to the output
            if(Character.isLowerCase(input.charAt(charNum)))
            {
                output+=Character.toUpperCase(input.charAt(charNum));
            }
            //if the character is uppercase, it is changed to a lowecase and added to the output
            else
            {
                output+=Character.toLowerCase(input.charAt(charNum));
            }
        }
        
        //output
        System.out.println(output);
    }
}
