import it.*;
import javax.swing.*;
import java.awt.*;


public class GetMiddle{
   public static void main(String[] args){
      //getting input from user
      String word = JOptionPane.showInputDialog("Give me any word");
      //getting the length of the word
      int wordLength = word.length();

      //calculating the middle value of the word
      int middleValue = (int) Math.round(wordLength/2.0) - 1;
      //retrieving the letter in the middle position of the word
      char middleLetter = word.charAt(middleValue);
      
      //outputting the middle letter
      System.out.println("The middle letter is: " + middleLetter);
   }
}