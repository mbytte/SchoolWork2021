//exercise 1 pg 128 Q6
import javax.swing.*;

public class EasterAlgorithm
{
   public static void main(String[] args)
   {
      //variables
      String yearStr = JOptionPane.showInputDialog("Which year do you want to know the date of Easter?");
      int yearInt = Integer.parseInt(yearStr);
      int a, b, c, d, e, f, g;
      
      //algorithm(who even knows why or how you do what you do, point is that it works)
      a = yearInt - 1900;
      b = a % 19;
      c = (7*b + 1)/19;
      d = (11*b + 4 - c) % 29;
      e = a/4;
      f = (a + e + 31 - d) % 7;
      g = 25 - d - f;
      
      if(g > 0)
      {
         System.out.println("Easter is on the " + g + " April");
      }
      
      else
      {
         System.out.println("Easter is on the " + g + " March");
      }
     
   }
}