
public class EggSim
{
   public static void main(String[] args)
   {
      //variables
      int totalEggs = 25;
      int totalPower = 0;
      int highestPower = 0;
      int highestPowerDay = 0;
      
      
      //day loop
      for(int day = 1; day <= 7; day++)
      {       
       int numEggs = (int) (Math.random()*(8 - 2) + 2);
       
       //checking if numEggs is bigger than the total amount of eggs left
       if(numEggs > totalEggs)
       {
          numEggs = totalEggs;
       }
              
       //getting total number of eggs left that can hatch
       totalEggs-=numEggs;
                            
       //power types of eggs generated
       String eggType = "";
       int power = 0;
       
                           
       //data for the day
       System.out.println("Day " + day);
       System.out.println("Total Eggs: " + totalEggs);
       System.out.println("Eggs for today:\t" + numEggs);
       for(int j = 0; j < numEggs; j++)
       {
          int randNum = (int)(Math.random()*(4 - 1) + 1);
          if(randNum == 1)
          {
            totalPower+=430;
            eggType = "Elf\t\t";
            power = 430;
          }
          if(randNum == 2)
          {
            totalPower+=320;
            eggType = "Vampire";
            power = 320;
          }
          if(randNum == 3)
          {
            totalPower+=175;
            eggType = "Zombie\t";
            power = 175;
          }
         System.out.println("Egg " + (j+1) + "\t\tType " + eggType + "\t\tPower " + power);
       }
       System.out.println("Total power for the day: " + totalPower);
       
       //day with highest power
       if(totalPower > highestPower)
       {
         highestPower = totalPower;
         highestPowerDay = day;
       }       
              
      
       //egg check
       if(totalEggs == 0)
       {
         break;
       }

       //reset for next day
       totalPower = 0;
       System.out.println();
      }
      
      System.out.println("The day with the highest power is: Day " + highestPowerDay);

   }
}