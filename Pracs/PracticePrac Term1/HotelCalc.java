import javax.swing.*;
import it.*;
import java.awt.*;

public class HotelCalc{
   public static void main(String[] args){
      //getting the user input 
      String guestsStr = JOptionPane.showInputDialog("How many people will be staying?");
      String nightsStr = JOptionPane.showInputDialog("How many nights will they be staying for?");
      //converting the input into integers
      int guestsInt = Integer.parseInt(guestsStr);
      int nightsInt = Integer.parseInt(nightsStr);
      
      //calculating the full cost
      double cost = guestsInt * nightsInt * 490.90;
      //rounding the cost off to two decimal places
      double round = Math.round(100 * cost)/100.0;
      
      //calculating the cost with a 10% discount
      double discount = round * 90.0/100;
      System.out.println("The total cost will be R" + round);
      System.out.println("The total cost at 10% discount is R" + discount);
   }
}

