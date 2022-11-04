/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Meganl
 */
public class Sorts 
{
    //variables
    public static int size = 8;
    public static int[] arr = {3, 5, 7, 1, 6, 9, 10, 52};
    
    
    public static void main(String[] args) 
    {
        improvedSelectionSort();
        arrayPrint(arr);
    }
    
    
    
    //array printer
    public static void arrayPrint(int[] arr)
    {
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }
    
    
    
    //selection sort
    //both pointers start from the beginning(both next to each other) and then if they meet the requirements in the if statement, they are swapped
    public static void selectionSort(int[] arr)
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = i+1; j < size; j++)
            {
                if(arr[i] > arr[j]) //to have it sorted from biggest to smallest, change the '<' to a '>'
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    
    //impoved selection sort (pretty much just more efficient)
    //runs through the whole loop to find the smallest value from the i index and then only after it has run through the whole array, will it swap the two thingys
    public static void improvedSelectionSort()
    {
        for(int i = 0; i < size;i++)
        {
            int pos = i;
            for(int j = i+1; j < size; j++)
            {
                if(arr[j] < arr[pos]) //very important that it is j and pos or otherwise the whole program will screw up and be a little dick
                {
                    pos = j;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }
    
    
    
    //bubble sort (bubbles out the biggest numbers to the end)
    public static void bubbleSort(int[] arr)
    {
        //loop that sets the end of of the currentIndex loop
        for(int sortedIndex = size-1; sortedIndex > 0; sortedIndex--)
        {
            //cycles through all the numbers in the array from 0 until the arr at the sortedIndex
            for(int currentIndex = 0;  currentIndex < sortedIndex; currentIndex++)
            {
                //comparing the currentIndex to the index next to it 
                if(arr[currentIndex] > arr[currentIndex + 1])
                {
                    //saves the currentIndex into a temp variable so we don't lose it's data
                    int temp = arr[currentIndex];
                    //setting the arr[currentIndex+1] to the currentIndex because it is the smaller of the two numbers
                    arr[currentIndex] = arr[currentIndex+1];
                    //setting the arr[currentIndex] to the currentIndex+1 because it is the bigger of the two numbers
                    arr[currentIndex+1] = temp;
                }
            }
        }
    }
    
    //improved bubble sort (pretty much only carries on with the loop if the array is not sorted)
    //sorts each number individually into its place
    public static void improvedBubbleSort()
    {
        boolean sorted = false;
        int i = size-1;
        while(!sorted)
        {
            sorted = true;
            for(int j = 0; j < i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }    
            }
            i--;
        }
    }
}
