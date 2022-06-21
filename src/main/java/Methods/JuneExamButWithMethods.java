/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author jilly
 */
public class JuneExamButWithMethods
{
    //overall game variables
    public static int highestAttackDamage = 0;
    public static int highestAttackLevel = 0;
    public static int wins = 0;
    public static int level;
    
    public static void main(String[] args)
    {
        //levels
        for(level = 1; level <= 10; level++)
        {
            //level variables
            int levelMultiplier = RandomNumber(3, 1);
            int bossHealth = BossHealth(level, levelMultiplier);
            int maxBossHealth = bossHealth;
            
            
            //print for each level
            System.out.println("");
            System.out.println("");
            System.out.println("Level: " + level);
            System.out.println("Boss Total Health: " + maxBossHealth);
            
            
            //attacks
            Attack(maxBossHealth, bossHealth);
        }
        
        //seperating this from the rest of the results to make it look pretty
        System.out.println("");
        System.out.println("");
        //printing the highest damage and what level it was obtained on
        System.out.println("Highest attack damage was " + highestAttackDamage + " on level " + highestAttackLevel);
        //overall game win or lose
        OverallWinOrLoseCheck();
    }

    
    //random number method
    public static int RandomNumber(int max, int min)
    {
        //random number(inclusive)
        int random = (int)(Math.random()*((max+1) - min) + min);
        return random;
    }

    
   //boss health method
    public static int BossHealth(int level, int levelMultiplier)
    {
        //boss health formula
        int bossHealth = level * 10 * levelMultiplier;
        return bossHealth;
    }
    
    
    //attacks method
    public static void Attack(int maxBossHealth, int bossHealth)
    {   
        //attack variables
        String attackType = "";
        int totalAttackDamage = 0;
        int attackDamage = 0;
        
        //loop to run 4 different attacks
        for(int attackNum = 1; attackNum <= 4; attackNum++)
        {
            //random number generated
            int numGenerated = RandomNumber(5, 1);
            //attack strength
            if(numGenerated == 1)
            {
               attackType = "Miss";
               attackDamage = 0;
            }
            else if(numGenerated == 5)
            {
               attackType = "Critical";
               attackDamage = maxBossHealth/2;
               totalAttackDamage+=attackDamage;
            }
            else
            {
               attackType = "Normal";
               attackDamage = numGenerated * 15; 
               totalAttackDamage+=attackDamage;
            }
            
            //printing out results from each attack
            System.out.println("Attack: " + attackNum + "\tAttack Type: " + attackType + "\tAttack damage: " + attackDamage);
            
        }
        
        //printing out final results
        System.out.println("Total Attack Damage: " + totalAttackDamage);
        WinCheck(bossHealth - totalAttackDamage);
        //checking to see if a new highest damage was obtained
        HighestDamage(level, totalAttackDamage);
    }
    
    
    //Win/lose method
    public static void WinCheck(int finalbossHealth)
    {
        //lose
        if(finalbossHealth > 0)
        {
            //printing the health left
            System.out.println("Boss health remaining: " + finalbossHealth);
            System.out.println("Level Lost");
        }    
        //win
        else
        {
            System.out.println("Boss health remaining: 0");
            System.out.println("Boss defeated!");
            wins++;
        }
    }
    
    
    //highest damage check
    public static void HighestDamage(int level, int attackDamage)
    {
        if(attackDamage > highestAttackDamage)
        {
            highestAttackDamage = attackDamage;
            highestAttackLevel = level;
        }
                
    }
    
    //overallGame methods
    public static void OverallWinOrLoseCheck()
    {   
        //printing out number of wins
        System.out.println("You won " + wins + " times out of 10");
        //win
        if(wins >= 8)
        {
            System.out.println("You win!");
        }
        //lose
        else
        {
            System.out.println("You lose!");
        }
    }
}
