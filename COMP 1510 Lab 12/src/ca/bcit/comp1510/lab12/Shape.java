package ca.bcit.comp1510.lab12;

/**
 * Abstract shape class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public abstract class Shape {

    /**
     * Name of the shape.
     */
    private String name;
    
    /**
     * Calculates the surface area of the shape.
     * @return a double.
     */
    public abstract double surfaceArea();

    /**
     * Returns a String representation of the Shape.
     * @see java.lang.Object#toString()
     * @return a String.
     */
    @Override
    public String toString() {
        return "Shape [name=" + name + "]";
    }
    
    
    
}
