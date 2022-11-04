/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11NovemberRevision;

/**
 *
 * @author Meganl
 */
public class Learner 
{
    //properties
    private String learnerName;
    private String learnerCode;
    private Activity activityOne;
    private Activity activityTwo;
    public final double INSURANCE_COST = 105.25;

    
    //constructor
    public Learner(String learnerName, Activity activityOne, Activity activityTwo) 
    {
        //setting the properties to be what was inputted for them
        this.learnerName = learnerName;
        this.activityOne = activityOne;
        this.activityTwo = activityTwo;
        
        //getting a value for learner code
        learnerCode = (learnerName.substring(0,2)).toUpperCase() + Math.round(Math.random()*(100-10)+10);
    }

    
    //getters
    public String getLearnerCode() 
    {
        
        return learnerCode;
    }
    //setters
    public void setLearnerCode(String learnerCode) 
    {
        this.learnerCode = learnerCode;
    }

    
    
    //calculates the total cost of activities the learner does
    public double calcStudentTotalCost()
    {
        //variables
        double totalCost = activityOne.getCost() + activityTwo.getCost() + INSURANCE_COST;
        return totalCost;
    }
    
    
    //to string
    @Override
    public String toString() 
    {
        String output = "Name: " + learnerName + " " + learnerCode;
        output+="\nActivity 1: " + activityOne.getActDate() + " - " + activityOne.getDescription();
        output+="\nActivity 2: " + activityTwo.getActDate() + " - " + activityTwo.getDescription();
        output+="\nCost: R" + calcStudentTotalCost();
        return output;
    }
}
