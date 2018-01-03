package ca.bcit.comp1510.lab12;

import java.util.Scanner;

/**
 * PaintThings tests the different Shape classes.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class PaintThings {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        int coverage;
        int sideLength;
        int sRadius;
        int cylRadius;
        int height;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How much coverage does a can of" 
            + " your favourite paint provide?");
        coverage = scan.nextInt();
        
        PaintCan can = new PaintCan(coverage);
        
        System.out.println("Enter the cube's side: ");
        sideLength = scan.nextInt();
        Cube cube = new Cube(sideLength);
        System.out.println(can.amount(cube) + " cans of paint required");
        
        System.out.println("Enter the sphere's radius: ");
        sRadius = scan.nextInt();
        Sphere sphere = new Sphere(sRadius);
        System.out.println(can.amount(sphere) + " cans of paint required");
        
        System.out.println("Enter the cylinder's radius: ");
        cylRadius = scan.nextInt();
        System.out.println("Enter the cylinder's height: ");
        height = scan.nextInt();
        Cylinder cylinder = new Cylinder(cylRadius, height);
        System.out.println(can.amount(cylinder) + " cans of paint required");
    }

}
