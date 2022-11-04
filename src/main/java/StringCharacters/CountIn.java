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
public class CountIn
{
    public static void main(String[] args)
    {
        //variables
        String input = JOptionPane.showInputDialog("Enter a sentence");
        int startPos = 0;
        int letterNum = 0;
        int numIns = 0;
        int num = input.indexOf("in", startPos);
        
        while(letterNum < input.length())
        {
            //finding the number of "in"s in the sentence inputted
            if(letterNum == input.indexOf(" in ", startPos))
            {
                numIns++;
                startPos = letterNum+2;
            }
            letterNum++;
        }
        
        //output
        System.out.println(numIns);
    }
}
