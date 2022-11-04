import it.*;
import javax.swing.*;
import java.awt.*;

public class GetInitials{
   public static void main(String[] args){
      //getting input from user
      String name = JOptionPane.showInputDialog("What is you first name?");
      String surname = JOptionPane.showInputDialog("What is your last name?");
      //getting intials
      char nameInit = (name).charAt(0);
      char surnameInit = (surname).charAt(0);
      
      //outputtimg initials      
      System.out.println("Your initials are " + nameInit + surnameInit);
   }   
}