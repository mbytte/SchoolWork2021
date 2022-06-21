/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;


/**
 *
 * @author Meganl
 */
public class PersonArray 
{
    //variables
    private Person[] personArr = new Person[50];
    private int index = 0;
    
    public PersonArray()
    {
        createArr();
    }
    
    
    private void createArr()
    {
       Scanner fileScanner = new Scanner("data\\person.txt");
       Scanner lineScanner = new Scanner(fileScanner.next());
        
       while(fileScanner.hasNext())
       {
           personArr[index] = new Person(lineScanner.next(), lineScanner.next(), lineScanner.nextInt());
           index++;
       }
    }
    
    
    public String toString()
    {
        String people = "";
        //running through the array and adding it to the string
        for(int i = 0; i <= index; i++)
        {
            people+= personArr[i] + "\n";
        }
        
        return people;
    }
    
    
    //sorting the array
    public void sortArrAge()
    {
        for(int sortedIndex = index - 1; sortedIndex > 0; sortedIndex--)
        {
            for(int currentIndex = 0; currentIndex < 0; currentIndex++)
            {
                if(personArr[currentIndex].getAge() > personArr[sortedIndex].getAge())
                {
                    Person temp = personArr[currentIndex];
                    personArr[currentIndex] = personArr[currentIndex + 1];
                    personArr[currentIndex + 1] = personArr[currentIndex];
                }                
            }
        }
    }
    
}
