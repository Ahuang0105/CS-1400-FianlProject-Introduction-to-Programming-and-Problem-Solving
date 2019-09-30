// Final Project 
    // Alan Huang, William Broer
        // 05/15/2019
            // CS 1400-02

package finalprojectproblem4;

abstract class Figure {
  

    private int offset; 
  
    public Figure() 
    {
        offset = 0; 
    }
 
    public Figure(int theOffset)
    {
        offset = theOffset;
    }
  
    public void setOffset(int newOffset)
    {
        offset = newOffset;
    }
  
    public int getOffset()
    {
        return offset;
    }
 
    public void drawAt(int lineNumber)
    {
        int count;
        for (count = 0; count < lineNumber; count++)
        System.out.println(); 
        drawHere();
    }
  
    public abstract void drawHere();

 }
