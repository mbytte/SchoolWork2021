/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megan
 */
public class pracTestNameArrayUI
{
    public static void main(String[] args)
    {
        pracTestNameArray arr = new pracTestNameArray();
        System.out.println(arr.toString());
        arr.sort();
        System.out.println(arr.toString());
        arr.delete("Candy");
        System.out.println(arr.toString());
        arr.insert("Cardy");
        System.out.println(arr.toString());
    }
   
   
}
