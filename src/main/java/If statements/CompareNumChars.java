//exarcise 2 pg 134
//the aim of this program is to display the two words from the smaller word to the bigger word
import javax.swing.*;

public class CompareNumChars
{
   public static void main(String[] args)
   {
      String wrd1 = JOptionPane.showInputDialog("Give me a word");
      String wrd2 = JOptionPane.showInputDialog("Give me a word");
      int wrd1Length = wrd1.length();
      int wrd2Length = wrd2.length();
      
      if(wrd1Length < wrd2Length)
      {
         System.out.println("" + wrd1 + ", " + wrd2);
      }
      else
      {
         System.out.println("" + wrd2 + ", " + wrd1);
      }
   }
}