package ca.bcit.comp1510.lab2;

import java.util.Scanner;

/**
 * BaseConvert.
 *
 * @author BCIT
 * @version 1.0
 */
public class BaseConvert {
    
    /**
     * Power used for the base.
     */
    static final int POWER = 4;
    /**
     * Drives the program.
     *
     * @param args
     *            arguments
     */
    public static void main(String[] args) {
        int base10number; // the number in base 10
        int base; // the new base
        int maximumNumber = 0; // the maximum number that will fit
        // in 4 digits in the new base
        int place0; // digit in the 1's (base^0) place
        int place1;
        int place2;
        int place3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Base Conversion Program");
        System.out.print("Please enter a base (2-9): ");
        
        // Assign the user's input to the base variable
        base = scan.nextInt();
        
        // Calculate the correct value to store in maxNumber
        maximumNumber = ((int) Math.pow(base, POWER) - 1);
        
        System.out.println("The max base 10 number to convert for that base " 
            + "is " + maximumNumber);
        
        System.out.print("Please enter a base 10 number to convert: ");
        
        // Assign the user's input to the base10number variable
        base10number = scan.nextInt();
        
        // Do the conversion
        // First compute place0 -- the units place. Remember this comes
        // from the first division so it is the remainder when the
        // base 10 number is divided by the base (HINT %).
        place0 = base10number % base;
        
        // Then compute the quotient (integer division / will do it!) -
        // You can either store the result back in base10Num or declare a
        // new variable for the quotient
        int quotient1 = base10number / base;
        
        // Now compute place1 -- this is the remainder when the quotient
        // from the preceding step is divided by the base.
        place1 = quotient1 % base;
        
        // Then compute the new quotient
        int quotient2 = quotient1 / base;
        
        // Repeat the idea from above to compute place2 and the next quotient
        place2 = quotient2 % base;
        int quotient3 = quotient2 / base;
        
        // Repeat again to compute place3
        place3 = quotient3 % base;
        
        // Print the result
        String baseBNumber = new String("The converted number is " 
            + place3 + place2 + place1 + place0); // the number in the new base
        
        System.out.println(baseBNumber);
        scan.close();
    }
}
