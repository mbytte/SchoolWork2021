/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import javax.swing.JOptionPane;

/**
 *
 * @author Meganl
 */
public class BankClient 
{
    //variables
    private static String clientName;
    private static int accountNumber;
    private static double balance;
    
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
    public static void newValues(String newName, int newAccount, double newBalance)
    {
        clientName = newName;
        accountNumber = newAccount;
        balance = newBalance;
    }
    
    //rearranges the name and surname to surname.name.initials
    public static String changeName()
    {
        String newName = clientName.substring(clientName.lastIndexOf(' ')+1) + clientName.charAt(0);
        return newName;
    }
    
    //puts all the object's references into a string
    public String toString()
    {
        return changeName() + ", Balance: " + balance + ", Account Number: " + accountNumber;
    }
    
    //validates the account number and then runs everything that is needed to be done
    public static void validateAccount(String newName, String account, double newBalance)
    {
        int accountInt = Integer.parseInt(account);
        if(account.length() == 6 && account.charAt(0) != '0' && (account.charAt(1)+account.charAt(2)/10 == account.charAt(4)))
        {
            BankClient.newValues(newName, accountInt, newBalance);
        }
    }
}
