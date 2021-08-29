import javax.swing.*;

public class DeclaringInstantiatingAssigning{
  public static void main(String[] args){
  
     //declaring and instantiating a string
     //can declare it first and then instantiate it later
     String name = "Megan";
               
     //Declare
     String badum;
     int tshh;
     
     //instantiate
     badum = "hi";
     tshh = 7;
     
     //assign
     //assinging is whenever you give a new value to a variable
     badum = "hi2";
     tshh = 8;
     
     //getting input
     String username = JOptionPane.showInputDialog("What is your name");
     String subject = JOptionPane.showInputDialog("What is your favourite subject?");
   
     System.out.println(username);
     System.out.println(subject);
  
    
  }

}