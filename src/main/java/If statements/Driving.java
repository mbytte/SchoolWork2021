//exercise 2 pg 134
import javax.swing.*;

public class Driving
{
   public static void main(String[] args)
   {
      //variables
      String ageStr = JOptionPane.showInputDialog("What is your age");
      int ageInt = Integer.parseInt(ageStr);
      
      //age check
      if(ageInt >= 18 && ageInt <= 75)
      {
         System.out.println("You are in the correct age limit to drive");
      }
      
      if(ageInt < 18)
      {
         System.out.println("You are too young to drive");
      }
      
      if(ageInt > 75)
      {
         System.out.println("You are too old to drive");
      }
   }
}