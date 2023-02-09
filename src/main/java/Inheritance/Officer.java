/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;


import java.time.LocalDate;

/**
 *
 * @author Meganl
 */
public class Officer extends CrewMember
{
    //fields
    private int rank;
    private LocalDate datePromoted;
    public static int numPromotedOfficers = 0;

    
    //constructor
    public Officer(String inFN, int inCID, String inDT, int inRK, LocalDate inDP) 
    {
        super(inFN, inCID, inDT);
        this.rank = inRK;
        this.datePromoted = inDP;
        
    }

    
    //getters
    public int getRank() 
    {
        return rank;
    }
    public String getTitle()
    {
        if(rank == 1)
        {
           return "Ensign"; 
        }
        else if(rank == 2)
        {
            return "Lieutenant";
        }
        else if(rank == 3)
        {
            return "Lt Commander";
        }
        else if(rank == 4)
        {
            return "Commander";
        }
        else
        {
            return "Captain";
        }
    }
    
    
    //promotes the officer
    public void promote()
    {
        //adding to the rank
       rank++; 
       
       //setting the date that they were promoted to todays date
       datePromoted = LocalDate.now();
       
       //adding to the number of promoted officers
       numPromotedOfficers++;
    }
    
    
    //toString
    @Override
    public String toString() 
    {
        return getFullname() + "\t" + "Crew ID: " + getCrewID() + " \t[" + getDepartment() + "]" + getTitle();
    }   
}
