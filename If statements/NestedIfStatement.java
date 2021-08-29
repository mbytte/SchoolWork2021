//exercise 2 pg 134

public class NestedIfStatement
{
   public static void main(String[] args)
   {
      //variables
      int a, b, c, m;
      a = 3;
      b = 2;
      c = 1;
      
      //nested if
      if(a == 3)
      { 
         m = 4;
         if(b == 2)
         {
            m = 1;
            if(c == 1)
            {
               m = 5;
            }
         }
      }
   }
}