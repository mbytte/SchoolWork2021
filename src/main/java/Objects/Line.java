/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Meganl
 */

//activity 1,2,3 p59-61 and exercise 1 p63
public class Line 
{
    //variables
    private int size;
    private String pattern;
    
    //assigning values to variables in the default constructer
    public Line(int inpSize, String inpPattern)
    {
        size = inpSize;
        pattern = inpPattern;
    }
            
    
    //prints out a pattern horizontally for a specific length
    public void draw()
    {
        for(int i = 1; i <= size; i++)
        {
            System.out.print(pattern);
        }
        System.out.println("");
    }
    
    
    //prints out a pattern vertically for a specific length
    public void drawVert()
    {
        for(int i = 1; i <= size; i++)
        {
            System.out.println(pattern);
        }
    }
    
    
    //gets the length of the pattern
    public int getLength(Line line)
    {
        int length = line.size;
        return length;
    }
    
    
    //sets the length of the pattern
    public void setLength(int newLength)
    {
        size = newLength;
    }
}
