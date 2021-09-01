import javax.swing.*;

public class SwopNum
{
   public static void main(String[] args)
   {
      //input
      String num1Str = JOptionPane.showInputDialog("Give me a value for the first number");
      String num2Str = JOptionPane.showInputDialog("Give me a value for the second number");
      //converting into integers
      int num1 = Integer.parseInt(num1Str);
      int num2 = Integer.parseInt(num2Str);
      
      //swapping the numbers
      //storing the value of num1 into temporary stoarge
      int temp = num1;
      num1 = num2;
      num2 = temp;
      
      System.out.println("The first number is now: " + num1 + " and the second number is now: " + num2);
      
   }
}