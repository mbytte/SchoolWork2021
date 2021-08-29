import javax.swing.*;

public class NumsDivide
{
   public static void main(String[] args)
   {  
      //variables
      String num1Str = JOptionPane.showInputDialog("Give me a number");
      String num2Str = JOptionPane.showInputDialog("Give me a number");
      double num1 = Double.parseDouble(num1Str);
      double num2 = Double.parseDouble(num2Str);
      
      //will only run if num2 does not equal 0
      if(num2 != 0)
      {
         System.out.println("num1 divided by num2 = " + num1/num2);
      }
      
      
   }
}