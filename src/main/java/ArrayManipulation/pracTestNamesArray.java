/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meganl
 */
public class pracTestNamesArray 
{
    //class varaiables
    private String[] names;
    private int size;

    
    //constructor
    public pracTestNamesArray() 
    {
        //initialising
        names = new String[100];
        size = 0;
        
        try 
        {
            //getting the file and scanning the file to get the names in it to put it into an array
            Scanner fileScanner = new Scanner(new File("resources\\names.txt"));
            
            while(fileScanner.hasNext())
            {
                names[size] = fileScanner.next();
                size++;
            }
        } catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
    }

    
    //sorts the names in ascending order
    public void sort()
    {
        for(int sortedIndex = size-1; sortedIndex > 0; sortedIndex--)
        {
            for(int currentIndex = 0; currentIndex < sortedIndex; currentIndex++)
            {
                if(names[currentIndex].compareTo(names[currentIndex+1]) > 0)
                {
                    String temp = names[currentIndex+1];
                    names[currentIndex+1] = names[currentIndex];
                    names[currentIndex] = temp;
                }
            }
        }
    }
    
    
    //searches for a name and returns the index of where it is situated
    public int search(String name)
    {
        //variables
        int start = 0;
        int end = size-1;
        
        //going through all the numbers
        while(start <= end)
        {
            int middle = (start+end)/2;
            
            if(names[middle].compareTo(name) == 0)
            {
                return middle;
            }
            
            else if(names[middle].compareTo(name) > 0)
            {
                end = middle - 1;
            }
            
            else
            {
                start = middle+1;
            }
        }
        return -1;
    }
    
    
    //inserts into the string
    public void insert(String name)
    {
        
    }
    
    
    //finds and deletes a name
    public void delete(String name)
    {
        
    }
    
    
    @Override
    public String toString() 
    {
        String name = "";
        
        for(int i = 0; i < size; i++)
        {
            name += names[i] + " ";
        }
        
        return name;
    } 
}
