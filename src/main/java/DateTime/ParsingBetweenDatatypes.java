/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Meganl
 */
public class ParsingBetweenDatatypes 
{
    public static void main(String[] args) 
    {
        //converting a String date to a LocalDate
        String input = JOptionPane.showInputDialog("Input a date");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMMM YYYY");
        LocalDate date = LocalDate.parse(input, dtf1);
        System.out.println(date.format(dtf2));
    }
    
}
