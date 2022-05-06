/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Meganl
 */
public class BubbleSort 
{
    public static void main(String[] args) 
    {
        //array
        int[] arr = {3, 5, 7, 1, 6, 9, 10, 52};
        
        pointerSort(arr);
        
        arrayPrint(arr);
    }
    
    //array printer
    public static void arrayPrint(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }
    
    //pointer sort method **does not work
    public static void pointerSort(int[] arr)
    {
        for(int sortedIndex = arr.length-1; sortedIndex < arr.length; sortedIndex-- )
        {
            for(int currentIndex = 0; currentIndex < arr.length; currentIndex++)
            {
                if(arr[currentIndex] > arr[currentIndex-1])
                {
                    int temp = arr[currentIndex-1];
                    arr[sortedIndex] = arr[currentIndex - 1];
                    arr[currentIndex] = temp;
                }
            }
        }
    }
    
    //bubble sort
    public static void bubbleSort()
    {
        for(int sortedIndex = 0; sortedIndex > arr.length; sortedIndex)
    }
    
}
