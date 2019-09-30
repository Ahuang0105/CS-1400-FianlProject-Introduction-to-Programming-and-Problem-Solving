// Final Project 
    // Alan Huang, William Broer
        // 05/15/2019
            // CS 1400-02

package finalprojectproblem1;

public class ProductionWorker extends Employee
{
    //Use int to define shift 
    public final int noShift = 0;
    public final int dayShift = 1;
    public final int nightShift = 2;
    
    private int shift;
    private double hourlyPayRate;
    
    //constructor no-arg
    public ProductionWorker ()
    {
        shift = noShift;
        hourlyPayRate = 0.0;       
    }
    
    //constructor 5-arg
    public ProductionWorker (String empName, String empNumber,
            String date, int shif, double pay)
    {
        // use super connect to employee super class
        super (empName, empNumber, date);
        
        setShift(shif);
        setHourlyPayRate(pay);
    }
    
     //mutator
     public void  setShift (int shif)
    {
        //dayShift = 1 nightShift 2
        if (shif ==  dayShift || shif == nightShift)
            
            shift = shif;
        
        //Anything else just return no Shift
        else
            
            shift = noShift;
    }
    
    //mutator
    public void setHourlyPayRate (double rate)
    {
        hourlyPayRate = rate;
    }
    
    //accessor
    public int getShift()
    {
        return shift;
    }
    
    //accessor
    public double getHourlyPayrate ()
    {
        return hourlyPayRate;
    }
    
    //Display
    public String toString()
    {
        String result = "";
        
        result = super.toString() + "\n";
        
        if (shift == dayShift )
            result += "Shift: Day\n";
        
        else if (shift == nightShift)
            result += "shift: Night\n";
        
        else 
            result += "shift; INVALID SHIFT NUMBER\n ";
            result += "Hourly pay rate: "
                    + String.format("$%.2f" , hourlyPayRate);
            return result;
        
    }
}
