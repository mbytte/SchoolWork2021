import javax.swing.*;

public class CalcPrice
{
   public static void main(String[] args)
   {
      //getting the price of the shirt
      String priceStr = JOptionPane.showInputDialog("What is the price of the shirt?");
      double priceDbl = Double.parseDouble(priceStr);
      
      //calculations
      //discounted price
      double discountedPrice = priceDbl - (priceDbl*0.05);
      //VAT added on the discounted price
      double sellPrice = discountedPrice + (discountedPrice*0.15);
           
      System.out.println("The selling price is: R" + sellPrice);
   }
}
