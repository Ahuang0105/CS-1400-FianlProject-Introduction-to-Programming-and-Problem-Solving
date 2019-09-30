// Final Project 
    // Alan Huang, William Broer
        // 05/15/2019
            // CS 1400-02

package finalprojectproblem4;


public class Box extends Figure {
  
   private int height;
   private int width;
  
  
   public Box()
   { 
       super();
       height = 0;
       width = 0;
    }
   public Box(int theOffset, int theHeight, int theWidth)
   {
       super(theOffset);
       height = theHeight;
       width = theWidth;
    }
   
   public void reset(int newOffset, int newHeight, int newWidth)
   {
       setOffset(newOffset);
       height = newHeight;
       width = newWidth;
    }
   @Override
   
   public void drawHere()
   {
      
       
       for (int r = 1; r <= height; r++) 
       {
           spaces(getOffset());
           if (r ==1 || r ==height)
           {
               for(int c = 1; c<= width; c++)
                   
               System.out.print("-");
           }
       
           else 
           {
               
               System.out.print("|");
               
               for(int c =1; c <= width -2 ; c++ )
                 
                   System.out.print(" ");
               System.out.print("|");
           }
           
           System.out.println();
       }  
      
    
    }

  private static void spaces(int number)
  {
    int count; 
    for (count = 0; count < number; count++)
    System.out.print(' ');
  }
}