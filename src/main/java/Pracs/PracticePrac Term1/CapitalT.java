import javax.swing.*;
import it.*;
import java.awt.*;
public class CapitalT{
    public static void main(String[] args){
      //setting the fields and making the object
      Gogga bug = new Gogga();
      bug.setPosition(7,7);      
      
      //making the T
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      bug.setPosition(9,3);
      bug.setDirection(Gogga.LEFT);
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      
      //getting and displaying the final x and y position
      int x = bug.getXPos();
      int y = bug.getYPos();
      System.out.print("The coordinates of the Gogga bug is " + x + ", " + y);
   

   }
}