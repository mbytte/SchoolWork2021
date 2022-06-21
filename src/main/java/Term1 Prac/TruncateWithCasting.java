import it.*;
import javax.swing.*;
import java.awt.*;


public class TruncateWithCasting{
   public static void main(String[] args){
      //making variable to store the given number
      double doubleNum = 1456.6765443;
      
      //rounding off the given number to 2 decimal places
      int roundInt = (int) (doubleNum * 100);
      double roundDbl = roundInt/100.0;
      
      //outputting the rounded off number(2 decimal places)
      System.out.println(roundDbl);
   }
}