import javax.swing.*;

public class MagicCards
{
   public static void main(String[] args)
   {  
      int userNum = 0;

      int cardAQues = JOptionPane.showConfirmDialog(null, "Is your number on this card:\n1, 9, 17, 25, 3, 11, 19, 27, 5, 13, 21, 29, 7, 15, 23, 31");
      if(cardAQues == JOptionPane.YES_OPTION)
      {
         userNum++;
      }
      
      int cardBQues = JOptionPane.showConfirmDialog(null, "Is your number on this card:\n2, 10, 18, 26, 3, 11, 19, 27, 6, 14, 22, 30, 7, 15, 23, 31");
      if(cardBQues == JOptionPane.YES_OPTION)
      {
         userNum++;
      }
           
      String cardBQues = JOptionPane.showInputDialog("Is your number on this card(yes/no):\n2, 10, 18, 26, 3, 11, 19, 27, 6, 14, 22, 30, 7, 15, 23, 31");
       if(cardBQues.equals("yes"))
      {
         userNum+=2;
      }
      
      String cardCQues = JOptionPane.showInputDialog("Is your number on this card(yes/no):\n4, 12, 20, 28, 5, 13, 21, 29, 6, 14, 22, 30, 7, 15, 23, 31");
       if(cardCQues.equals("yes"))
      {
         userNum+=4;
      }
      
      String cardDQues = JOptionPane.showInputDialog("Is your number on this card(yes/no):\n8, 12, 24, 28, 9, 13, 25, 29, 10, 14, 26, 30, 11, 15, 27, 31");
       if(cardDQues.equals("yes"))
      {
         userNum+=8;
      }

      String cardEQues = JOptionPane.showInputDialog("Is your number on this card(yes/no):\n16, 20, 24, 28, 17, 21, 25, 29, 18, 22, 26, 30, 19, 23, 27, 31");
       if(cardEQues.equals("yes"))
      {
         userNum+=16;
      }

      System.out.println("Your number is: " + userNum);

   }
}