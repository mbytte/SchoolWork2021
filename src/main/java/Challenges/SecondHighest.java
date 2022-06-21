import javax.swing.*;

public class SecondHighest
{
   public static void main(String[] args)
   {
      String num1Str = JOptionPane.showInputDialog("Give me any number");
      String num2Str = JOptionPane.showInputDialog("Give me any number");
      String num3Str = JOptionPane.showInputDialog("Give me any number");
      int num1 = Integer.parseInt(num1Str);
      int num2 = Integer.parseInt(num2Str);
      int num3 = Integer.parseInt(num3Str);
      int secHighest = 0;
      
      if(num1 > num2 && num1 < num3)
      {
         secHighest = num1;
      }
      
      if(num1 < num2 && num1 > num3)
      {
         secHighest = num1;
      }
      
      if(num2 > num1 && num2 < num3)
      {
         secHighest = num2;
      }
      
      if(num2 < num1 && num2 > num3)
      {
         secHighest = num2;
      }
      
      if(num3 > num1 && num3 < num2)
      {
         secHighest = num3;
      }
      
      if(num3 < num1 && num3 > num2)
      {
         secHighest = num3;
      }

      System.out.println("The second highest number is " + secHighest);
   }
}