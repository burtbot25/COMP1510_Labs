package ca.bcit.comp1510.lab9;

import java.util.Scanner;

/**
 * DrunkWalker determines how many drunk walkers fell out of bounds.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class DrunkWalker {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter an integer for the boundary");
        int boundary = scan.nextInt();
        System.out.println("Please enter an integer for the number of steps");
        int numSteps = scan.nextInt();
        System.out.println("Please enter an integer for " 
            + "the number of Drunk Walkers");
        int numWalkers = scan.nextInt();
        
        for (int i = 1; i <= (numWalkers - 1); i++) {
            RandomWalker randomWalker = new RandomWalker(numSteps, boundary);
            randomWalker.walk();
            if (!randomWalker.inBounds()) {
                count++;
            }
            System.out.println("***Drunk " + i + "***");
            System.out.println("current steps " 
                + randomWalker.getCurrentSteps());
            System.out.println("max steps " + randomWalker.getMaxSteps());
        }
        
        if (count == 1) {
            System.out.println("After " + numWalkers + " trials, " 
                    + count + " drunk fell off!");
        } else {
        System.out.println("After " + numWalkers + " trials, " 
            + count + " drunks fell off!");
        }
        
        scan.close();
    }

}
