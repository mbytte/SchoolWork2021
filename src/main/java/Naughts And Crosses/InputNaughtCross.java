import javax.swing.*;

public class InputNaughtCross
{
   public static void main(String[] args)
   {
      //grid array
      String[][] grid = {{" "," "," "}, {" "," "," "}, {" "," "," "}};
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
         
         int x = rowPosInt - 1;
         int y = columnPosInt - 1;
         
         if(i % 2 == 0)
         {
            grid[x][y] = "X";
         }
         else
         {
            grid[x][y] = "O";
         }
         
      } 
   }
}