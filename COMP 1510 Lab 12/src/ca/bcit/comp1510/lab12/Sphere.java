package ca.bcit.comp1510.lab12;

/**
 * Sphere class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Sphere extends Shape {

    /**
     * Coefficient used for calculating the Surface Area.
     */
    public static final int SA_COEFFICIENT = 4;
    
    /**
     * Coefficient used for calculating the Surface Area.
     */
    public static final int SQUARE = 2;
    
    /**
     * Radius of the sphere.
     */
    private double radius;
    
    /**
     * Constructs an object of type Sphere.
     * @param radius a double.
     */
    public Sphere(double radius) {
        
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }   
    }

    /**
     * Calculates the surface area of the sphere.
     * @see ca.bcit.comp1510.lab12.Shape#surfaceArea()
     * @return
     */
    @Override
    public double surfaceArea() {
        double surfaceArea = (SA_COEFFICIENT * Math.PI 
            * Math.pow(this.radius, SQUARE));
        return surfaceArea;
    }

    /**
     * Returns a String representation of the Sphere.
     * @see java.lang.Object#toString()
     * @return
     */
    @Override
    public String toString() {
        return "Sphere [radius=" + radius + "]";
    }
    
    
    
}
