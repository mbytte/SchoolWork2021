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
        int letter1OfDate = 4; //the position of the first number in the months/days/year part of the date
        char letter2OfDate = 5; //the position of the first number in the months/days/year part of the date
        String output = "";
        
        //converting the date to be YYMMDD
        for(int i = 0; i < 3; i++)
        {
            //only adds the number to the date if it is not  0
            if(dateInp.charAt(letter1OfDate) != '0')
            {
                output+=dateInp.charAt(letter1OfDate);
            }
            //only adds the number to the date if it is not  0
             if(dateInp.charAt(letter2OfDate) != '0')
            {
                output+=dateInp.charAt(letter2OfDate);
            }
            //adding a / to the end of the year and month, but not the day (becuase day is at the end of the string so you don't need a slash there
            if(i != 2)
            {
                output+="/";
            }
            
            //subtracting 2 so the letter1OfDate will be the first letter of the month or year part of the data; and the same for letter2OfDate
            letter1OfDate-=2;
            letter2OfDate-=2;
        }
        
        //printing the output
        System.out.println(output);
    }
}
