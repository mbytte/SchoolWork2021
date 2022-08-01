/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayManipulation;

/**
 *
 * @author Meganl
 */
public class pracTestNamesArrayUI 
{
    public static void main(String[] args) 
    {
        pracTestNamesArray array = new pracTestNamesArray();
        array.sort();
        System.out.println(array.toString());
        
        int index = array.search("ALvin");
        System.out.println(index);
    }
    
    
}
