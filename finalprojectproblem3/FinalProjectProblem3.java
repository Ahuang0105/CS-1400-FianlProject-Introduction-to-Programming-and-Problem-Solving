// Final Project 
    // Alan Huang, William Broer
        // 05/15/2019
            // CS 1400-02

package finalprojectproblem3;

import java.util.Scanner;
public class FinalProjectProblem3 {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        final int totalQuestion = 20;
        
        char[] studetEnter = new char[totalQuestion];
        char[] masterKey = {'A', 'A', 'A', 'A', 'A', 'B', 'B', 'B', 'B',
                'B', 'C', 'C', 'C', 'C', 'C', 'D', 'D', 'D',
                'D', 'D'};
        
        String list = "";
        String grade = "";
        
        System.out.println("$ java DriverTest Enter your answers to the exam questions.");
        
        for (int i = 0; i < studetEnter.length; i++)
        {
            System.out.print("Question " + (i+1) + ": ");
            String input = kb.nextLine().toUpperCase();
            studetEnter[i] = input.charAt(0);
        }
        
        int incorrect = gradeExam(masterKey, studetEnter);
        int correct = totalQuestion - incorrect;
        int[] missed = new int[incorrect];
        missed = makeMissedArray(masterKey, studetEnter, incorrect);
        
       
        for (int j = 0; j < incorrect; j++)
            
            list += missed[j] + " ";
       
        if (correct >= 15)
            
            grade = "passed";
        
        else
            grade = "failed";
        
       
           System.out.println("** Correct answers: " + correct);
        
           System.out.println("** Incorrect answers: " + incorrect);
        
           System.out.println("** You " + grade + " the exam.");
       
           System.out.println("You missed the following questions: \n"
                + list);
    }
    
     public static int gradeExam(char[] correct, char[] student)
    {
        int wrong = 0;
        
           for (int i = 0; i < correct.length; i++)
              {
               if (student[i]!=correct[i])
            
                   wrong++;
              }
        
           return wrong;
    }

    public static int[] makeMissedArray(char[] correct, char[] student, int
            numIncorrect)
    {
        int[] listWrong = new int[numIncorrect];
        int j = 0;
       
        for (int i = 0; i < correct.length; i++)
            
            if(student[i]!=correct[i])
            {
                listWrong[j] += (i+1);
                j++;
            }
        return listWrong;
    }
    
    
}
