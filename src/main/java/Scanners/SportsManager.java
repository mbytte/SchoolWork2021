/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Meganl
 */
public class SportsManager 
{
    private static String filepath = "data\\SportsManager.txt";
    
    //printing all the players that is in the textfile
    public static String readPlayers()
    {
        //variables
        String output = "";
        File sportsInfo = new File(filepath);
        
        
        try 
        {
            Scanner fileScanner = new Scanner(sportsInfo).useDelimiter("\n");
            
            //going through each line of information
            while(fileScanner.hasNextLine())
            {
                //getting the text from a particular line
                String line = fileScanner.next();
                Scanner lineScanner = new Scanner(line).useDelimiter("#");
                
                //going through everything in the line and adding them to the ouput
                for(int i = 0; i < 3; i++)
                {
                    output+= lineScanner.next() + " ";
                }
                
                //going onto the next line
                output+="\n";
                //closing the lineScanner
                lineScanner.close();
            }
        
            //closing the fileScanner
            fileScanner.close();
        } 
        catch (FileNotFoundException ex) 
        {
            
            System.out.println("File not found");
        }

        return output;
    }
    
    
    //writing to the text file
    public static void addPlayer()
    {
        try 
        {
            //variables
            FileWriter fileWriter = new FileWriter(filepath);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            String playerName = JOptionPane.showInputDialog("What is the name of the new player");
            String age = JOptionPane.showInputDialog("What is the age of the new player");
            String sportType = JOptionPane.showInputDialog("What is the sport type of the new player");
            
            //printing to the file
            printWriter.print(playerName + "#" + age + "#" + sportType + "\n");
            
            //closing the writers
            fileWriter.close();
            printWriter.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("File not found");
        }
    }
}
