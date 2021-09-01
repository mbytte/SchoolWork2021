import it.*;
import javax.swing.*;
import java.awt.Color;



public class ConvertingStringsToPrimitiveDataTypes{
 public static void main(String[] args){
  //questions to collect personal data
  String name = JOptionPane.showInputDialog("What is your name?");
  String birthyrStr = JOptionPane.showInputDialog("What is your birth year?");
  String heightStr = JOptionPane.showInputDialog("What is your height in metres?");
  String tel_num = JOptionPane.showInputDialog("What is your telephone number?");
  
  int birthyrInt = Integer.parseInt(birthyrStr);
  double heightDbl = Double.parseDouble(heightStr);
  
  //outputting personal data
  System.out.println("PERSONAL DETAILS:");          
  System.out.println();
  System.out.println("NAME = " + name);
  System.out.println("YEAR OF BIRTH = " + birthyrInt);   //can add a string and other data types together
  System.out.println("HEIGHT(m) = " + heightDbl);
  System.out.println("TELEPHONE NUMBER = " + tel_num);
  
  //getting input from the user for gogga colour
  Gogga meme = new Gogga();
  String colourbg = JOptionPane.showInputDialog("What colour would you like your bug to be (red/blue/yellow?");
  String colour = colourbg;
  
  //cannot use ==; can only use == for primitive types
  if (colour.equals("red"))
   meme.setColor(Color.RED);
   
  if (colour.equals("blue"))
   meme.setColor(Color.BLUE);
   
  if (colour.equals("yellow"))
   meme.setColor(Color.YELLOW);
  }
}