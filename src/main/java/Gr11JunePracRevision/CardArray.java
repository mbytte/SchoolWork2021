/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gr11JunePracRevision;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class CardArray
{
    //variables
    private Card[] cArr = new Card[20];
    private int size;
    
    public CardArray()
    {
        try
        {
            //Variables
            Scanner fileScanner = new Scanner(new File("resources\\Cards.txt"));
            
            //running through each line in the textfile and creating a new object out of it
            while(fileScanner.hasNext())
            {
                Scanner lineScanner = new Scanner(fileScanner.nextLine()).useDelimiter(";");
                cArr[size] = new Card(lineScanner.next(), lineScanner.next(), lineScanner.nextInt(), lineScanner.nextInt(), lineScanner.nextInt(), lineScanner.nextInt());
                size++;
                lineScanner.close();
            }
            
            //closing the scanners
            fileScanner.close();

        } 
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
    }

   
    //looks through the array for a matching card
    public Card search(String name)
    {
//        for(int i = 0; i < size; i++)
//        {
//            if((cArr[i].getName().equals(name)))
//            {
//                return cArr[i];
//            }
//        }
//        return cArr[size+1];
        //variables
        int low = 0;
        int high = size;
        int middle = 0;
        boolean found = false;
        while((low <= high) && !found)
        {
            middle =(low+high)/2;
            if(cArr[middle].getName().compareTo(name) < 0)
            {
                low = middle +1;
            }
            else if(cArr[middle].getName().compareTo(name) > 0)
            {
                high = middle-1;
            }
            else
            {
                found = true; 
            }
        }
        return cArr[middle];
    }
    
    
    //compares the two cards and sees who has the highest points
    public String playCards(String c, String c2)
    {
        //variables
        Card card1 = search(c);
        Card card2 = search(c2);
        
        //checking who has the highest points
        if(card1.calcPoints() > card2.calcPoints())
        {
            return "Battle " + LocalDate.now() + "\n" + card1 + "\n" + card2 + "\n" + c + " wins with " + card1.calcPoints(); 
        }
        else
        {
            return "Battle " + LocalDate.now()  + "\n" + card1 + "\n" + card2 + "\n" + c2 + " wins with " + card2.calcPoints(); 
        }    
    }
    
    
    @Override
    public String toString()
    {
        //variables
        String output = "";
        //running through each object in the array and running the toString method on them
        for(int i = 0; i < size; i++)
        {
            output += cArr[i].toString() + "\n";
        }
        return output;
    }
    
    
    //sorting the card objects in alphabetical order
    public void sort()
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = i+1; j < size; j++)
            {
                //getting the names of the two objects
                String name1 = cArr[i].getName();
                String name2 = cArr[j].getName();
                
                //comparing the names and seeing which one is the most alphabetical
                if(name1.compareTo(name2) > 0)
                {
                    Card temp = cArr[i];
                    cArr[i] = cArr[j];
                    cArr[j] = temp;
                }
            }
        }
    }
}
