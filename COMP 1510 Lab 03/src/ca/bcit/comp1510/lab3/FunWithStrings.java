package ca.bcit.comp1510.lab3;

// To obtain user input
import java.util.Scanner;

/**
 * Demonstrates String methods and String object mutations.
 * @author Wilburt Herrera
 * @version 1.0
 */
public class FunWithStrings {

    /**
     * Drives the program.
     * @param args unused
     * 
     */
    public static void main(String[] args) {
        
        // Scans user input
        Scanner scan = new Scanner(System.in);
        String input;
        
        // Prompts user to enter a book title
        System.out.println("Enter the title of you favourite book: ");
        input = scan.nextLine(); // "scan.next()" will accept any input
        System.out.println("You entered: " + input);
        
        // Counts characters of the title
        System.out.println("The number of characters in your title: " 
            + input.length());
        
        // Determines if title starts with "The"
        Boolean findThe;
        findThe = input.startsWith("The");
        System.out.println("Your book title starts with \"The\": " 
            + findThe.toString());
        
        // Changes cases of the title
        System.out.println("Your title in upper case: " + input.toUpperCase());
        System.out.println("Your title in lower case: " + input.toLowerCase());
        
        // Trims unnecessary whitespace before and after the title
        String trimmedUserInput = input.trim();
        System.out.println("Your title trimmed: " + trimmedUserInput);
        
        // Formats title with first and last character capitalized
        String lowerCaseTrim = trimmedUserInput.toLowerCase();
        
        String firstChar = trimmedUserInput.substring(0, 1);
        String titleCase = firstChar.toUpperCase();
        
        String lastChar = input.substring(input.length() - 1);
        String titleLast = lastChar.toUpperCase();
        
        // Displays the final permutation
        System.out.println("Your title with first and last character " 
                + "in upper case: " + titleCase 
                    + lowerCaseTrim.substring(1, lowerCaseTrim.length() - 1) 
                        + titleLast);
 
        scan.close();

    }
    
}
