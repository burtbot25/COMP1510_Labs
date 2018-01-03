package ca.bcit.comp1510.lab9;

/**
 * Collision finds how many random walkers occupy the same space.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Collision {

    /**
     * Maximum steps of the walkers.
     */
    public static final int MAX_STEPS = 100000;
    
    /**
     * Boundary of the walkers.
     */
    public static final int BOUNDARY = 200000;
    
    /**
     * Starting X-coordinate of Walker1.
     */
    public static final int START_X1 = -3;
    
    /**
     * Starting X-coordinate of Walker2.
     */
    public static final int START_X2 = 3;
    
    /**
     * Starting Y-coordinate of both walkers.
     */
    public static final int START_Y = 0;
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        RandomWalker rick = 
                new RandomWalker(MAX_STEPS, START_X1, START_Y, BOUNDARY);
        RandomWalker darryl = 
                new RandomWalker(MAX_STEPS, START_X2, START_Y, BOUNDARY);
        int count = 0;
        
        for (int i = 0; i <= MAX_STEPS; i++) {
            rick.takeStep();
            darryl.takeStep();
            samePosition(rick, darryl);
            if (samePosition(rick, darryl)) {
                System.out.println("Collision at (" + rick.getX() 
                    + " , " + rick.getY() + ")");
                count++;
                if (count == 1) {
                    System.out.println("They have collided: " 
                            + count + " time!");
                } else {
                    System.out.println("They have collided: " 
                            + count + " times!");
                }
            }
        }

        if (count == 0) {
            System.out.println("No Collisions!");
        }
    }
    
    /**
     * Determines if the walkers are in the same position.
     * @param walker1 a RandomWalker obj.
     * @param walker2 a RandomWalker obj.
     * @return a boolean if they are in the same position.
     */
    public static boolean samePosition(
            RandomWalker walker1, RandomWalker walker2) {
        
        return (walker1.getX() == walker2.getX() 
                && walker1.getY() == walker2.getY());
    }
}
