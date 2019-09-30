// Final Project 
    // Alan Huang, William Broer
        // 05/15/2019
            // CS 1400-02

package finalprojectproblem1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FinalProjectProblem1 {

    final static String DATE_FORMAT = "MM-dd-yyyy";
  
   public static void main(String[] args) throws ParseException 
    {
        Scanner input = new Scanner (System.in);
        
        char choice;
        
        do
        {
            System.out.print("Enter the employee name: ");
            String empName = input.nextLine();
            
            System.out.print("Enter the employee number in the format XXX–L, "
                    + "(where each X is a digit within the range "
                    + "0–9 and the L is a letter within the range A–M) ; ");
            String empNumber = input.nextLine();
            
            System.out.print("Enter the employee hire date in format MM-dd-yy: ");
            String date = input.nextLine();
            
            SimpleDateFormat date_obj = new SimpleDateFormat("MM-dd-yy");
            
            boolean b = isDateValid (date);
            
            if (b== true)
            {
                date = date;
            }
            
            else
                return;
            
            System.out.print("Enter employee shift (1 for day shift"
                    + " and 2 for night shift) :");
            
            int shift = Integer.parseInt (input.nextLine());
            
            System.out.print("Enter the hourly pay rate: $");
            double rate = Double.parseDouble(input.nextLine());
            
            //After scanner got all the information input to prodcuction worker
            
            ProductionWorker worker = new
            ProductionWorker(empName, empNumber, date, shift, rate);
            
            
            //display
            
            System.out.println("\nDetails of the employee: ");
            
            System.out.print(worker);
            
            System.out.println("\n Do you want to inut another worker? (Y//N):");
            
            //Set choice for while loop
            choice = input.nextLine().charAt(0);
            
            System.out.println();
            
            
            
        }while(choice == 'Y' || choice == 'y');
        
    }
            
    private static boolean isDateValid(String date)
    {
        boolean res = false;
        try
        {
            DateFormat df = new SimpleDateFormat (DATE_FORMAT);
            
            df.setLenient(false);
            df.parse(date);
            res = true;
            
        }
        
        catch(ParseException e)
        {
            System.out.println("invalid date");
            res = false;
        }
        
        return res;
    }
            
      
}
