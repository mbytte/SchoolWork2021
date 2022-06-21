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
public class Card
{
    //fields
    private String name;
    private String type;
    private int basic;
    private int special;
    private int leader;
    private int unique;
    private static final  int LIGHTFACTOR = 3;
    private static final double DARKFACTOR = 2.5;

    
    //constructor
    public Card(String name, String type, int basic, int special, int leader, int unique)
    {
        this.name = name;
        this.type = type;
        this.basic = basic;
        this.special = special;
        this.leader = leader;
        this.unique = unique;
    }
    
    
    //name getter
    public String getName()
    {
        return name;
    }
    
    
    //checks what type the card is
    public boolean checkLight()
    {
        //type = light
        if((type.substring(0,5)).equals("Light"))
        {
            return true;
        }
        //type = dark
        else
        {
            return false;
        }
    }
    
    
    //calculates the points
    public double calcPoints()
    {
        //light cards
        if(checkLight())
        {
            return (basic + special + leader + unique)*LIGHTFACTOR;
        }
        //dark cards
        else
        {
            return (basic + special + leader + unique)*DARKFACTOR;
        }
    }

    
    //returns the name, type and the points
    public String getNameTypePoints()
    {
        return name + " " + type + " " + calcPoints();
    }
    
    
    @Override
    public String toString()
    {
        //light
        if(checkLight())
        {
            return  name + " " + type + " " + basic + " " + special + " " + leader + " " + unique + " "  +  LIGHTFACTOR;
        }
        //dark
        else
        {
            return  name + " " + type + " " + basic + " " + special + " " + leader + " " + unique +  " "  +  DARKFACTOR;
        }
    }
}
