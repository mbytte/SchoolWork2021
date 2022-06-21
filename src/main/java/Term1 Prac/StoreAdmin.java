import it.*;
import javax.swing.*;
import java.awt.*;


public class StoreAdmin{
   public static void main(String[] args){
      //getting input from the user
      String numCoke = JOptionPane.showInputDialog("How many Cokes would you like?");
      String numBar = JOptionPane.showInputDialog("How many BarOne's would you like?");
      String numWaters = JOptionPane.showInputDialog("How many waters would you like?");
      
      //converting user input into integers
      int cokeInt = Integer.parseInt(numCoke);
      int barInt = Integer.parseInt(numBar);
      int waterInt = Integer.parseInt(numWaters);
      
      //calculating the cost of the amount of goods wanted
      double cokeCost = cokeInt * 13.9;
      double barCost = barInt * 12.0;
      double waterCost = waterInt * 9.5;
      //calculating final amount
      double totalPrice = cokeCost + barCost + waterCost;
      
      //outputting final amount
      System.out.println("Your total cost for " + numCoke + " Coke(s), " + numBar + " BarOne(s) and " + numWaters + " water(s) is: R" + totalPrice);
      
   }
}