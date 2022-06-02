/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Meganl
 */
public class Person 
{
    private String name;
    private String surname;
    private int age;

    public Person() {
    }

    public Person(String name, String surname, int age) 
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Person(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getSurname() 
    {
        return surname;
    }

    public void setSurname(String surname) 
    {
        this.surname = surname;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    @Override
    public String toString() 
    {
        return "Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }

}
