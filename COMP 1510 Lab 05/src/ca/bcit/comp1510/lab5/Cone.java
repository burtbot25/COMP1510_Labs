
package ca.bcit.comp1510.lab5;

/**
 * Cone stores 4 parts.
 * 
 * @author Wilburt
 * @version 1.0
 */
public class Cone {
    
    /**
     * Used for Cone volume calculation.
     */
    private static final double THREE = 3.0;
    
    /**
     * Used for Cone volume, slant height, and surface calculation.
     */
    private static final double TWO = 2.0;

    /**
     * Used for Cone volume calculation.
     */
    private static final double ONE = 1.0;
    
    /**
     * Radius of the cone.
     */
    private double radius;
    
    /**
     * Height of the cone.
     */
    private double height;
    
    /**
     * Constructs an object of type Cone.
     * @param radius a double.
     * @param height a double.
     */
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    
    /**
     * Returns the radius.
     * @return radius a double.
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Sets the radius.
     * @param radius the radius to set.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Returns the height.
     * @return height a double.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height.
     * @param height the height to set.
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Returns the volume.
     * @return volume a double.
     */
    public double getVolume() {
        double volume = ((ONE / THREE) * Math.PI * Math.pow(radius, TWO) 
            * height);
        return volume;
    }
    
    /**
     * Returns the slant height.
     * @return slant height a double.
     */
    public double getSlantHeight() {
        double slantHeight = (Math.sqrt((Math.pow(radius, TWO)) 
            + Math.pow(height, TWO)));
        return slantHeight;
    }
    
    /**
     * Returns the surface area.
     * @return surface area a double.
     */
    public double getSurfaceArea() {
        double surfaceArea = ((Math.PI * Math.pow(radius, TWO))     
            + ((Math.PI * radius) * Math.sqrt(Math.pow(radius, TWO) 
            + Math.pow(height, TWO))));
        return surfaceArea;    
    }

    /**
     * Returns a string representation of this object's state.
     * @return representation as a string.
     */
    @Override
    public String toString() {
        return "Cone [radius=" + radius + ", height=" + height + "]";
    }
    
}
