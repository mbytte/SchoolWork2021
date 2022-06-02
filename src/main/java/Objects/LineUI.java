/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import javax.swing.JOptionPane;

/**
 *
 * @author Meganl
 */

//activity 1,2,3 p59-61 and exercise 1 p63
public class LineUI 
{
    public static void main(String[] args) 
    {
        //variables - objects
        Line stripe = new Line(10, "*");
        
        
        //horizontal patterns
        stripe.draw();
        //stripe.size = Integer.parseInt(JOptionPane.showInputDialog("Enter stripe size"));
        stripe.draw();
        //stripe.pattern = JOptionPane.showInputDialog("Enter next pattern char");
        stripe.draw();
        
        
        //adding lines to separate patterns
        System.out.println("");
        System.out.println("");
        
        
        //printing out a pattern of stars
        Line starPattern = new Line(10, "*");
        //ORIGINAL CODE BEFORE THE VARIABLES WERE CHANGED TO PRIVATE
        //while(stripe.size > 0)
        //{
        //    stripe.draw();
        //    stripe.size--;
        //}
        //NEW CODE
        int patternLength = starPattern.getLength(starPattern);
        while(patternLength > 0)
        {
            starPattern.draw();
            patternLength--;
            starPattern.setLength(patternLength);
        }
        
        //adding lines to separate patterns
        System.out.println("");
        System.out.println("");
        
        
        //vertical patterns
        stripe.drawVert();
        
       
        //adding lines to separate patterns
        System.out.println("");
        System.out.println("");
        
        
        //creating a C with the line class
        //objects
        Line horizontal = new Line(10, "&");
        Line vertical = new Line(4, "^^");
        
        //drawing the C
        horizontal.draw();
        vertical.drawVert();
        horizontal.draw();
        
        
       
    }
}
