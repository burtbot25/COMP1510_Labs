package ca.bcit.comp1510.lab4;

/**
 * Reads user input.
 */
import java.util.Scanner;

/**
 * Demonstrates the use of integer wrappers.
 * @author Wilburt
 * @version 1.0
 */
public class IntegerWrapper {
    
    /**
     * Maximum Integer value.
     */
    public static final int MAX = Integer.MAX_VALUE;
    
    /**
     * Minimum Integer value.
     */
    public static final int MIN = Integer.MIN_VALUE;
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        // Creates Scanner object
        Scanner scan = new Scanner(System.in);
        
        // Prompts for user input
        System.out.println("Please enter an integer: ");
        int input = scan.nextInt();
        
        // Converts input to binary, octal and hex
        String binary = Integer.toBinaryString(input);
        String octal = Integer.toOctalString(input);
        String hex = Integer.toHexString(input);
        
        // Prints user's input as binary, octal, and hex
        System.out.println("Your integer in binary: " + binary);
        System.out.println("Your integer in octal: " + octal);
        System.out.println("Your integer in hexadecimal: " + hex);
        
        // Prints the largest and smallest java integer
        System.out.println("The maximum java integer value is: " + MAX);
        System.out.println("The minimum java integer value is: " + MIN);
        
        // Prompts user for 2 integers
        System.out.println("Enter your first intger: ");
        String integer1 = scan.next();
        System.out.println("Enter your second integer: ");
        String integer2 = scan.next();
        
        // Converts the user inputs from a string into an int 
        int number1 = Integer.parseInt(integer1);
        int number2 = Integer.parseInt(integer2);
        
        // Adds the user's inputs together
        System.out.println("The sum of your inputs is: " + (number1 + number2));
        
        // Closes the scanner
        scan.close();
    }

}
