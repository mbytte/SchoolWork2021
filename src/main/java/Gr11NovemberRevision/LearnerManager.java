/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11NovemberRevision;

import DateTime.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meganl
 */
public class LearnerManager 
{
    private Learner[] learnerArr = new Learner[50];
    private int learnerCount;

    
    //constructor
    public LearnerManager() 
    {
        try
        {
            //connecting to the text file
            Scanner fileScanner = new Scanner(new File("resources\\exxcursions.txt"));
            
            //going through the textfile and adding it to the array
            while(fileScanner.hasNext())
            {
                //scanner
                Scanner lineScanner = new Scanner(fileScanner.next()).useDelimiter("#");
                
                //gathering info
                String learnerName = lineScanner.next();
                //act1
                String act1Name = lineScanner.next();
                double act1Cost = lineScanner.nextDouble();
                LocalDate act1Date = LocalDate.parse(lineScanner.next());
                Activity act1 = new Activity(act1Name, act1Cost, act1Date);
                //act2
                String act2Name = lineScanner.next();
                double act2Cost = lineScanner.nextDouble();
                LocalDate act2Date = LocalDate.parse(lineScanner.next());
                Activity act2 = new Activity(act2Name, act2Cost, act2Date);
                
                //creating user
                Learner currentUser = new Learner(learnerName, act1, act2);
                learnerCount++;
                
                //closing scanner
                lineScanner.close();
            }
            
            //closing scanner
            fileScanner.close();
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
    }
    
    
    //overrides the learner code
    public void overrideLearnerCode()
    {
        
    }
    
    
    //sorts the learners in a certain way
    public void sort()
    {
        
    }
    
    
    //gets the average cost of all the learners
    public double getAverageCost()
    {
        
    }
    
    
    //gets the highest cost out of all the learners
    public double getHighestCost()
    {
        
    }
    
    
    //gets the lowest cost out of all the learners
    public double getLowestCost()
    {
        
    }
    
    
    //displays all the learners information
    public void displayLearners()
    {
        
    }
    
    
    //displays a summary of all the information about the learners acquired
    public void displaySummary()
    {
        
    }
}
