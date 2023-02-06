/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceUI;

import Inheritance.Animal;
import Inheritance.Cat;
import Inheritance.Dog;

/**
 *
 * @author Meganl
 */
public class AnimalUI 
{
    public static void main(String[] args) 
    {
        Dog dog = new Dog(1, 2, 100);
        
        System.out.println(dog.speak(3));
        System.out.println(dog.getWeight());
        dog.eatBone();
        System.out.println(dog.getWeight());
        System.out.println(dog.getLoyalty());
        
        //making an animal array and storing it as animal
       Animal[] animals = new Animal[5];
       animals[0] = new Dog(1, 2, 100);
       animals[1] = new Dog(1, 2, 100);
       animals[2] = new Dog(1, 2, 100);
       animals[3] = new Cat(1, 2, 100);
       animals[4] = new Cat(1, 2, 100);
       
       //cycling through the array and acting on the specific objects within the array
       for(int i = 0; i < 5; i++)
       {
           System.out.println(animals[i].speak());
           
           //checks for the type that you made it as (when you say new...) and treats it as the the object type that you cast it as
           if(animals[i] instanceof Cat)
           {
               ((Cat)animals[i]).scratch(); 
           }
           else if(animals[i] instanceof Dog)
           {
               ((Dog)(animals[i])).eatBone();
           }
       }
    }
}
