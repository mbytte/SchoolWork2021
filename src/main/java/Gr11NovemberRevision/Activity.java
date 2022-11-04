/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11NovemberRevision;

import java.time.LocalDate;

/**
 *
 * @author Meganl
 */
public class Activity 
{
    //properties
    private String description;
    private double cost;
    private LocalDate actDate;

    
    //constructor
    public Activity(String description, double cost, LocalDate actDate) 
    {
        this.description = description;
        this.cost = cost;
        this.actDate = actDate;
    }
    
    
    //getters
    public String getDescription() 
    {
        return description;
    }
    public double getCost() 
    {
        return cost;
    }
    public LocalDate getActDate() 
    {
        return actDate;
    }
    
}
