/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Meganl
 */
public class BankClient 
{
    //variables
    private String clientName;
    private int accountNumber;
    private double balance;
    
    //constructor
    public BankClient()
    {
        clientName = "Patrick Star";
        accountNumber = 1234;
        balance = 1001.1;
    }
    
    //getters and setters
    //clientName
    public String getName()
    {
        return clientName;
    }
    public void setName(String newName)
    {
        clientName = newName;
    }
    //accountNumber
    public int getAccount()
    {
        return accountNumber;
    }
    public void setAccount(int newAccountNum)
    {
        accountNumber = newAccountNum;
    }
    //balance
    public String getBalance()
    {
        return clientName;
    }
    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }
    
    
    //accessing and changing the methods
    public void newValues(String newName, int newAccount, double newBalance)
    {
        clientName = newName;
        accountNumber = newAccount;
        balance = newBalance;
    }
    
    //rearranges the name and surname to surname.name.initials
    public static String changeName()
    {
        String newName = 
    }
}
