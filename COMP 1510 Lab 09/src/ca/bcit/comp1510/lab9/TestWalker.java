package ca.bcit.comp1510.lab9;

import java.util.Scanner;


/**
 * TestWalker tests the RandomWalker class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class TestWalker {
    
    /**
     * Tester value 10.
     */
    public static final int TEST10 = 10;
    
    /**
     * Tester value 5.
     */
    public static final int TEST5 = 5;
    
    /**
     * Tester value 200.
     */
    public static final int TEST200 = 200;
    
    /**
     * Number of steps for the user walker.
     */
    public static final int NUM_STEPS = 5;
    
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        RandomWalker walker = new RandomWalker(TEST10, TEST5);
        System.out.println("CPU Walker (10 Max Steps, 5 Boundary)");
        System.out.println(walker.toString());
        
        System.out.println("Please enter an integer for the max # of steps");
        int userMaxSteps = scan.nextInt();
        System.out.println("Please enter an integer for the boundary size");
        int userBoundary = scan.nextInt();

        RandomWalker userWalker = new RandomWalker(userMaxSteps, userBoundary);
        System.out.println("User Walker");
        System.out.println(userWalker.toString());

        

        System.out.println("User Walker takes 5 steps");
        for (int i = 0; i < NUM_STEPS; i++) {
            userWalker.takeStep();
            System.out.println(userWalker.toString());
        }
        System.out.println("MAXIMUM DISTANCE: " 
            + userWalker.getMaximumDistance());
        scan.close();
        
        System.out.println("The Walking Dead walks 200 steps " 
            + "within a boundary of 10");
        RandomWalker walkingDead = new RandomWalker(TEST200, TEST10);
        System.out.println("Walking Dead's original state");
        System.out.println(walkingDead);
        System.out.println("Walking Dead begins to walk");
        walkingDead.walk();
        System.out.println(walkingDead);
        
        System.out.println("Max Distance is/was: " 
            + walkingDead.getMaximumDistance());
        
    }

}
