package ca.bcit.comp1510.lab12;

/**
 * Cube class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Cube extends Shape {

    /**
     * Coefficient used for calculating the Surface Area.
     */
    public static final int SA_COEFFICIENT = 6;
    
    /**
     * Square used for calculating the Surface Area.
     */
    public static final int SQUARE = 2;

    /**
     * Side length of the cube.
     */
    private double sideLength;
    
    /**
     * Constructs an object of type Cube.
     * @param sideLength a double.
     */
    public Cube(double sideLength) {
        if (sideLength > 0) {
            this.sideLength = sideLength;
        } else {
            throw new IllegalArgumentException(
                "Side length must be greater than 0");
        }
    }
    
    /**
     * Calculates the surface area of the Cube.
     * @see ca.bcit.comp1510.lab12.Shape#surfaceArea()
     * @return surfaceArea of the Cube.
     */
    @Override
    public double surfaceArea() {
        double surfaceArea = (SA_COEFFICIENT 
            * Math.pow(this.sideLength, SQUARE));
        return surfaceArea;
    }
    
    /**
     * Returns a String representation of the Cube.
     * @see java.lang.Object#toString()
     * @return a String.
     */
    @Override
    public String toString() {
        return "Cube [sideLength=" + sideLength + "]";
    }
    
}
