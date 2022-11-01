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

    
    //constructor
    public Learner(String learnerName, Activity activityOne, Activity activityTwo) 
    {
        this.learnerName = learnerName;
        this.activityOne = activityOne;
        this.activityTwo = activityTwo;
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
        
    }
    
    
    //to string
    @Override
    public String toString() 
    {
        return "Learner{" + "learnerName=" + learnerName + ", learnerCode=" + learnerCode + ", activityOne=" + activityOne + ", activityTwo=" + activityTwo + '}';
    }
    
    
    
}
