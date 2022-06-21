/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Meganl
 */
//exercise 1 p36
public class Oldest 
{
    public static void main(String[] args) 
    {
        //variables
        String nameAge = JOptionPane.showInputDialog("Input name and age of boy. Input stop when you are done");
        
        int highestAge = -1;
        String oldestBoy = "";
        
        //checking who is the oldest boy using a scanner
        
            while(!(nameAge.equals("stop")))
            {
                //variables
                Scanner sc = new Scanner(nameAge);
                int currentAge = sc.nextInt();
                String cuurentBoy = sc.next();

                if(currentAge > highestAge)
                {
                    highestAge = currentAge;
                }
                
                nameAge = JOptionPane.showInputDialog("Input name and age of boy. Input stop when you are done");
            }
        
    }
}
