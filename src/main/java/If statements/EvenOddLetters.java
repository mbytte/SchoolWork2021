import javax.swing.*;

public class EvenOddLetters
{
   public static void main(String[] args)
   {
     String inpWord = JOptionPane.showInputDialog("Give me a word");
     int inpWordLength = inpWord.length();
     
     if(inpWordLength%2 == 0)
     {
      System.out.println("Your your word is an even number of letters");
     }
     
     else
     {
      System.out.println("Your your word is an odd number of letters");
     }
   }
}