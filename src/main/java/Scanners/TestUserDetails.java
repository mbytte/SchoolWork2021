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
public class TestUserDetails 
{
    public static void main(String[] args) 
    {
        //getting the user to enter their details
        String userDetails = JOptionPane.showInputDialog("Enter your name, surname and age");
        
        //making the scanners
        Scanner detailsScanner = new Scanner(userDetails);
        
        //separating the details
        String name = detailsScanner.next();
        String surname = detailsScanner.next();
        int age = detailsScanner.nextInt();
        
        //displaying details
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
    }
}
