/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11JunePracRevision;

/**
 *
 * @author Meganl
 */
public class ResultSetUI 
{
    public static void main(String[] args) 
    {
        ResultSetManager resultSet = new ResultSetManager("data\\Results.txt");
        
        resultSet.printRatings();
    }
}
