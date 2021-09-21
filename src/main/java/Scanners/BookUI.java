/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanners;

/**
 *
 * @author Meganl
 */
public class BookUI 
{
    public static void main(String[] args) 
    {
        String booksOutput = BookManager.getBooks();
        System.out.println(booksOutput);
         
        BookManager.NewBook("Badum", "tshhh");
       
        String booksOutput2 = BookManager.getBooks();
        System.out.println(booksOutput2);
    }
}
