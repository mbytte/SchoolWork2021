/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Meganl
 */
public class TestStoreLoginDetails 
{
    public static void main(String[] args) 
    {
        //variables
        File filepath = new File("data\\loginDetails.txt");
        
        try 
        {
            //giving the writers life
            FileWriter fileWriter = new FileWriter(filepath, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            //adding more users and passwords until the word "STOP" is entered
            String user = JOptionPane.showInputDialog("Enter the username and password. Separate with a space. Enter \"STOP\" when done");
            while(!(user.equals("STOP")))
            {
                //adding the user name and password to the textfile and separating them with a #
                String userDetails = user.substring(0,user.indexOf(" ")) + "#" + user.substring(user.lastIndexOf(" ")+1);
                
                //printing to the text file
                printWriter.println(userDetails);
                
                //getting more users
                user = JOptionPane.showInputDialog("Enter the username and password. Separate with a space. Enter \"STOP\" when done");
            }
            //ending the writers' lives
            fileWriter.close();
            printWriter.close();
            
        } 
        catch (IOException ex) 
        {
            System.out.println("File not found");
        }
    }
}
