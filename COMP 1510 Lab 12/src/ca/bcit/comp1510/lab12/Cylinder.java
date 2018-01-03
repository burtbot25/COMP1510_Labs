package ca.bcit.comp1510.lab12;

/**
 * Cylinder class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Cylinder extends Shape {

    /**
     * Coefficient used for calculating the Surface Area.
     */
    public static final int SA_COEFFICIENT = 2;
    
    /**
     * Radius of the cylinder.
     */
    private double radius;
    
    /**
     * Height of the cylinder.
     */
    private double height;
    
    /**
     * Constructs an object of type Cylinder.
     * @param radius a double.
     * @param height a double.
     */
    public Cylinder(double radius, double height) {
        if (radius > 0 || height > 0) {
            this.radius = radius;
            this.height = height;
        } else {
            throw new IllegalArgumentException(
                "Radius and Height must be greater than 0");
        }
    }

    /**
     * Calculates the surface area of the Cube.
     * @see ca.bcit.comp1510.lab12.Shape#surfaceArea()
     * @return
     */
    @Override
    public double surfaceArea() {
        double surfaceArea = SA_COEFFICIENT * Math.PI 
                * radius * (radius + height);
        return surfaceArea;
    }

    /**
     * Returns a String representation of the Cylinder.
     * @see java.lang.Object#toString()
     * @return
     */
    @Override
    public String toString() {
        return "Cylinder [radius=" + radius + ", height=" + height + "]";
    }   
    
}
