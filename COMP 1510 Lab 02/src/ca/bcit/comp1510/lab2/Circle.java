package ca.bcit.comp1510.lab2;

import java.util.Scanner;

/**
* The Circle class calculates the area and circumference of a circle.
* 
* @author Wilburt Herrera
* @version 2017
*/
public class Circle {
    /**
     * Pi.
     */
    public static final double PI = 3.14159;

    
    /**
    * Drives the program.
    * @param args unused
    */
    public static void main(String[] args) {
        
        double radius;
        Scanner myScanner = new Scanner(System.in);
        
        // prompts the user to enter a number
        System.out.println("Enter a radius value: ");
        radius = myScanner.nextDouble();
   
        double circumference = 2 * PI * radius;
        
        // prints the circumference of the circle
        System.out.println("Circumference: " + circumference);
        
        double area = PI * radius * radius;
        
        // prints the area of the circle
        System.out.println("Area: " + area);
        
        double doubleRadius = radius * 2;
        double area2nd = PI * doubleRadius * doubleRadius;
        double circumference2nd = 2 * PI * doubleRadius;
        
        // prints how many times the circumferences increases by
        System.out.println("When the radius doubles, the circumference "
            + "increases by " + (circumference2nd / circumference) 
                + " times. ");
        
        // prints the circumference doubled
        System.out.println("Circumference Doubled: " + circumference2nd);

        
        // prints how many times the area increases by
        System.out.println("When the radius doubles, the area increases by: " 
            + (area2nd / area) + " times.");
     
        // prints the area doubled
        System.out.println("Area Doubled: " + area2nd);
        
        myScanner.close();
    }
    
}
