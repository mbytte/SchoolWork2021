/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayManipulation;

/**
 *
 * @author megan
 */
public class Person
{
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }
    
    
}
