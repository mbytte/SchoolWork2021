/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Meganl
 */
public class CrewMemberManager 
{
    //variables
    private CrewMember[] cArr = new CrewMember[80];
    private int size;

    
    
    //constructor
    public CrewMemberManager() 
    {
        //instantiating (i think) size
        size = 0;
        
        
        //getting the names of the crew members in the textfile and adding them into the array
        try
        {        
            Scanner fileScanner = new Scanner(new File("resources\\crewmembers.txt"));
            //scanning through the text file and adding the objects into their relative types
            while(fileScanner.hasNext())
            {
                //variables
                String lineInUse = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(lineInUse).useDelimiter("#");
                Scanner fieldCounter = new Scanner(lineInUse).useDelimiter("#");
                int fieldCount = 0;
                
                
                //counting the amount of fields that this object will need
                while(fieldCounter.hasNext())
                {
                    fieldCount++;
                    fieldCounter.next();
                }
                
                //adding the objects as their respective fields
                if(fieldCount == 3)
                {
                    cArr[size] = new CrewMember(lineScanner.next(), lineScanner.nextInt(), lineScanner.next());
                }
                else
                {
                    //also need to convert into a date
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    cArr[size] = new Officer(lineScanner.next(), lineScanner.nextInt(), lineScanner.next(), lineScanner.nextInt(), LocalDate.parse(lineScanner.next(), dtf));
                }
                
                
                //closing the scanners in this block
                lineScanner.close();
                fieldCounter.close();
                
                //going onto the next line and increasing the size
                fileScanner.next();
                size++;
            }           
            
        } catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
    }
    
    
    
    //finds a certain crew member based on their crewID
    public int findCrewMember(int crewID)
    {   
        //going through the crew members and seeing if any of them match the ID
        for(int i = 0; i < size; i++)
        {
            if(cArr[i].getCrewID() == crewID)
            {
                return i;
            }
        }
        
        return -1;
    }
    
    
    
    //gives a crewmember a certain number based upon their details
    public void processTestResults()
    {
        
    }
    
    
    
    //toString
    @Override
    public String toString() 
    {
        //variables
        String output = "";
        //going through the array and adding their info
        for(int i = 0; i < size; i++)
        {
            output += cArr[i].toString() + "\n";
        }
        return output;
    }
}
