package ca.bcit.comp1510.lab5;

/**
 * To scan user input.
 */
import java.util.Scanner;

/**
 * To format output.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Driver for Sphere, Cube, and Cone classes.
 * @author Burt
 * @version 1.0
 */
public class GeometryDriver {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        /**
         * Creates a scanner object.
         */
        Scanner scan = new Scanner(System.in);
        
        /**
         * Decimal format object for 3 decimal places.
         */
        // Not used as rest of program uses NumberFormat instead
        DecimalFormat fmtDec = new DecimalFormat("0.###");
        
        /**
         * Number format object for 3 decimal places.
         */
        NumberFormat fmtNum = NumberFormat.getInstance();
        fmtNum.setMaximumFractionDigits(3);
        
        double x;
        double y;
        double z;
        double r;
        double a;
        double h;
        
        /**
         * Prompts and stores user input for Sphere object parameters.
         */
        System.out.println("Enter the x-coordinate of the Sphere");
        x = scan.nextDouble();
        System.out.println("Enter the y-coordinate of the Sphere");
        y = scan.nextDouble();
        System.out.println("Enter the z-coordinate of the Sphere");
        z = scan.nextDouble();
        System.out.println("Enter the radius of the Sphere");
        r = scan.nextDouble();
        
        /**
         * Creates sphere object.
         */
        Sphere sphere = new Sphere(x, y, z, r);
        
        /**
         * Outputs Sphere's surface area and volume
         */
        System.out.println("The sphere's surface area is: " 
            + fmtNum.format(sphere.getSurfaceArea()));
        System.out.println("The sphere's volume is: "
            + fmtNum.format(sphere.getVolume()));
        System.out.println();
        
        /**
         * Prompts and stores user input for Cube object parameters.
         */
        System.out.println("Enter the x-coordinate of the Cube");
        x = scan.nextDouble();
        System.out.println("Enter the y-coordinate of the Cube");
        y = scan.nextDouble();
        System.out.println("Enter the z-coordinate of the Cube");
        z = scan.nextDouble();
        System.out.println("Enter the edge length of the Cube");
        a = scan.nextDouble();
        
        /**
         * Creates a Cube object.
         */
        Cube cube = new Cube(x, y, z, a);
        
        /**
         * Outputs Cube's surface area, volume, face diagonal
         * and space diagonal.
         */
        System.out.println("The cube's suface area is: "
            + fmtNum.format(cube.getSurfaceArea()));
        System.out.println("The cube's volume is: "
            + fmtNum.format(cube.getVolume()));
        System.out.println("The cube's face diagonal is: "
            + fmtNum.format(cube.getFaceDiagonal()));
        System.out.println("The cube's space diagoinal is: "
            + fmtNum.format(cube.getSpaceDiagonal()));
        System.out.println();
        
        /**
         * Prompts and stores user input for Cone object parameters.
         */
        System.out.println("Enter the radius of the Cone");
        r = scan.nextDouble();
        System.out.println("Enter the height of the Cone");
        h = scan.nextDouble();
        
        /**
         * Creates Cone object.
         */
        Cone cone = new Cone(r, h);
        
        /**
         * Outputs Cone's volume, slant height, and surface area.
         */
        System.out.println("The cone's volume is: "
            + fmtNum.format(cone.getVolume()));
        System.out.println("The cone's slant height is: "
            + fmtNum.format(cone.getSlantHeight()));
        System.out.println("The cone's surface area is: "
            + fmtNum.format(cone.getSurfaceArea()));
        System.out.println();
        
        // Closes Scanner object
        scan.close();
    }

}
