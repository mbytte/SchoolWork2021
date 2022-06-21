import it.*;
import javax.swing.*;
import java.awt.*;


public class RandomVolume{
   public static void main(String[] args){
      //making a random integer between 15 and 45(excluding 45)
      int randNum = (int) (Math.random()*(45 - 15) + 15);
      
      //calculating the cone value with a radius of the random integer 
      double coneVolume = 1/3.0 * (Math.PI * Math.pow(randNum,2) * 15.68);
      
      //outputting the cone volume
      System.out.println(coneVolume);
   }
}