/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalstatementspractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionalStatementsPractice {

    
    public static void main(String[] args) 
    {
        // guardedInfoTable();
        linearEquationSolver();
        // quadraticEquationSolver();
    }
    
    public static int inputInteger() 
    {
        Scanner keyboard = new Scanner( System.in);
        int output = -1;
        try {
            output = keyboard.nextInt();
        }
        catch(InputMismatchException exception) {
            System.out.println( "The input must be an integer.");
        }
        if ( output != -1) return output;
        return inputInteger();     
    }
    
    public static double inputDouble() 
    {
        Scanner keyboard = new Scanner( System.in);
        double output = -1;
        try {
            output = keyboard.nextDouble();
        }
        catch(InputMismatchException exception) {
            System.out.println( "The input must be an double.");
        }
        if ( output != -1) return output;
        return inputDouble();     
    }
    
    public static String inputString() 
    {
        Scanner keyboard = new Scanner( System.in);
        String output= null;
        try {
            output = keyboard.next();
        }
        catch(InputMismatchException exception) {
            System.out.println( "The input must be a string.");
        }
        if( output!= null) return output;
        return inputString();
    }
    
    public static void guardedInfoTable()
    {
        Scanner keyboard = new Scanner( System.in );
        
        System.out.println( "Enter number of people:");
        int peopleNumber = keyboard.nextInt();
        String[] names = new String[peopleNumber];
        int[] ages = new int[peopleNumber];
        String[] colors = new String[peopleNumber];
        String[] order = { "first", "second", "third", "fourth", "fifth" };
        String t = "\t\t";
        
        for (int i = 0; i <peopleNumber; ++i) {
            
            System.out.println( "Enter the " + order[i] + " person's name:");
            names[i] = inputString();
            
            System.out.println( "Enter " + names[i] + "'s age:");
            ages[i] = inputInteger();
            
            System.out.println( "Enter " + names[i] + "'s favourite color:");
            colors[i] = inputString();
        }
        
        System.out.println( "Name" +t+ "Age" +t+ "Favorite Color \n"
                + "=====================================================");
        
        for (int j = 0; j<peopleNumber; ++j) {
            System.out.println( names[j] + t + ages[j] + t + colors[j]);
        }
    }
    
    public static void linearEquationSolver()
    {
      /*TODO:
        make basic solution using inputDouble
        account for special case "no solution"
        account for special case "all reals"
        */
        
        System.out.println("Enter the coefficients and constants in the equation"
                + " Ax + B = Cx + D.");
        System.out.print("A = ");
        double A = inputDouble();
        System.out.print("B = ");
        double B = inputDouble();
        System.out.print("C = ");
        double C = inputDouble();
        System.out.print("D = ");
        double D = inputDouble();
        System.out.println();
        
        double solution = (D - B)/(A - C);
        
        String signB = "+ ";
        String signD = "+ ";
        if (B < 0) signB = "- ";
        if (D < 0) signD = "- ";
        System.out.printf( "Solving the equation %.1fx " + signB + "%.1f = %.1fx " 
                + signD + "%.1f \n\n", A, Math.abs(B), C, Math.abs(D));
        
        if (solution == Double.POSITIVE_INFINITY) 
            System.out.println( "There are no real solutions.");
        else if (solution == Double.NaN)
            System.out.println( "The solution is all real numbers.");
        else System.out.println("The solution is x = " + solution + ".");
        
    }
    
    public static void guassianEliminationEquationSolver()
    {
        //TODO: try to make for fun
        //TODO: actually use linear algebra
        // format: "5x + 5y = 4x - 3"
        // ask for more formulas
        // simplification code
    }
    
    public static void quadraticEquationSolver()
    {
        
    }
    
}
