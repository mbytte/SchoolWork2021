package Pracs.PracticePrac2021;

import javax.swing.*;
import it.*;
import java.awt.*;

public class MathTest{
   public static void main(String[] args){
     //calculating the volume of a sphere
     double volumeSphere = Math.PI * Math.pow(12, 3) * 4/3.0;
     //printing the volume of the sphere
     System.out.print(volumeSphere);
     
     //generating a random integer between 20 and 40
     int max = 40;
     int min = 20;
     double rand = Math.random()*(max - min) + min;
     double random = Math.round(rand);
     System.out.println(random);
     System.out.println(random);

        
   }
}