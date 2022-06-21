import it.*; 
import java.awt.Color;

//setting up classes and objects
public class GoggaName{
 public static void main(String[] args){
 //set the gogga grid to a certain size. Always has to be before creating the Gogga objects
  Gogga.setGridSize(30,15);
  Gogga A = new Gogga();

  A.setColor(Color.BLUE);
  A.setDirection(Gogga.UP);
  A.setPosition(1,6);
 
  
  //drawing the letter M
  A.move();
  A.move();
  A.move();
  A.move();
  A.move();
  A.turnRight();
  A.move();
  A.turnRight();
  A.move();
  A.turnLeft();
  A.move();
  A.turnRight();
  A.move();
  A.turnLeft();
  A.move();
  A.turnLeft();
  A.move();
  A.turnRight();
  A.move();
  A.turnLeft();
  A.move();
  A.turnRight();
  A.move();
  A.turnRight();
  A.move();
  A.move();
  A.move();
  A.move();
  A.move();
  
  //drawing the letter E
  A.setPosition(10,2);
  A.setDirection(Gogga.LEFT);
  
  A.move();
  A.move();
  A.move();
  A.turnLeft();
  A.move();
  A.move();
  A.move();
  A.move();
  A.turnLeft();
  A.move();
  A.move();
  A.move();
  A.setPosition(7,4);
  A.move();
  A.move();

  //Drawing a G
  A.setPosition(14,2);
  A.setDirection(Gogga.LEFT);
  
  A.move();
  A.move();
  A.move();
  A.turnLeft();
  A.move();
  A.move();
  A.move();
  A.move();
  A.turnLeft();
  A.move();
  A.move();
  A.move();
  A.turnLeft();
  A.move();
  A.move();
  A.turnLeft();
  A.move();
  
  //Drawing the letter A
  A.setPosition(15,6);
  A.setDirection(Gogga.UP);
  A.move();
  A.move();
  A.move();
  A.move();
  A.turnRight();
  A.move();
  A.move();
  A.move();
  A.turnRight();
  A.move();
  A.move();
  A.move();
  A.move();
  A.setPosition(15,4);
  A.setDirection(Gogga.RIGHT);
  A.move();
  A.move();
  A.move();
  
  //Drawing the letter N
  A.setPosition(19,6);
  A.setDirection(Gogga.UP);
  A.move();
  A.move();
  A.move();
  A.move();
  A.turnRight();
  A.move();
  A.turnRight();
  A.move();
  A.turnLeft();
  A.move();
  A.turnRight();
  A.move();
  A.turnLeft();
  A.move();
  A.turnRight();
  A.move();
  A.turnLeft();
  A.move();
  A.turnRight();
  A.move();
  A.turnLeft();
  A.move();
  A.turnLeft();
  A.move();
  A.move();
  A.move();
  A.move();


  
 }
}