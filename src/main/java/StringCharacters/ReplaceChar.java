/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringCharacters;

import javax.swing.JOptionPane;

/**
 *
 * @author megan
 */
//exercise 5 p28
public class ReplaceChar
{
    public static void main(String[] args)
    {
        //variables
        String input = JOptionPane.showInputDialog("Enter a sentence");
        int spacePosition = input.indexOf(" ");
        
        //getting the areas where there is a space and replacing them with a *
        //makes a substring out of the first word up until the first space and then adds the rest of the string at the end of it
        input = input.substring(0, spacePosition) + "*" + input.substring(spacePosition+1); 
        //while there are spaces in input, do stuff (because if there is no more spaces then indexOf returns a -1)
        while(input.indexOf(" ", spacePosition) > 0)
        {
            //makes a substring out of the first words up until the nect space and then adds the rest of the string to the end of the string (this happens until all the spaces are replaced)
            input = input.substring(0, spacePosition) + "*"+ input.substring(spacePosition+1);
            //setting a new index of the first space because it will change with every loop because the spaces are getting replaced
            spacePosition = input.indexOf(" ");
        }
        
        //output
        System.out.println(input);
    }
}
