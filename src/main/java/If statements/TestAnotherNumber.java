import javax.swing.*;

public class TestAnotherNumber
{
   public static void main(String[] args)
   {  
      //variables
      String inpNumStr = JOptionPane.showInputDialog("Give me any number");
      int inpNumInt = Integer.parseInt(inpNumStr);
      
      //positive or negative
      if(inpNumInt > 0)
      {
         System.out.println("The number is positive");
         
      }
      else
      {
         System.out.println("The number is negative");
      }
      
      //odd or even
      if(inpNumInt % 2 == 0)
      {
         System.out.println("The number is even");
      }
      else
      {
         System.out.println("The number is odd");
      }
      
      //multiple of seven or not
      if(inpNumInt % 7 == 0)
      {
         System.out.println("The number is a multiple of 7");
      }
      else
      {
         System.out.println("The number is not a multiple of 7");
      }
   }
}