/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamPractice2021;

import javax.swing.JOptionPane;

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
        
        //running through five rounds
        for(roundNum = 1; roundNum <= 5; roundNum++)
        {
            oneRound();
            
            //changing the variables position for the next round
            gardenerPos = (int) (Math.random()*(5 - 1) + 1);
            plantPos = (int) (Math.random()*(10 - 6) + 6);
            hasWater = false;
        }     
    }
    
    //round method
    public static void oneRound()
    {
        //variables
        int numMoves = 0;
        
        //drawing the scene
        drawGarden();
        
        //input
        String userChoice = JOptionPane.showInputDialog("What do you want to do?\nL: Move left\nR: Move right\nF: Fill up\nW: Water plant\nQ: Quit");
        String action = userChoice.toUpperCase();
        
        //runs the code until Q is entered
        while(!(action.equals("Q")))
       {
           //changing the farmer positions depedning on what the user inputted
           //moving left
           if(action.equals("L") && gardenerPos!=1)
           {
               gardenerPos-=1;
           }
           else if(action.equals("R") && gardenerPos!=10)
           {
               gardenerPos+=1;
           }
           //filling the watering can
           if(action.equals("F") && (gardenerPos == 1))
           {
               hasWater = true;
           }
          //watering the plant(completing the game)
          if(action.equals("W") && (gardenerPos == plantPos))
          {
              //adding to numMoves
              numMoves++;
              //displaying a completed round message
              System.out.println("");
              System.out.println("ROUND OVER");
              System.out.println("The number of moves is " + numMoves);
              System.out.println("");
              break;   
          }
           
           //updating the garden
           drawGarden();
           
           //asking for input
           action = JOptionPane.showInputDialog("What do you want to do?\nL: Move left\nR: Move right\nF: Fill up\nW: Water plant\nQ: Quit");
           action = action.toUpperCase();
           
           //adding to numMoves
           numMoves++;
       }
    }
    
    //draw garden method
    public static void drawGarden()
    {
        //printing the round number
        System.out.println("Round: " + roundNum + "\tWatering can fill: " + hasWater);
        
        //output variable
        String gardenString = "W ";
        for(int i = 1; i <= 10; i++)
        {
            //setting the positions of varibiales into the output string
            if(i == gardenerPos)
            {
                gardenString+="G ";
            }
            else if(i == plantPos)
            {
                gardenString+="P ";
            } 
            else
            {
                gardenString+="_ ";
            }
        }
        //moving to the next line
        System.out.print(gardenString);
        System.out.println("");
    }
}
