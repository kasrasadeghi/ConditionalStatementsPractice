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
        guardedInfoTable();
        // linearEquationSolver();
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
        
    }
    
    public static void quadraticEquationSolver()
    {
        
    }
    
}
