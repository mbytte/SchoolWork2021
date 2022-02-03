/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringCharacters;

/**
 *
 * @author Meganl
 */
public class MScanner 
{
    private String s; //String that we are working with
    private char delimeter = ' '; //thing that separates the different parts of the string
    private int position = 0; //pointer
    
    
    
    public MScanner(String inputS)
    {
        s = inputS;
    }
    
    
    
    //next()
    public String next()
    {
        //s.indexOf(position, delimeter);
        String nextWord = s.substring(position, s.indexOf(delimeter, position));
        
        //setting a new position that the scanner will run from 
        position = s.indexOf(delimeter, position) + 1;
        
        return nextWord;
    }
            
    //hasNext
    
    
    //setDelimeter
    //nextInt()
    //nextDouble
    
    
    
    
    
}
