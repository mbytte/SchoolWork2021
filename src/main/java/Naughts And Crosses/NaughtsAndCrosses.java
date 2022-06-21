import javax.swing.*;

public class NaughtsAndCrosses
{
   public static void main(String[] args)
   {  
      //grid
      //grid array
      String[][] grid = {{" "," "," "}, {" "," "," "}, {" "," "," "}};
      //coordinates
      int xPos = 0;
      int yPos = 0;
      


      //gameplay
      //variables
      String rowPositionStr, columnPositionStr;
      int rowPosInt, columnPosInt;
      
      for(int i = 0; i < 9; i++)
      {  
         //coordinate data
         rowPositionStr = JOptionPane.showInputDialog("Which row?");
         columnPositionStr = JOptionPane.showInputDialog("Which column?");
         rowPosInt = Integer.parseInt(rowPositionStr);
         columnPosInt = Integer.parseInt(columnPositionStr);
         
         //adding X/O to grid
         int x = rowPosInt - 1;
         int y = columnPosInt - 1;
         if(grid[x][y] == "X" || grid[x][y] == "O")
         {
            System.out.println("Illegal play");
            break;
            //add a goto function(reset)
         }
         if(i % 2 == 0)
         {
            grid[x][y] = "X";
         }
         else
         {
            grid[x][y] = "O";
         }
       
         //displaying grid
         //row one
         System.out.print("|");
         for(int j = 0; j < 3; j++)
         {  
            System.out.print(grid[0][yPos] + "|");
            yPos++;
         }
         yPos = 0;
         System.out.println();
         System.out.print("|");
         //row 2
         for(int j = 0; j < 3; j++)
         {  
            System.out.print(grid[1][yPos] + "|");
            yPos++;
         }
         yPos = 0;
         System.out.println();
         System.out.print("|");
         //row3
         for(int j = 0; j < 3; j++)
         {  
            System.out.print(grid[2][yPos] + "|");
            yPos++;
         }
         yPos = 0;
         System.out.println();
         System.out.println();
      }
   }
}