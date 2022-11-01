/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11NovemberRevision;

import DateTime.Date;

/**
 *
 * @author Meganl
 */
public class Activity 
{
    //properties
    private String description;
    private double cost;
    private Date actDate;

    
    //constructor
    public Activity(String description, double cost, Date actDate) 
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
    public Date getActDate() 
    {
        return actDate;
    }
    
}
