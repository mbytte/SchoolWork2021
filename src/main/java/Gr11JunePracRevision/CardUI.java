/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gr11JunePracRevision;

/**
 *
 * @author megan
 */
public class CardUI
{
    public static void main(String[] args)
    {
        CardArray ra = new CardArray();
        System.out.println(ra.toString());
        ra.sort();
        System.out.println(ra.toString());
        System.out.println(ra.playCards("Finn", "Kylo Ren"));        
    }
}
