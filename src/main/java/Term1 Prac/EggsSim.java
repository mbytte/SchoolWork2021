import javax.swing.*;

public class EggsSim
{
   public static int totalEggs = 25;
   public static int totalPower = 0;
   
   
   public static void main(String[] args)
   {
      int eggsRemaining = 25;
      
   }
   
   public static int randomNum()
   {
      int randNum = (int) (Math.random()*(8 - 2) + 2);
      return randNum;
   }
}