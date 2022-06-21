import it.*;
import javax.swing.*;
import java.awt.*;

public class CapitalT{
   public static void main(String[] args){
      Gogga bug = new Gogga();
      //setting the fields of the bug
      bug.setPosition(7,7);
      bug.setColor(Color.BLUE);

      //making the T
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.LEFT);
      bug.setPosition(9,3);
      bug.move();
      bug.move();
      bug.move();
      bug.move();

      //getting coordinates of bug and displaying them
      int x = bug.getXPos();
      int y = bug.getYPos();
      System.out.println("The bugs coordinates are " + x + ", " + y);
      
   
   }   
}