/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databases;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Meganl
 */
public class DatabaseTester 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        DatabaseManager dm = new DatabaseManager();
        try 
        {
            ResultSet q = dm.query("SELECT * FROM testTable");
            System.out.println(q);
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
