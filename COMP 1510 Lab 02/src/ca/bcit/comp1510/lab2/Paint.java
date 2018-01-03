package ca.bcit.comp1510.lab2;

import java.util.Scanner;

/**
 * The Paint class calculates the number of paint cans to buy.
 * 
 * @author Wilburt Herrera
 * @version 2017
 */
public class Paint {
    
    /** 
     * Surface area of a gallon of paint.
     * 
     */
    public static final int COVERAGE = 400;
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        
        // Prompts user to enter the length
        System.out.println("Enter length of room in feet");
        int length = myScanner.nextInt();
        
        // Prompts user to enter the width
        System.out.println("Enter width of room in feet");
        int width = myScanner.nextInt();
        
        // Prompts user to enter the height
        System.out.println("Enter height of room in feet");
        int height = myScanner.nextInt();
        
        // Prompts user to enter number of coast
        System.out.println("Enter number of coats");
        int coats = myScanner.nextInt();
        
        int surfaceArea = 2 * (length * height) + 2 * (height * width) 
            + (width * length);
        double coverageNeeded = surfaceArea * coats;
        double cansOfPaintNeeded = coverageNeeded / COVERAGE;
        
        System.out.println("You need to buy: " + cansOfPaintNeeded + " cans");
        
        myScanner.close();
    }
}

