/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Meganl
 */
public class Animal 
{
    //fields
    //protected fields mean that the child classes to access the private methods (it extends the private method to be used by the whole package, but not any other packages of them)
    protected double weight;
    protected double height;
    protected int numLegs;

    
    
    //constructor
    public Animal(double weight, double height, int numLegs) 
    {
        this.weight = weight;
        this.height = height;
        this.numLegs = numLegs;
    }

    
    
    //getters
    public double getWeight() 
    {
        return weight;
    }

    public double getHeight() 
    {
        return height;
    }

    public int getNumLegs() 
    {
        return numLegs;
    }

    
    
    //setters
    public void setWeight(double weight) 
    {
        this.weight = weight;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    public void setNumLegs(int numLegs) 
    {
        this.numLegs = numLegs;
    }
    
    
    //i dunno
    public String speak()
    {
        return "Generic animal noise";
    }
}
