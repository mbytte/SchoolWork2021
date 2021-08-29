import javax.swing.*;
import java.util.Random;

public class UltraRPS{
   public static void main(String[] args){
      //making the three main variables
      String rock = "rock";
      String paper = "paper";
      String scissors = "scissors";      
      //making a random string
      //making the array
      String[] arr = {"rock", "paper", "scissors"};
      //making the random object
      Random r = new Random();
      //making a scoreboard
      int wins = 0;
      
      
      //looping event three times
      for (int i = 0; i < 3; i++){
         //gets random integer that is within the array length
         int randomNum = r.nextInt(arr.length);
         //printing out one of the strings in the array using the random number we made previously
         String rand = arr[randomNum];
      
               
         //checking the variables
         //getting user input
         String userInput = JOptionPane.showInputDialog("Rock paper scissors? Input a R/P/S");
         
         //user chooses rock
         if (userInput.equals("R")){
            System.out.println("You have chosen rock");
            //if rand also is rock
            if (rand == "rock"){
               System.out.println("R vs R. You have tied");
            }
            //if rand is scissors
            if (rand == "scissors"){
               System.out.println("R vs S. You have won");
               wins ++;
            }
            //if rand is paper
            if (rand == "paper"){
               System.out.println("R vs P. You have lost");
            }
         }
         
         //user picks paper
         else if (userInput.equals("P")){      
            System.out.println("You have chosen paper");
            //if rand is rock
            if (rand == "rock"){
               System.out.println("P vs R. You have won");
               wins ++;
            }
            //if rand is scissors
            if (rand == "scissors"){
               System.out.println("P vs S. You have lost");
            }
            //if rand is paper
            if (rand == "paper"){
               System.out.println("P vs P. You have tied");
            }
         }
          
         //user pick scissors
         else if (userInput.equals("S")){
            System.out.println("You have chosen scissors");
            //if rand is rock
            if (rand == "rock"){
               System.out.println("S vs R. You have lost");
            }
            //if rand is scissors
            if (rand == "scissors"){
               System.out.println("S vs S. You have tied");
            }
            //if rand is paper
            if (rand == "paper"){
               System.out.println("S vs P. You have won");
               wins ++;
            }            
         }
      }
      //calculating the avg win
      System.out.println("You have won " + wins + " out of 3 matches");
   }
}
                
