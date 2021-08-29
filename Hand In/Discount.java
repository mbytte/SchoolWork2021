//exercise 2 pg 134
import javax.swing.*;

public class Discount
{
   public static void main(String[] args)
   {
      String purchasePriceStr = JOptionPane.showInputDialog("What is the cost of the purchase?");
      double purchasePriceInt = Double.parseDouble(purchasePriceStr);
      
      if(purchasePriceInt>100)
      {
         double newPrice = purchasePriceInt - (purchasePriceInt * 0.1);
         System.out.println("The new cost with a 10% discount is R" + newPrice);
      }
   }
}