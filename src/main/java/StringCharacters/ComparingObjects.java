/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringCharacters;

import javax.swing.JOptionPane;

/**
 *
 * @author Meganl
 */
//Exercise 3 pg 15
public class ComparingObjects 
{
    public static void main(String[] args) 
    {
        //q1
        String emptyStr = new String();
        String str1 = new String("Hello");
        String str2 = new String("aeiou");
        String str3 = str1;
        String str4 = new String(str1);
        String strA = "xyz";
        String strB = "blah blah blah";
        String strC = strA;
        String strD = new String(strA);
        
        System.out.println(emptyStr); //prints nothing
        System.out.println(str1 == str2); //comparing references(address); str1 and str2 have different addresses
        System.out.println(str1.equals(str2)); //comparing content; str1 and str2 have different content
        System.out.println(str1 == str3); //comparing reference; str1 and str3 have the same reference
        System.out.println(str1.equals(str3)); //comparing content; str1 and str3 have the same content
        System.out.println(str1 == str4); //comparing refernce; str1 and str4 have different addresses
        System.out.println(str1.equals(str4)); //comparing content; str1 and str4 have the same content
        System.out.println(strA.equals(strC)); //comparing content; strA and StrC have the same content
        System.out.println(strA.equals(strD)); //comparing content; StrA and StrD have the same content
        System.out.println(strC.equals(strD)); //comparing content; StrC have the same content
        System.out.println(strA == strD); //comparing refences; strA and StrD have different references
        
        
        
        //q2
        //variables
        String wordStr = JOptionPane.showInputDialog("Gee 'n woord");
        int numWords = 0;
        
        //converting to lowercase to make the stop method easier
        wordStr = wordStr.toLowerCase();
        
        //running a loop until Stop is entered
        while(!(wordStr.equals("stop")))
        {
            numWords++;
            wordStr = JOptionPane.showInputDialog("Gee 'n woord");
            
            //converting to lowercase to make the stop method easier
            wordStr = wordStr.toLowerCase();
        }
        //display after the loop is broken out of
        System.out.println("The total number of words entered is: " + numWords);
        
        
        
        //q2; but with a different operator in the while loop
        //resetting variables
        wordStr = JOptionPane.showInputDialog("Gee 'n woord");
        numWords = 0;
        
        //converting to lowercase to make the stop method easier
        wordStr = wordStr.toLowerCase();
        
        //running a loop until Stop is entered
        while(!(wordStr != "stop")) //when the != operator is in the while loop, the loop never runs
        {
            numWords++;
            wordStr = JOptionPane.showInputDialog("Gee 'n woord");
            
            //converting to lowercase to make the stop method easier
            wordStr = wordStr.toLowerCase();
        }
        //display after the loop is broken out of
        System.out.println("The total number of words entered is: " + numWords);
        
    }
}
