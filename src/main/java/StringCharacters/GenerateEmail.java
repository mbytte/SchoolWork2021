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
public class GenerateEmail 
{
    //doesnt work
    public static void main(String[] args) 
    {
        //variables
        String input = JOptionPane.showInputDialog("Input full name").toLowerCase();
        String firstName = input.substring(0, input.indexOf(' '));
        String lastName = input.substring(0, input.lastIndexOf(' ') + 1);
        
        //printing out the email
        System.out.println(lastName.substring(0, 4) + firstName.substring(0, 4) + "26@sundryhighschool.co.za");
    }
}
