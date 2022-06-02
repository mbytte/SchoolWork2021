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
    public static void main(String[] args) 
    {
        //variables
        String nums = "data\\numbers.txt";
        File filepath = new File(nums);
        
        //creating array
        int[] arr = makeArray(filepath);
        int[] sortedArr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(normalSearch(arr, 9));
        System.out.println(binarySearch(sortedArr, 10));
    }
    
    //makes array out of textfile
    public static int[] makeArray(File f)
    {
        int[] arr = new int[10];
        try 
        {
            //variables
            Scanner numberScanner = new Scanner(f);
            
            //making an array
            for(int i = 0; i < arr.length-1; i++)
            {
                arr[i] = numberScanner.nextInt();
            }
            //closing the scanner
            numberScanner.close(); 
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Searching.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //returning the array
        return arr;
    }
    
    
    //binary search
    public static int binarySearch(int[] arr, int inputNum)
    {
        //variables
        int start = 0;
        int end = arr.length-1;
        
        //going through all the numbers
        while(start <= end)
        {
            int middle = (start+end)/2;
            
            if(arr[middle] == inputNum)
            {
                return middle;
            }
            
            if(arr[middle] > inputNum)
            {
                end = middle - 1;
            }
            
            if(arr[middle] < inputNum)
            {
                start = middle+1;
                end = arr.length-1;
            }
        }
        return -1;
    }
    
    
    //normal search
    public static int normalSearch(int[] arr, int inputNum)
    {
       //run through the array
       for(int i = 0; i < arr.length-1; i++)
       {
           if(arr[i] == inputNum)
           {
               return i;
           }
       }
       
       return -1;
    }
}
