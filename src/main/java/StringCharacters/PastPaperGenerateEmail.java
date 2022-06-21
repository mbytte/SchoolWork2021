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
public class PastPaperGenerateEmail 
{
    public static void main(String[] args) 
    {
        //variables
        String input = JOptionPane.showInputDialog("Input full name").toLowerCase();
        String email = input.substring(0, input.indexOf(' ')) + "." + input.substring(input.lastIndexOf(' ')+1) + "@reddam.house";
        
        //printing the email
        System.out.println(email);
    }
}