/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gr11JunePracRevision;

/**
 *
 * @author megan
 */
public class Card2
{
    //fields
    private String name;
    private String type;
    private int basic;
    private int special;
    private int leader;
    private int unique;
    //static constants
    private static final int LIGHTFACTOR = 3;
    private static final double DARKFACTOR = 2.5;
    
   
    //constructor
    public Card2(String name, String type, int basic, int special, int leader, int unique)
    {
        this.name = name;
        this.type = type;
        this.basic = basic;
        this.special = special;
        this.leader = leader;
        this.unique = unique;
    }
    
    
    //name accessor
    public String getName()
    {
        return name;
    }
    
    
    //checks if the card type is light
    public boolean checkLight()
    {
        //light
        if(type.contains("Light"))
        {
            return true;
        }
        //false
        else
        {
            return false;
        }
    }
    
    
    //calculates the points for specific card types
    public double calcPoints()
    {
        ///light
        if(checkLight())
        {
            return (basic + special + leader + unique)*LIGHTFACTOR;
        }
        //dark
        else
        {
            return (basic + special + leader + unique)*DARKFACTOR;
        }
    }

    
    //returns the name, type and points
    public String getNameTypePoints()
    {
        return name + "\t" + type + "\t" + calcPoints();
    }
    
    
    @Override
    public String toString()
    {
        if(checkLight())
        {
            return name + "\t" + type + "\t" + basic + "\t" + special + "\t" + leader + "\t" + unique + LIGHTFACTOR;
        }
        else
        {
            return name + "\t" + type + "\t" + basic + "\t" + special + "\t" + leader + "\t" + unique + DARKFACTOR;
        }
    }
    
    
    
}
