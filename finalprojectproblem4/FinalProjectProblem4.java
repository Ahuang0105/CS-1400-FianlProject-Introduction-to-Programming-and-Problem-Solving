// Final Project 
    // Alan Huang, William Broer
        // 05/15/2019
            // CS 1400-02

package finalprojectproblem4;

public class FinalProjectProblem4 {

    public static void main(String[] args) {
        
       Triangle top = new Triangle(5,21);
       Box base = new Box(13,4,5);
       top.drawAt(1);
       base.drawAt(0);
       Triangle bop = new Triangle(7,11);  
       bop.drawAt(5);
       Box buse = new Box(3,3,3);
       buse.drawAt(3);
    }
    
}
