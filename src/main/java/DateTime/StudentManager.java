/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Meganl
 */
public class StudentManager 
{
    private Student[] studentArr;
    private int size;

    public StudentManager() 
    {
        studentArr = new Student[50];
        
        try 
        {
            //scanner
            Scanner fileScanner = new Scanner(new File("resources\\student.txt"));
            size = 0;
            
            //scanning through a textfile and adding it to the textfile
            while(fileScanner.hasNext())
            {
                //scanner
                Scanner lineScanner = new Scanner(fileScanner.next()).useDelimiter("#");
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                studentArr[size]= new Student(lineScanner.next(), lineScanner.next(), LocalDate.parse(lineScanner.next(), dtf));
                size++;
                
                //closing the scanner
                lineScanner.close();
            }
            //closing the scanner
            fileScanner.close();
        } catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
    }

    @Override
    public String toString() 
    {
        String arrStrings = "";
        for(int i = 0; i < size; i++)
        {
            arrStrings+=studentArr[i] + "\n";
        }
        return arrStrings;
    }
    
    
    
}
