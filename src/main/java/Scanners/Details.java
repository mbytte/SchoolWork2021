/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Meganl
 */

//exercise 1 p36
public class Details 
{
    public static void main(String[] args) 
    {
        //variables
        //source
        String inputDetails = JOptionPane.showInputDialog("Enter your name, ID number, height in meters, and whether you smoke or not(true/false). Leave a space between every concept");
        //scanner
        Scanner sc = new Scanner(inputDetails);
        
        //printing out each item in the string
        System.out.println("Name: " + sc.next());
        System.out.println("ID number: " + sc.nextInt());
        System.out.println("Height(m): " + sc.nextDouble());
        System.out.println("Smokes(true/false): " + sc.nextBoolean());
        
    }
}
