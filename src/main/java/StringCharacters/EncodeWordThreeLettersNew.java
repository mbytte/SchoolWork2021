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
public class EncodeWordThreeLettersNew 
{
    public static void main(String[] args) 
    {
        //output
        String input = JOptionPane.showInputDialog("Give word");
        String output = "";
        
        //variables
        String firstLettersOrig = input.substring(0,3);
        String lastLettersOrig = input.substring(3);
        
        //converting to the next letters of the last letters
        for(int letterNum = 0; letterNum < lastLettersOrig.length(); letterNum++)
        {
            //getting the ascii value
            int nextAsciiNum = lastLettersOrig.charAt(letterNum) + 1;
            
            //adding to the output
            output+=(char)(nextAsciiNum);
        }
        //converting to the next letters of the first letters
        for(int letterNum = 0; letterNum < 3; letterNum++)
        {
            //getting the ascii value
            int nextAsciiNum = firstLettersOrig.charAt(letterNum) + 1;
            
            //adding to the output
            output+=(char)(nextAsciiNum);
        }
        System.out.println(output);
    }
}
