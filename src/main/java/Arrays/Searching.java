/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Meganl
 */
public class Searching 
{
    //arrays
    public static int[] sortedArr = {1,2,3,4,5,6,7,8,9,10}; //used for the binary search because a binary search has to happen on a sorted array
    public static int[] arr = {3, 5, 7, 1, 6, 9, 10, 52}; //used for the linear searc
    
    public static void main(String[] args) 
    {
         //searching for the indexes of the numbers that are in the thingy
        System.out.println(linearSearch(9));
        System.out.println(binarySearch(1));
    }
    
    //binary search - always has to be done on a sorted array
    public static int binarySearch(int inputNum)
    {
        //variables
        int start = 0;
        int end = sortedArr.length-1;
        
        //going through all the numbers
        while(start <= end)
        {
            int middle = (start+end)/2;
            
            if(sortedArr[middle] == inputNum)
            {
                return middle;
            }
            
            if(sortedArr[middle] > inputNum)
            {
                end = middle - 1;
            }
            
            if(sortedArr[middle] < inputNum)
            {
                start = middle+1;
            }
        }
        return -1;
    }
    
    
    //normal search
    public static int linearSearch(int inputNum)
    {
       //run through the array
       for(int i = 0; i < arr.length-1; i++)
       {
           if(arr[i] == inputNum)
           {
               return i;
           }
       }
       
       //incident where there is no number like that in the array
       return -1;
    }
}
