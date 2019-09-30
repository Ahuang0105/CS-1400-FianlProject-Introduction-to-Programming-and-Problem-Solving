// Final Project 
    // Alan Huang, William Broer
        // 05/15/2019
            // CS 1400-02

package finalprojectproblem1;

public class Employee {
    
    private String employeeName;
    private String employeeNumber;
    private String hireDate;
    
    //constructor no-arg
    public Employee ()
    {
        employeeName = " ";
        employeeNumber = " ";
        hireDate = " ";     
    }
    
    //constructor 3-arg
    public Employee (String empName, String empNumber, String HireDate)
    {
        setEmployeeName(empName);
        setEmployeeNumber(empNumber);
        setHireDate(HireDate);
    }
    
    // mutator
     public void setEmployeeName (String empName)
    {
        employeeName = empName;
    }
    
     // mutator need to conver to charAt to see if the format is correct
    public void setEmployeeNumber (String empNumber)
    {
        if (empNumber.length () == 5
                && Character.isDigit( empNumber.charAt(0) )
                && Character.isDigit( empNumber.charAt(1) )
                && Character.isDigit( empNumber.charAt(2) )
                &&  empNumber.charAt(3) == '-'
                &&(empNumber.charAt(4) >='A'
                && empNumber.charAt(4) <='M' ))
        {
            employeeNumber = empNumber;
        }
        
        else
            
        {
            employeeNumber = "INVALID EMPLOYEE NUMBER";
        }
        
    }
    
    // mutator    
    public void setHireDate (String date)
    {
        hireDate = date;
    }
    
    //accessor
    public String getEmplyeeName ()
    {
        return employeeName;
    }
    //accessor
    public String getEmployeeNumber ()
    {
        return employeeNumber;
    }
    //accessor
    public String getHireDate ()
    {
        return hireDate;
    }
    
    //Display
    public String toString ()
    {
        String result = "";
        
        result = "Employee name: " + employeeName + "\n"
                +"Employee number: " + employeeNumber + "\n"
                + "Employee hire date: " + hireDate;
        
        return result;
                           
    }
                  
}

