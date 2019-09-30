// Final Project 
    // Alan Huang, William Broer
        // 05/15/2019
            // CS 1400-02

package finalprojectproblem2;

import java.util.Scanner;
import java.lang.*;

class Fraction {

   private int numerator;
   private int denominator;
   static int count;

//constructor no-arg
   public Fraction() {
       numerator = 0;
       denominator = 1;
       count = 0;
       test(); 
   }

//constructor 2-arg
   public Fraction(int numerator, int denominator) {
       this.numerator = numerator;
       this.denominator = denominator;

       int g;
      
       if (denominator == 0) {
           System.out.println("Denominator cannot be equal to zero");
           this.numerator = 0;
           this.denominator = 1;
           System.out.println("the fraction is set to 0/1 ");

           return;
       }

       else if (denominator < 0)

       {

           g = gcd(numerator, denominator);

           denominator *= -1; // change sign
           numerator *= -1;

           this.numerator = numerator;
           this.denominator = denominator;

           this.numerator = numerator / g;
           this.denominator = denominator / g;

           return;
       }

       else if (numerator == 0)

       {

           this.denominator = 1;

           return;
       }

       else {

           g = gcd(numerator, denominator);
           this.numerator = numerator / g;
           this.denominator = denominator / g;

       }

   }

// mutator
   public void setNumerator(int numerator) {
       this.numerator = numerator;
   }

   public void setDenominator(int denominator) {
       this.denominator = denominator;
   }

//accessor
   public int getNumerator() {
       return numerator;
   }

   public int getDenominator() {
       return denominator;
   }

//All calculation
   public Fraction add(Fraction r) {
       int num = numerator * r.denominator + r.numerator * denominator;
       int denom = denominator * r.denominator;

       return new Fraction(num, denom);
   }

   public Fraction subtract(Fraction r) {
       int num = numerator * r.denominator - r.numerator * denominator;
       int denom = denominator * r.denominator;

       return new Fraction(num, denom);
   }

   public Fraction multiply(Fraction r) {
       int num = numerator * r.numerator;
       int denom = denominator * r.denominator;

       return new Fraction(num, denom);
   }

   public Fraction divide(Fraction r) {

       int num = numerator * r.denominator;
       int denom = denominator * r.numerator;

       return new Fraction(num, denom);
   }

//The greatest common divisor (gcd)
   public static int gcd(int num1, int num2) {
       int nume = Math.abs(num1);
       int deno = Math.abs(num2);

       while (nume != deno) {
           if (nume > deno) {
               nume = nume - deno;
           } else if (nume == 0) {
               nume = deno;
           }

           else {
               deno = deno - nume;
           }
       }
       return nume;
   }

   public float printAsFloat() {
       float num = (float) numerator;
       float denom = (float) denominator;
       float x = num / denom;
       System.out.println(x);
       return x;
   }

   public int numberOfFractions() {
       return (count /2 );
   }

   public static void read() 
   {
       
       Scanner input = new Scanner(System.in);

       System.out.print("$ java FractionTest Please enter 2 fractions – ");

       System.out.println(" ");

       System.out.println("Fraction 1:");

       System.out.print("Enter an integer numerator: ");

       int num1 = input.nextInt();

       System.out.print("Enter an integer denominator: ");

       int denom1 = input.nextInt();

       Fraction a = new Fraction(num1, denom1);
       
       System.out.println(" ");

//Ask for second fraction

       System.out.print("$ java FractionTest Please enter 2 fractions – ");

       System.out.println(" ");

       System.out.println("Fraction 2:");

       System.out.print("Enter an integer numerator: ");

       int num2 = input.nextInt();

       System.out.print("Enter an integer denominator: ");

       int denom2 = input.nextInt();

       Fraction b = new Fraction(num2, denom2);

//Sent it to fraction class

       Fraction c;//for calling the test() once;

       System.out.println(" ");

       c = a.add(b);
       System.out.print(a + " + " + b + " = " + a.add(b) + " = ");
       c.printAsFloat();

       c = a.subtract(b);
       System.out.print(a + " - " + b + " = " + a.subtract(b) + " = ");
       c.printAsFloat();

       c = a.multiply(b);
       System.out.print(a + " * " + b + " = " + a.multiply(b) + " = ");
       c.printAsFloat();

       c = a.divide(b);
       System.out.print(a + " / " + b + " = " + a.divide(b) + " = ");
       c.printAsFloat();

       System.out.println(" ");

       System.out.println(a.numberOfFractions() + " fractions have been created");

   }

   private static void test() {
       Fraction c = new Fraction(1, 3);
       Fraction d = new Fraction(2, 4);
       Fraction e = new Fraction(0, 1);// initialize by giving value
       System.out.println("e = " + e);
       e = c.add(d);
       System.out.print(c + " + " + d + " = " + e + " = ");
       e.printAsFloat();
       System.out.println();
       count = count -3;
      
   }

   @Override
   public String toString() {
       count++;
       return "(" + numerator + "/" + denominator + ")";
   }

}

