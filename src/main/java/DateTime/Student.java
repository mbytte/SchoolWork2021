/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Meganl
 */
public class Student 
{
    //parameters
    private String name;
    private String surname;
    private LocalDate birthday;

    
    //constructor
    public Student(String name, String surname, LocalDate birthday) 
    {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }
    
    //getter
    public LocalDate getBirthday() 
    {
        return birthday;
    }

    //setter
    public void setBirthday(LocalDate birthday) 
    {
        this.birthday = birthday;
    }

    
    //puts the date into a specific format and gets the name and all that lovely stuff
    @Override
    public String toString() 
    {
        //changing the format of birthday
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return name + " " + surname + ": " + birthday.format(dtf);
    }
    
    
}
