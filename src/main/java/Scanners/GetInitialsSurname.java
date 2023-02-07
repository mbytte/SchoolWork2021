/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Meganl
 */
public class GetInitialsSurname 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        //variables
        String names = "data\\MostAlphabetical_names.txt";
        File filepath = new File(names);
        Scanner fileScanner = new Scanner(filepath);
        String output = "";
        
        while(fileScanner.hasNextLine())
        {
            //variables
            //adding the name on that current line to be its own singular string
            String currentName = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(currentName);
            
            //adds the first initial of the first word and the last work
            output += "" + currentName.charAt(0) + " " + currentName.substring(currentName.lastIndexOf(" ")) + "\n"; 
            //output += lineScanner.next().charAt(0)+ " " + lineScanner.next();
            
            //closing scanner
            lineScanner.close();
        }
        
        //output
        System.out.println(output);
        
        //closing scanner
        fileScanner.close();
        
    }
}
