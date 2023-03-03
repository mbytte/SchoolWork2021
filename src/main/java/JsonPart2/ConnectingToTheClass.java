/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JsonPart2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Meganl
 */
public class ConnectingToTheClass 
{
    public static void main(String[] args) 
    {
        //scanning through the file
        String jsonText = "";
        
        try 
        {
            Scanner fileScanner = new Scanner(new File("resources\\JSONTest.json"));
            
            while(fileScanner.hasNextLine())
            {
                jsonText += fileScanner.nextLine();
            }
            
            //need to add the thingy from the internet
            JSONArray jsonArr = new JSONArray(jsonText);
            System.out.println(jar.getJSONObeject(1).get("name"));
            
        } catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
    }
}
