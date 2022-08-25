/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Meganl
 */
public class DatabaseManager 
{
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://102.130.115.69:3306/meganlDB";
    private static final String username = "meganl";
    private static final String password = "Reddam2021";

    private PreparedStatement statement;
    private ResultSet result;
    private Connection connection;

    public DatabaseManager() throws ClassNotFoundException, SQLException 
    {
            //remember to add the mysql-connector-java library to the dependency list
            Class.forName(driver);
            System.out.println("DB: Database driver loaded");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("DB: Database connection established");
    }

    
    //to do things like insert, delete, ect. (stuff that you are sending to the DB)
    public void update(String update) throws SQLException 
    {
            statement = connection.prepareStatement(update);
            statement.executeUpdate();
            statement.close();
    }

    
    public ResultSet query(String stmt) throws SQLException 
    {
            statement = connection.prepareStatement(stmt);
            result = statement.executeQuery();
            return result;
    }
}
