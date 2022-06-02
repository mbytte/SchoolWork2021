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
    
    //bubble sort (bubbles out the biggest numbers to the end)
    //there are two pointers (one which starts at the beginning index called the currentIndex and one which starts at the end called sortedIndex)
    //The currentIndex runs through all the indexes from the beginning to the sortedIndex(which subtracts after each loop because it would be the biggest number from that run)
    //in each loop of the currentIndex, the number next to it (index + 1) is checked to see whether is is bigger or smaller than the current index
    //if the array at currentIndex is bigger than currentIndex+1 then the numbers are swapped and then this repeats with the next index
    public static void bubbleSort(int[] arr)
    {
        //loop that sets the end of of the currentIndex loop
        for(int sortedIndex = arr.length -1; sortedIndex > 0; sortedIndex--)
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
    
}
