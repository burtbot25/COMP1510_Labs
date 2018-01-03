package ca.bcit.comp1510.lab3;

// For user input
import java.util.Scanner;

// For formatting
import java.text.DecimalFormat;

/**
 * Measures distance between two lines.
 * @author Wilburt Herrera
 * @version 1.0
 */
public class Distance {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        double x1;
        double y1;
        double x2;
        double y2;
        
        // Get user's input
        Scanner scan = new Scanner(System.in);
        
        // Obtaining Coordinates of Two Points
        // Point 1
        System.out.println("Enter the x coordinate of the first point: ");
        x1 = scan.nextDouble();
        System.out.println("Enter the y coordinate of the first point: ");
        y1 = scan.nextDouble();
        
        // Point 2
        System.out.println("Enter the x coordinate of the " 
            + "second point: ");
        x2 = scan.nextDouble();
        System.out.println("Enter the y coordinate of the " 
            + "second point: ");        
        y2 = scan.nextDouble();
        
        // Calculates the square roots of the coordinates
        double xDistance = Math.pow((x2 - x1), 2);
        double yDistance = Math.pow((y2 - y1), 2);
        
        double finalDistance = Math.sqrt((xDistance + yDistance));
        System.out.println("The distance of the two coordinates is: " 
            + finalDistance);
        
        scan.close();
        
        // Formats and displays the final answer
        DecimalFormat dFormatter = new DecimalFormat("#.##");
        System.out.println("The answer rounded to 2 decimals points is: " 
            + dFormatter.format(finalDistance));
        
    }

}
