/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

/**
 *
 * @author Meganl
 */
public class SportsManagerUI 
{
    public static void main(String[] args) 
    {
        //printing out all the info of the textfile
        System.out.println(SportsManager.readPlayers());
        
        //adding a new player
        SportsManager.addPlayer();
        
        //printing out all the new information
        System.out.println(SportsManager.readPlayers());
    }
}
