/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Meganl
 */
public class Cat extends Animal
{
    //fields that only apply to this class
    private int loyalty;
    
    //constructor
    public Cat(double weight, double height, int loyalty) 
    {
        //super keyword calls the constructor from the parent class 
        //super has to be the first line of the child class's contsructor
        //you do not have to have all the fields that are in the Dog constructor to be the same as the fields in the Animal constructor
        super(weight, height, 4);
        
        //checking if loyalty its into the paramters of being loyal
        if(loyalty >= 0 && loyalty <= 100)
        {
           this.loyalty = loyalty; 
        }
    }
    
    //getters
    public int getLoyalty() 
    {
        return loyalty;
    }
    
    //setters
    public void setLoyalty(int loyalty)
    {
        this.loyalty = loyalty;
    }
    
    
    //has its own method class that adds on to the inherited methods (cannot be used by any other classes except this one (well unless you extend this class too))
    public void scratch()
    {
        System.out.println("You have obtained 3 scratches");
    }
    
    @Override //overrides the method of speak() in the parent class
    public String speak()
    {
        return "meow";
    }
    
    public String speak(int num)
    {
        int i = 0;
        String meows = "";
        while(i < num)
        {
            meows+="meow";
            i++;
        }
        return meows;
    }
}
