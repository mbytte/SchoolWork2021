/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author megan
 */
public class pracTestNameArray
{
     String[] names;
     int size;

    public pracTestNameArray()
    {
        names = new String[100];
        size = 0;
        try
        {
            //going through the texxtfile and adding it to the array
            Scanner fileScanner = new Scanner(new File("resources\\names.txt"));
            
            while(fileScanner.hasNext())
            {
                names[size] = fileScanner.next();
                size++;
            }
            
            fileScanner.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
    }

    public void sort()
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = i+1; j < size; j++) 
            {
                if(names[i].compareTo(names[j]) > 0)
                {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    }
    
    public int search(String name)
    {
        for(int i = 0; i < size; i++)
        {
            if(names[i].compareTo(name)==0)
            {
                return i;
            }    
        }
        return -1;
    }
    
    public void insert(String name)
    {
        int index = -1;
        for(int i = 0; i < size; i++)
        {
            if(names[i].compareTo(name) > 0) //if names[i] is less alphabetical than name
            {
                index = i;
                break;
            }
        }
        shiftRight(index);
        names[index] = name;
        size++;
    }
    private void shiftRight(int index)
    {
        for(int i = size; i >= index; i--)
        {
            names[i+1] = names[i];
        }
    }    
    
    public void delete(String name)
    {
        int index = search(name);
        if(index >=0)
        {
            shiftLeft(index);
        }
    }
    private void shiftLeft(int index)
    {
        for(int i = index; i < size; i++)
        {
            names[i] = names[i+1];
        }
        size--;
    }
    
    
    @Override
    public String toString()
    {
        String nameStr = "";
        for(int i = 0; i < size; i++)
        {
            nameStr+= names[i] + " ";
        }
        return nameStr;
    }
    
    
}
