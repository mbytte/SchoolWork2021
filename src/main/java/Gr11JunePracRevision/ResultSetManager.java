/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11JunePracRevision;

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
public class ResultSetManager 
{
    private String filePath = "data\\Results.txt";

    public ResultSetManager(String filepath) 
    {
       this.filePath = filepath; 
    }
    
    public void saveResult(String name, String email, int scoreAlg, int scoreGeo, int scoreTrig)
    {
        //making the new object to be stored in the textfile
        ResultSet newResult = new ResultSet(name, email, scoreAlg, scoreGeo, scoreTrig);
        
        try 
        {
            //adding it to the textfile
            FileWriter fw = new FileWriter(filePath);
            PrintWriter pw = new PrintWriter(fw, true);
            
            pw.println(newResult);
            
            //closing the writers
            fw.close();
            pw.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(ResultSetManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public void printRatings()
    {
        //variables
        Scanner fileScanner = new Scanner(filePath);
        Scanner lineScanner = new Scanner(fileScanner.next());
        String highestName = "";
        double highestAvg = -1;
        int numResults = 0; 
        double averageRating = 0;
        
        //OUTPUT
        System.out.println("MATHS APP - ALL RESULTS");
        System.out.println("-----------------------");
        //getting all the results
        while(fileScanner.hasNext())
        {
            numResults++;
            ResultSet currentPerson = new ResultSet(lineScanner.next(), lineScanner.next(), lineScanner.nextInt(), lineScanner.nextInt(), lineScanner.nextInt());
            System.out.println(currentPerson.nameAndRating());
            averageRating+=currentPerson.getRating();
            
            //getting the highest average
            if(currentPerson.getRating() > highestAvg)
            {
                highestName = currentPerson.nameAndRating();
                highestAvg = currentPerson.getRating();
            }
        }
        System.out.println("There were " + numResults + " results with and average rating of " + averageRating/numResults);
        System.out.println("The highest rating was: " + highestName);
        
        
                
    }
}
