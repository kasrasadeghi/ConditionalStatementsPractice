/*  Author: Kasra Sadeghi  
 *  Version 3.4
 */ 
package conditionalstatementspractice;

import java.util.Scanner;

public class ConditionalStatementsPractice {

    
    public static void main(String[] args) 
    {
        // guardedInfoTable();
        // linearEquationSolver();
         quadraticEquationSolver();
    }
    
    public static double inputDouble()
    {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble())
            return sc.nextDouble();
        else{
            System.out.println( "You must input a double.");
            System.exit(0);
            return inputDouble();
        }
    }
    
    public static String inputString()
    {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext())
            return sc.next();
        else{
            System.out.println( "You must input a string.");
            System.exit(0);
            return inputString();
        }
    }
    
    public static int inputInt()
    {
        Scanner sc = new Scanner( System.in);
        if (sc.hasNextInt())
            return sc.nextInt();
        else {
            System.out.println( "You must input an integer.");
            System.exit(0);
            return inputInt();
        }
    }
    
    public static void guardedInfoTable()
    {
        System.out.println( "Enter number of people:");
        int peopleNumber = 0;
        peopleNumber = inputInt();
        String[] names = new String[peopleNumber];
        int[] ages = new int[peopleNumber];
        String[] colors = new String[peopleNumber];
        String[] order = { "first", "second", "third", "fourth", "fifth" };
        String t = "\t\t";
        
        for (int i = 0; i <peopleNumber; ++i) {
            
            System.out.println( "Enter the " + order[i] + " person's name:");
            names[i] = inputString();
            
            System.out.println( "Enter " + names[i] + "'s age:");
            ages[i] = inputInt();
            
            System.out.println( "Enter " + names[i] + "'s favourite color:");
            colors[i] = inputString();
        }
        
        System.out.println( "Name" +t+ "Age" +t+ "Favorite Color \n"
                + "=====================================================");
        
        for (int j = 0; j<peopleNumber; ++j) {
            System.out.println( names[j] +t+ ages[j] +t+ colors[j]);
        }
    }
    
    public static void linearEquationSolver()
    {
        
        System.out.println("Enter the coefficients and constants in the equation"
                + " Ax + B = Cx + D.");
        System.out.println("Please input A:");
        double A = inputDouble();
        System.out.println("Please input B:");
        double B = inputDouble();
        System.out.println("Please input C:");
        double C = inputDouble();
        System.out.println("Please input D:");
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
            System.out.println( "There are no solutions.");
        else if (solution == Double.NaN)
            System.out.println( "The solution is all real numbers.");
        else System.out.println("The solution is x = " + solution + ".");
        
    }
    
    public static void quadraticEquationSolver()
    {
        System.out.println("Enter the coefficients and constants in the equation"
                + " Ax^2 + Bx + C = 0.");
        System.out.println("Please input A:");
        double A = inputDouble();
        System.out.println("Please input B:");
        double B = inputDouble();
        System.out.println("Please input C:");
        double C = inputDouble();
        
        System.out.printf( "Solving equation %.2fx^2 + %.2fx + %.2f = 0.\n\n", A, B, C);
        if (A == 0) {
            if (B == 0) {
                System.out.println( "There are no solutions for this equation.");
                return;
            }
            
            double solution = (-C)/B;
            System.out.println( "This is not a quadratic equation, "
                    + "but the solution is x = " + solution);
            return;
        }
        double det = B*B - 4*A*C;
        
        if (det < 0) {
            det = Math.abs(det);
            
            String realComponent = Double.toString((-B)/(2*A));
            String unrealComponent = (Math.sqrt(det)/(2*A)) + "i";
            
            System.out.println( "The solutions are x = " 
                + realComponent + " + " + unrealComponent + " and x = "
                + realComponent + " - " + unrealComponent + ".");
        }
        else if (det == 0)
        {
            double solution = (-B)/(2*A);
            System.out.println("The solution is " + solution + ".");
        }
        else {
            double upperSolution = (-B + Math.sqrt(det))/(2*A);
            double lowerSolution = (-B - Math.sqrt(det))/(2*A);
            
            System.out.println("The solutions are x = " + upperSolution + " and x = "
            + lowerSolution + ".");
        }
    } 
}
