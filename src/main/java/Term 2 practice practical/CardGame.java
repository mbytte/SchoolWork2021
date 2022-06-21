import javax.swing.*;

public class CardGame
{
   public static void main(String[] args)
   {
      //variables
      String name = "";
      double totalPoints = 0;
      double overallPoints = 0;
      double highestPoint = 0;
      String highestPointPlayer = "";
      int numCharacters = 0;
      
      for(int characterNum = 1; characterNum <= 7; characterNum++)
      {   
         numCharacters++;      
         //character name
         String characterName = JOptionPane.showInputDialog("What is the name of the character");
         
         //type(light;dark;support)
         int type = (int)(Math.random()*(4 - 1) + 1);
         String side = "";
         if(type == 1)
         {
            side = "Light";
         }
         else if(type == 2)
         {
            side = "Dark";
         }
         else
         {
            side = "Support";
         }
         
         //displaying data
         System.out.println(); 
         System.out.println();
         System.out.println("Name: " + characterName + " - " + side + " side");
         
         //card data
         for(int i = 0; i < 3; i++)
         {
            //attack and defense points
            int attack = (int)(Math.random()*(6 - 1) + 1);
            int defense = (int)(Math.random()*(6 - 1) + 1);
            
            //luck factor
            int numLetters = characterName.length();
            double luckFactor = (Math.round((numLetters/3.5) * 10))/10.0;
           
            //points
            double points = (attack + defense) * luckFactor;
            
            //totalpoints
            totalPoints+=points;
            
            //displaying data
            System.out.println("Attack: " + attack + "\t\tDefense: " + defense + "\t\tLuck: " + luckFactor + "\t\tPoints: " + points);              
         }
         
         //overallPoints
         overallPoints+=totalPoints;
         
         //displaying the points
         System.out.println("Total Points: " + totalPoints + "\t\tSum of all character points: " + overallPoints);
         
         //player with the highest point
         if(totalPoints > highestPoint)
         {
            highestPoint = totalPoints;
            highestPointPlayer = characterName;
         }
         
         //breaking the loop if overallPoints is above 100
         if(overallPoints >= 100)         
         {
            break;
         }
         
         
         //reset
         totalPoints = 0;
         
         
      }
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("Card with the most points is: " + highestPointPlayer + " with " + highestPoint);
      System.out.println("There were " + numCharacters + " characters.");
   }
}