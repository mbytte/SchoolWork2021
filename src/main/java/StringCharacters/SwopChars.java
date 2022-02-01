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
public class SwopChars 
{
    public static void main(String[] args) 
    {
        //getting input
        String word1 = JOptionPane.showInputDialog("Give me a word");
        String word2 = JOptionPane.showInputDialog("Another one");
        
        //getting the first letters of the words
        String char1 = "" + word1.charAt(0);
        String char2 = "" + word2.charAt(0);
        
        //replacing the letters
        System.out.println(word1.replaceFirst(char1, char2));
        System.out.println(word2.replaceFirst(char2, char1));
    }
}
