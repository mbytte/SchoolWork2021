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
public class ConvertDate 
{
    public static void main(String[] args) 
    {
        String dateInp = JOptionPane.showInputDialog("Give me a date in the form of DDMMYY");
        
        //variables
        char letter1OfDate = dateInp.charAt(4);
        char letter2OfDate = dateInp.charAt(5);
        String output = "";
        //converting the date to be YYMMDD
        for(int i = 0; i < 6; i++)
        {
            output+=letter1OfDate;
            output+=letter2OfDate;
            
            letter1OfDate-=2;
            letter2OfDate-=2;
        }
        
        //printing the output
        System.out.println(output);
    }
}
