import javax.swing.*;

public class Grid
{
   public static void main(String[] args)
   {
      //array
      String[][] grid = {{" "," "," "}, {" "," "," "}, {" "," "," "}};
      //coordinates
      int xPos = 0;
      int yPos = 0;
      
      //displaying grid
      //row one
      System.out.print("|");
      for(int i = 0; i < 3; i++)
      {  
         System.out.print(grid[0][yPos] + "|");
         yPos++;
      }
      yPos = 0;
      System.out.println();
      System.out.print("|");
      //row 2
      for(int i = 0; i < 3; i++)
      {  
         System.out.print(grid[1][yPos] + "|");
         yPos++;
      }
      yPos = 0;
      System.out.println();
      System.out.print("|");
      //row3
      for(int i = 0; i < 3; i++)
      {  
         System.out.print(grid[2][yPos] + "|");
         yPos++;
      }

   }
}