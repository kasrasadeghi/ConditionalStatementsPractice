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
    
    public static void guardedInfoTable()
    {
        Scanner keyboard = new Scanner( System.in );
        
        System.out.println( "Enter number of people:");
        int peopleNumber = keyboard.nextInt();
        String[] names = new String[peopleNumber];
        int[] ages = new int[peopleNumber];
        String[] color = new String[peopleNumber];
        String[] order = { "first", "second", "third", "fourth", "fifth" };
        String t = "\t";
        
        for (int i = 0; i <peopleNumber; ++i) {
            try {
                System.out.println( "Enter the " + order[i] + " person's name:");
                names[i] = keyboard.next();
            } 
            catch (InputMismatchException exception) {
                System.out.println( "The name must be a string.");
            }
            
            try {
                System.out.println( "Enter " + names[i] + "'s age:");
                ages[i] = keyboard.nextInt();
            } 
            catch (InputMismatchException exception) {
                System.out.println( "The age must be an integer.");
            }
            
            try {
                System.out.println( "Enter " + names[i] + "'s favourite color:");
                color[i] = keyboard.next();
            } 
            catch (InputMismatchException exception) {
                System.out.println( "The color must be a string.");
            }
        }
        
        System.out.println( "Name\t\tAge\t\tFavorite Color \n"
                + "=====================================================");
        
        for (int j = 0; j<peopleNumber; ++j) {
            System.out.println( names[j] + t + t + ages[j] + t + t + color[j]);
        }
    }
    
    public static void linearEquationSolver()
    {
        
    }
    
    public static void quadraticEquationSolver()
    {
        
    }
    
}
