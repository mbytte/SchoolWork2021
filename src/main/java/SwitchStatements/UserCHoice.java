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
public class UserCHoice
{
    public static void main(String[] args)
    {   
        String[] options = {"PS", "5Star", "KitKat", "Lindt", "Lunch Bar"};
        String decNumStr = JOptionPane.showInputDialog("What chocolate would you like(type only the number)\n1. PS\n2. 5Star\n3. KitKat\n4. Lindt\n5. Lunch Bar");
        int decNumInt = Integer.parseInt(decNumStr);
        int decisionPlaceNum = decNumInt - 1;
        System.out.println(options[decisionPlaceNum]);
    }
}
