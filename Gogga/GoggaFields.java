import it.*;

//making the public class to have all code in it so it can be used in a programme
             //name of the public class is "Name"
public class GoggaFields{
 //the entry method(method) for the class(blueprints for the object)
  public static void main (String[] args){
  
  //making grid size bigger. HAS to be before the making of the gogga bugs
  Gogga.setGridSize(20,10);
  //making the gogga bugs
  Gogga bug = new Gogga();
  Gogga bug1 = new Gogga();  
  
  //sets settings for bug
  bug.setTrailWidth(12);
  bug.setPosition(8,2);
  bug.setDirection(Gogga.RIGHT);
  bug1.setTrailWidth(12);
  bug1.setPosition(2,8);
  bug1.setDirection(Gogga.RIGHT);
  

  
    
 }
}
