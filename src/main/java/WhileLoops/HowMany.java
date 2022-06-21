/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoops;

/**
 *
 * @author Meganl
 */

//pg187
public class HowMany 
{
    public static void main(String[] args) 
    {
        //HowMany 1
        //variables
        int increment = 2;
        double num = 2;
        String sum = "2";
        int quantityOfNums = 1;
        
        //runs until num is greater that 610
        while(num<610)
        {
            quantityOfNums++;
            num+= increment;
            increment+=3;
            sum+=" + " + increment;            
        }
        
        //output
        System.out.println("Number of numbers needed to get to 610: " + quantityOfNums);
        System.out.println("Sum: " + sum);
        
        
        
        //Howmany2
        double denominator = 2.0;
        num = 1/2.0;
        sum = "1/2.0";
        quantityOfNums = 1;
        
        //runs until num is greater than 6
        while(num<6)
        {
            quantityOfNums++;
            num+= 1/denominator;
            denominator+=1.0;
            sum+=" + " + "1/" + denominator;            
        }
        
        //output
        System.out.println("Number of numbers needed to get to 6: " + quantityOfNums);
        System.out.println("Sum: " + sum);
    }
}
