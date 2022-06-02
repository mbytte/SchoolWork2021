/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContantAndStaticFields;

/**
 *
 * @author Meganl
 */

//p93
public class Fruit 
{
    //variables
    private static int totalQty;
    private static double totalCost;
    private static double totalSales;
    private String description;
    private int qty;
    private double costPrice;
    private double sellingPrice;
    final int markup = 75;
    
    //constructor
    public Fruit(String description, int qty, double costPrice, double sellingPrice) {
        this.description = description;
        this.qty = qty;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }
    
    
    //converts the object details to a string
    public String toString()
    {
        return description  + " ," + qty + " ," + costPrice + " ," + sellingPrice;
    }
    
    
    //gets the fruits description
    public String getDescription()
    {
        return description;
    }
    
    
    //gets the quantity
    public int getQty()
    {
        return qty;
    }
    
    
    //gets the selling price
    public double getSellingPrice()
    {
        return sellingPrice;
    }
    
    
    //gets the totalQty
    public static int getTotalQty()
    {
        return totalQty;
    }
    
    
    //gets the totalCost
    public static double getTotalCost()
    {
        return totalCost;
    }
    
    
    //gets the total sales
    public static double getTotalSales()
    {
        return totalSales;
    }
    
    
    //sells a fruit
    public void sell(int q)
    {
        totalQty = totalQty - q;
    }
}
