/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamPractice;

/**
 *
 * @author Meganl
 */
public class SuperGardener 
{
    //class variables
    public static int gardenerPos;
    public static int plantPos;
    public static boolean hasWater;
    public static int roundNum;
    
    
    //main method
    public static void main(String[] args)
    {
        //initialising variables
        gardenerPos = 3;
        plantPos = 5;
        hasWater = false;
        roundNum = 1;
        
        oneRound();
    }
    
    //round method
    public static void oneRound()
    {
        drawGarden();
    }
    
    //draw garden method
    public static void drawGarden()
    {
        //printing the round number
        System.out.println("Round: " + roundNum + "\tWatering can fill: " + hasWater);
        
        //output variable
        String gardenString = "W ";
        for(int i = 0; i > 10; i++)
        {
            //setting the positions of varibiales into the output string
            if(i == gardenerPos)
            {
                gardenString+="G ";
            }
            if(i == plantPos)
            {
                gardenString+="P ";
            }
            gardenString+="_ ";
        }
    }
}
