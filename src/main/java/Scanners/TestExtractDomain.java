/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meganl
 */
public class TestExtractDomain 
{
    public static void main(String[] args) 
    {
        //variables
        File filepath = new File("data\\websites.txt");
        
        //making a scanner if the file is found
        try 
        {
            //variables
            Scanner fileScanner = new Scanner(filepath).useDelimiter("\n");            
            int numWebsites = 0;
            
            //extracting the domain of an x number of websites
            while(fileScanner.hasNext())
            {
                String line = fileScanner.next();
                Scanner lineScanner = new Scanner(line).useDelimiter(".");
                
                //adding to the number of websites
                numWebsites++;
                
                //outputting the domain of the website
                String domain = lineScanner.next();
                System.out.println(domain);
                
                //closing the scanner
                lineScanner.close();
            }
            
            //printing the number of websites scanned
            System.out.println("Number of websites scanned: " + numWebsites);
            //closing scanners
            fileScanner.close();
            
        } 
        //file not found
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
    }
}
