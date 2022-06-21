/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatements;

import javax.swing.JOptionPane;

/**
 *
 * @author CLLB14
 */
public class BasicSwitchCase
{
    public static void main(String[] args)
    {
        String choiceStr = JOptionPane.showInputDialog("What chocolate would you like(type only the number)\n1. PS\n2. 5Star\n3. KitKat\n4. Lindt\n5. Lunch Bar");
        int choiceInt = Integer.parseInt(choiceStr);
        
        //switch case
        switch (choiceInt)
        {
            case 1: 
                    System.out.println("PS");
                    break;
            case 2: 
                    System.out.println("5Star");
                    break;
            case 3: 
                    System.out.println("KitKat");
                    break;
            case 4: 
                    System.out.println("Lindt");
                    break;
            case 5: 
                    System.out.println("Lunch Bar");
                    break;
        }
    }
}
