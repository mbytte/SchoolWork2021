//exercise 2 p134
import javax.swing.*;

public class LargerOfTwo
{
   public static void main(String[] args)
   {
      //variables
      String inpNum1Str = JOptionPane.showInputDialog("Give me a number");
      String inpNum2Str = JOptionPane.showInputDialog("Give me another number");
      int inpNum1 = Integer.parseInt(inpNum1Str);
      int inpNum2 = Integer.parseInt(inpNum2Str);
      int subtractedNum = inpNum1 - inpNum2;
      
      //checking which number is bigger
      if(subtractedNum > 0)
      {
         System.out.println("The first number you inputted is bigger that the second number");
      }
      else if(subtractedNum < 0)
      {
         System.out.println("The second number you inputted is bigger that the first number");
      }
      else
      {
         System.out.println("The two numbers you inputted are equal");
      }
   }
}