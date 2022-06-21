package Pracs.PracticePrac2021;

import javax.swing.*;
import it.*;
import java.awt.*;

public class GetInitials{
   public static void main(String[] args){
      //getting input
      String name = JOptionPane.showInputDialog("What is your first name?");
      String surname = JOptionPane.showInputDialog("What is you surname?");
      
      //getting the  first initial of the names
      char initName = (name).charAt(0);
      char initSurname = (surname).charAt(0);
      
      //displaying the initials
      System.out.print("Your initials are " + initName + initSurname);
   
   
   }
}