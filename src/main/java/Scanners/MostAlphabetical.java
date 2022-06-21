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
public class MostAlphabetical 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        //variables
        String names = "data\\MostAlphabetical_names.txt";
        File filepath = new File(names);
        Scanner nameScanner = new Scanner(filepath);
        String mostAlphabetical = nameScanner.nextLine();
        
        //getting the most alphabetical name
        while(nameScanner.hasNextLine())
        {
            String currentName = nameScanner.nextLine();
            if(mostAlphabetical.compareTo(currentName) > 0)
            {
                mostAlphabetical = currentName;
            }
        }
        
        //output
        System.out.println(mostAlphabetical);
        
        //closing scanner
        nameScanner.close();
    }
}
