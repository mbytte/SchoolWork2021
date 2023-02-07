import javax.swing.*;

public class ChangeTypes{
   public static void main(String[] args){
      //char.At(position) stores the letter from the string in whatever position you tell it to (starts from 0)
      char statement = "How are you".charAt(5);       //will print out R because it is in the fifth place from the left (starts at 0)
      System.out.println(statement);
      
      //converting input and outputing character with that askii code on it
      String inputStr = JOptionPane.showInputDialog("Give me a number between 0 and 97");
      int inputInt = Integer.parseInt(inputStr);
      int num  = inputInt + 2;
      char asciiNum = (char) num;
      System.out.print("This is your ASCII character " + asciiNum);
      
      
      
   }
}