package ca.bcit.comp1510.lab9;

import java.util.Random;

/**
 * RandomWalker class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class RandomWalker {
    
    /**
     * Direction of steps for takeStep.
     */
    public static final int DIRECTION = 4;
    
    /**
     * Step right.
     */
    public static final int RIGHT = 0;
    
    /**
     * Step left.
     */
    public static final int LEFT = 1;
    
    /**
     * Step up.
     */
    public static final int UP = 2;
    
    /**
     * Step down.
     */
    public static final int DOWN = 3;
    
    /**
     * X-coordinate.
     */
    private int x;
    
    /**
     * Y-coordinate.
     */
    private int y;
    
    /**
     * Max Steps.
     */
    private int maxSteps;
    
    /**
     * Current number of steps.
     */
    private int currentSteps;
    
    /**
     * Boundary of the grid.
     */
    private int boundary;

    /**
     * Maximum distance of the walker.
     */
    private int maximumDistance;
    
    /**
     * Tracks the farthest distance x or y has traveled.
     */
    private int farthest;
    
    /**
     * Random object.
     */
    private Random random;
    
    /**
     * Constructs an object of type RandomWalker.
     * @param maxSteps an int.
     * @param boundary an int.
     */
    public RandomWalker(int maxSteps, int boundary) {
        this.maxSteps = maxSteps;
        this.boundary = boundary;
        this.x = 0;
        this.y = 0;
        this.currentSteps = 0;
        maximumDistance = 0;
        random = new Random();
    }
    
    /**
     * Constructs an object of type RandomWalker.
     * @param maxSteps an int.
     * @param x an int.
     * @param y an int.
     * @param boundary an int.
     */
    public RandomWalker(int maxSteps, int x, int y, int boundary) {
        this.maxSteps = maxSteps;
        this.x = x;
        this.y = y;
        this.boundary = boundary;
        this.currentSteps = 0;
        maximumDistance = 0;
        random = new Random();
    }
    

    /**
     * Returns the maxSteps for this RandomWalker.
     * @return maxSteps an int.
     */
    public int getMaxSteps() {
        return maxSteps;
    }

    /**
     * Returns the currentSteps for this RandomWalker.
     * @return currentSteps an int.
     */
    public int getCurrentSteps() {
        return currentSteps;
    }

    /**
     * Returns the x for this RandomWalker.
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y for this RandomWalker.
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * Takes a step in a direction based off a random number.
     */
    public void takeStep() {
        int steps = random.nextInt(DIRECTION);
        
        switch (steps) {
        case RIGHT :
            x++;
            break;
        
        case LEFT :
            x--;
            break;
        
        case UP :
            y++;
            break;
            
        case DOWN :
            y--;
            break;
            
        default :
            break;
        }
        

        if (Math.abs(x) > Math.abs(y) && Math.abs(x) > farthest) {
            farthest++;
        } else if (Math.abs(y) > Math.abs(x) && Math.abs(y) > farthest) {
            farthest++;
        }
        if (farthest > max(x, y)) {
            // maximumDistance is farthest distance traveled.
            maximumDistance = farthest;
        } else {
            // maximumDistance is distance of current location.
            maximumDistance = max(x, y);
        }
        
        currentSteps++;
    }
    
    /**
     * Returns the maximumDistance for this RandomWalker.
     * @return maximumDistance
     */
    public int getMaximumDistance() {
        return maximumDistance;
    }

    /**
     * Determines if there are more steps that can be taken before
     * being out of bounds.
     * @return boolean.
     */
    public boolean moreSteps() {
        return (currentSteps < maxSteps);
    }
    
    /**
     * <p>Determines if the coordinates are within bounds of the grid.
     * Boundary is times 2 as a boundary of 5 creates a 10x10 grid.</p>
     * @return boolean
     */
    public boolean inBounds() {
        return (Math.abs(x) < (boundary * 2)
                && Math.abs(y) < (boundary * 2));
    }

    /**
     * Takes a step as long as there are more steps to be taken
     * and walker is within bounds.
     */
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }
    
    /**
     * Private support method to get max steps.
     * @param a an int.
     * @param b an int.
     * @return maximum of a and b.
     */
    private int max(int a, int b) {        
        return (Math.abs(a) > Math.abs(b) ? Math.abs(x) : Math.abs(y));
    }
    
    /**
     * Returns a String representation of the RandomWalker.
     * @see java.lang.Object#toString()
     * @return
     */
    @Override
    public String toString() {
        return "RandomWalker [x=" + x + ", y=" + y + ", maxSteps=" 
                + maxSteps + ", currentSteps=" + currentSteps
                + ", boundary=" + boundary + "]";
    }
    
}
