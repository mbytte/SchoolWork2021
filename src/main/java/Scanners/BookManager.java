/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

/**
 *
 * @author Meganl
 */
public class BookManager 
{   
    //file path to the text file
    public static String filePath = "src\\main\\resources\\books.txt";
 
    
    //get books method
    //gets the information in the text file
    public static String getBooks()
    {
        String output = "";
        try 
        {
            //makes a scanner for the file in file path
            File textfile = new File(filePath);
            //while loop to run as long as there is something to be run after each thing
            try (Scanner fileScanner = new Scanner(textfile))
            {
                //while loop to run as long as there is something to be run after each thing
                while (fileScanner.hasNextLine())
                {
                    //runs each line in the text file
                    String line = fileScanner.nextLine();
                    
                    //processes each line
                    //a scanner to scan through each line; delimiter is somnething that tells the coputer what to read
                    Scanner lineScanner = new Scanner(line).useDelimiter("#");
                    String name = lineScanner.next();
                    String author = lineScanner.next();
                    //output
                    output += "Book: " + name + " Author: " + author + "\n";
                    
                    lineScanner.close();
                }
                //closing the file scanner so other methods and applications can use the folder that the scanner is using
            }
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
        
        
        return output;
    }
    
    //writing into a text file
    public static void NewBook(String book, String author)
    {
        try 
        {
            FileWriter fw = new FileWriter(filePath,true);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(book + "#" + author);
            pw.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("File not found");
        }
        
    }
}
