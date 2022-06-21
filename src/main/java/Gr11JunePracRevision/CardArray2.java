/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gr11JunePracRevision;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class CardArray2
{
    //variables
    private Card2[] cArr = new Card2[20];
    private int size;

    
    //constuctor
    public CardArray2()
    {
        try
        {
            //creating the file scanner
            Scanner fileScanner = new Scanner(new File("resources\\Cards.txt"));
            
            while(fileScanner.hasNext())
            {
                //making the line scanner
                Scanner lineScanner = new Scanner(fileScanner.nextLine()).useDelimiter(";");
                //adding a new card2 object to the array
                cArr[size] = new Card2(lineScanner.next(), lineScanner.next(), lineScanner.nextInt(), lineScanner.nextInt(), lineScanner.nextInt(), lineScanner.nextInt());
                size++;
                
                //closing scanner
                lineScanner.close();
            }
            //closing scanner
            fileScanner.close();
        } 
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
    }

    @Override
    //displays each card in the array
    public String toString()
    {
        //variables
        String output = "";
        
        //running through the array
        for(int i = 0; i < size; i++)
        {
            output += cArr[i].toString() + "\n";
        }
        
        return output;
    }
    
   
    //sorts the cards into alphabetical order
    public void sort()
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = i+1; j < size; j++)
            {
                if(cArr[i].toString().compareTo(cArr[j].toString()) > 0)
                {
                    Card2 temp = cArr[i];
                    cArr[i] = cArr[j];
                    cArr[j] = temp;
                }
            }
        }
    }
    
    
}
