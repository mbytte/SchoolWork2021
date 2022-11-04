/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import Scanners.MScanner;

/**
 *
 * @author Meganl
 */
public class MScannerUI 
{
    public static void main(String[] args) 
    {
        MScanner sc = new MScanner("hello world hello2 world2");
        
        System.out.println(sc.next());
        System.out.println(sc.next());
    }
}
