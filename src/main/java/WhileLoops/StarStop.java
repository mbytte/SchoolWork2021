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

//pg186
public class StarStop 
{
    public static void main(String[] args) 
    {
        String userInput = JOptionPane.showInputDialog("Enter a character. Enter a * when you want to stop(or be stuck in a loop FOREVER)");
        int count = 0;
        
        while(!(userInput.equals("*")))
        {
            count++;
            userInput = JOptionPane.showInputDialog("Enter a character. Enter a * when you want to stop(or be stuck in a loop FOREVER)");        
        }
        System.out.println("The loop ran " + count + " times");
    }
}
