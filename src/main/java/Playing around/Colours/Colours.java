import it.*; 
//java.awt is very important for the colours to be made
import java.awt.*;

public class Colours{
   public static void main(String[] args){
   //making colours
   Color gold = new Color(255,204,51);
   Color grey = new Color(143,143,143);
   //brightening the colour sliver
   Color silver = grey.brighter();
   
   //drawing with the Gogga
   Gogga bug = new Gogga();
   bug.setColor(silver);
   bug.move();
   bug.move();
   
   
   }
}