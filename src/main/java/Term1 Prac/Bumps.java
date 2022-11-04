import it.*;
import javax.swing.*;
import java.awt.*;


public class Bumps{
   public static void main(String[] args){
      //setting the Gogga fields for 'bug'
      Gogga bug = new Gogga();
      bug.setPosition(1,5);
      bug.setColor(Color.BLUE);
      
      //making the bumps
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.move();
      bug.turnLeft();
      
      //retrievinng the coordinates of the Gogga
      int x = bug.getXPos();
      int y = bug.getYPos();
      
      //outputting the coordinates of the Gogga
      System.out.println("The final coordinates of the Gogga is " + x + "," + y);
      
   }
}