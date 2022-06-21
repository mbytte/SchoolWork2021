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
public class AverageNumbers 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        //variables
        String nums = "data\\AverageNums_nums.txt";
        File filepath = new File(nums);
        Scanner numberScanner = new Scanner(filepath);
        int numsSum = 0;
        int numNums = 0;
        
        //looping through all the numbers
        while(numberScanner.hasNext())
        {
            numNums++;
            numsSum+=Integer.parseInt(numberScanner.next());
            
        }
        
        //output
        System.out.println(numsSum/(double)(numNums));
        
        //closing scanner
        numberScanner.close();
    }
}
