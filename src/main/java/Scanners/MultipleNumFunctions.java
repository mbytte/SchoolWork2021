/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Meganl
 */
public class MultipleNumFunctions 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        //variables
        String nums = "data\\AverageNums_nums.txt";
        File filepath = new File(nums);
        Scanner numberScanner = new Scanner(filepath);
        int numsSum = 0;
        int numNums = 0;
        int highestNum = 0;
        int lowestNum = 0;
        
        //looping through all the numbers to get the sum of the numbers
        while(numberScanner.hasNext())
        {
            //variables
            int currentNum = Integer.parseInt(numberScanner.next());
            
            //getting average and sum methods
            numNums++;
            numsSum+=currentNum;
            
            //getting the highest number
            if(currentNum > highestNum)
            {
                highestNum = currentNum;
            }
            
            //getting the lowest number
            //*****
        }
        
        //output
        //average
        System.out.println("Average:" + numsSum/(double)(numNums));
        
        //closing scanner
        numberScanner.close();
    }
}
