// Final Project 
    // Alan Huang, William Broer
        // 05/15/2019
            // CS 1400-02

package finalprojectproblem4;

public class Triangle extends Figure {
    
    private int base;

  
    public Triangle()
    {
        super();
        base = 0;
    }
  
    public Triangle(int theOffset, int theBase)
    {
        super(theOffset);
        base = theBase;
    }
 
    public void reset(int newOffset, int newBase)
    {
        setOffset(newOffset);
        base = newBase;
    }
  
    @Override
  
    public void drawHere()
    {
        int startOfLine = getOffset() + (base/2);
        
           spaces(startOfLine);
           System.out.println('*');

        int top;
        int lineCount = (base/2) - 1;
        int insideWidth = 1;
    
        for (top = 0; top < lineCount; top++)
        {
           startOfLine = startOfLine - 1;
           spaces(startOfLine);
           System.out.print('*');
           spaces(insideWidth);
           System.out.println('*');
           insideWidth = insideWidth + 2;
        }
        
        spaces(getOffset());
        
        
        for (int count = 0; count < base; count++)
        {
            System.out.print('*'); 
        }
            System.out.println();
            
    }
 
  private static void spaces(int number)
  {   
      for (int count = 0; count < number; count++)
      
          System.out.print(' ');
  }
}
