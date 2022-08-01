/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class PersonManager
{
    private Person[] personArray = new Person[100];
    private int size = 0;

    public PersonManager()
    {
        //cycling through a textfile and adding the data to the array
        try
        { 
            Scanner fileScanner = new Scanner(new File("resources\\people.txt"));
            
            //cycling through the text file and addinf the data into the array as a Person object
            while(fileScanner.hasNext())
            {
                Scanner lineScanner = new Scanner(fileScanner.next()).useDelimiter("#");
                personArray[size] = new Person(lineScanner.next(), lineScanner.next(), lineScanner.nextInt());
                size++;
            }
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
    }
    
    //binary search
    public int binarySearch(String name)
    {
        int start = 0;
        int end = size-1;
        
        while(start <= end)
        {
            int middle = (start+end)/2;
            String middlePersonName = personArray[middle].getName();
                    
            if(middlePersonName.compareTo(name)==0)
            {
                return middle;
            }
            
            else if(middlePersonName.compareTo(name)<0)
            {
                end = middle-1;
            }
            
            else if(middlePersonName.compareTo(name)>0)
            {
                start = middle + 1;
                end = size -1;
            }
        }
        
        //can't find any person object with that same name
        return 0;
    }
        
     
    //insertionSort (name)
    public void insertionSort()
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = i+1; j < size; j++)
            {
                //varaibles to hold the value of the names of the objects in the indexes
                String name1 = personArray[i].getName();
                String name2 = personArray[j].getName();
                
                if(name1.compareTo(name2)>0)
                {
                    Person temp = personArray[i];
                    personArray[i] = personArray[j];
                    personArray[j] = temp;
                }
            }
        }
    }
    
    
    //adding to a sorted array
    public void insert(String name, String surname, int age) 
    {
        int index = -1; //is -1 because if it doesn't exist then the index will still be -1 which is impossible
        for (int i = 0; i < size; i++) 
        {
            //comparing the names to try and get the index where the new person needs to be inserted
            if (personArray[i].getName().compareTo(name) > 0) 
            {
                index = i;
                break;
            }
        }
        //shifting everything first and then inserting the new object into the position where it needs to be
        shiftRight(index);
        personArray[index] = new Person(name, surname, age);
    }
    //moves everything to the right
    private void shiftRight(int index) 
    {
        size++;
        //moves from the outside to the inside
        for (int i = size - 1; i > index; i--) 
        {
            personArray[i] = personArray[i - 1];
        }
    }
    
    
    //deleting from an array
    public void delete(String name) 
    {
        //looks for the index where the name is and then overwrited that data from that index onwards
        int index = binarySearch(name);
        if (index >= 0) 
        {
            shiftLeft(index);
        }
    }
    //helper method that overwrites data
    private void shiftLeft(int index) 
    {
        for (int i = index; i < size - 1; i++) 
        {
            personArray[i] = personArray[i + 1];
        }
    size--;
    }
    
    
    //bubble sort (age)
    public void ageSort()
    {
        for(int i = size - 1; i > 0;i--)
        {
            for(int j = 0; j < i; j++)
            {
                //variables that retrieve the ages of the objects in the indexes
                int age1 = personArray[j].getAge();
                int age2 = personArray[j+1].getAge();
                
                //swapping the two objects depending on which of their ages are smaller
                if(age1>age2)
                {
                    Person temp = personArray[j];
                    personArray[j] = personArray[j+1];
                    personArray[j+1] = temp;
                }   
            }
        }
    }
}
