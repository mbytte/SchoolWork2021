/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Meganl
 */
public class AverageNum 
{
    public static void main(String[] args) 
    {
        //variables
        int[] numArray = {1, 2, 3, 4, 5};
        double avg = 0;
        
        //getting the average
        for(int i = 0; i < 5; i++)
        {
            avg+=numArray[i];
        }
        
        //displaying average
        System.out.println(avg/5.0);
        
        
    }
}
