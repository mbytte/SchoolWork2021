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
            Scanner fileScanner = new Scanner(new File("data\\student.txt"));
            size = 0;
            
            //scanning through a textfile and adding it to the textfile
            while(fileScanner.hasNext())
            {
                //scanner
                Scanner lineScanner = new Scanner(fileScanner.next()).useDelimiter("#");
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY");
                studentArr[size]= new Student(lineScanner.next(), lineScanner.next(), LocalDate.parse(lineScanner.next(), dtf));
                size++;
            }
        } catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
    }
    
    
        //changes the format of the date
        public void changeDateFormat()
        {
            LocalDate birthday = LocalDate();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM YYYY");
            birthday.format(dtf);
        }

}
