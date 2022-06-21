import javax.swing.*;

public class TempConv
{
   public static void main(String[] args)
   {
      //input
      String celcStr = JOptionPane.showInputDialog("What is the temperature in celcius?");
      double c = Double.parseDouble(celcStr);
      
      //calculating into farenheit
      double f = (9*c)/5.0+32;
      
      System.out.println("The temperature in Farenheit is: "+ f);
   }
}