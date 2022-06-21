/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11JunePracRevision;

import java.util.Scanner;

/**
 *
 * @author Meganl
 */
public class ResultSet 
{
    //variables
    private String name;
    private String email;
    private int scoreAlg;
    private int scoreGeo;
    private int scoreTrig;

    public ResultSet(String name, String email, int scoreAlg, int scoreGeo, int scoreTrig) {
        this.name = name;
        this.email = email;
        this.scoreAlg = scoreAlg;
        this.scoreGeo = scoreGeo;
        this.scoreTrig = scoreTrig;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getRating()
    {
        return (scoreAlg*0.35) + (scoreGeo*0.45) + (scoreTrig*0.2);
    }
    
    public String reformatName()
    {
        //variables
        Scanner nameScanner = new Scanner(name.toUpperCase());
        String initials = "";
        String surname = "";
        
        //scanning through all the names
        while(nameScanner.hasNext())
        {
            if(!(nameScanner.hasNext()))
            {
                surname += nameScanner.next();
            }
            else
            {
                String name = nameScanner.next();  
                initials+=name.charAt(0);
            }
            
            nameScanner.close();
        }
        
        return surname + ", " + initials;
    }    
    
    public String nameAndRating()
    {
        return reformatName() + "\t" + getRating() ;
    }
    
    @Override
    public String toString() 
    {
        return "" + name + "#" + email + "#" + scoreAlg + "#" + scoreGeo + "#" + scoreTrig;
    }
    
    
}
