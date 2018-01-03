package ca.bcit.comp1510.lab5;

/**
 * Sphere stores 4 parts.
 * 
 * @author Wilburt
 * @version 1.0
 */
public class Sphere {
    
    /**
     * Used for Sphere surface area and volume calculation.
     */
    private static final double FOUR = 4.0;
    
    /**
     * Used for Sphere volume calculation.
     */
    private static final double THREE = 3.0;
    
    /**
     * Used for Sphere surface area calculation.
     */
    private static final double TWO = 2.0;
    
    /**
     * x-coordinate of the sphere.
     */
    private double xCoordinate;
    
    /**
     * y-coordinate of the sphere.
     */
    private double yCoordinate;
    
    /**
     * z-coordinate of the sphere.
     */
    private double zCoordinate;
    
    /**
     * radius of the sphere.
     */
    private double radius;
    
    /**
     * Constructs an object of type Sphere.
     * @param xCoordinate a double
     * @param yCoordinate a double
     * @param zCoordinate a double
     * @param radius a double
     */
    public Sphere(double xCoordinate, double yCoordinate, 
        double zCoordinate, double radius) {
            this.xCoordinate = xCoordinate;
            this.yCoordinate = yCoordinate;
            this.zCoordinate = zCoordinate;
            this.radius = radius;
    }
    
    /**
     * Returns the x-coordinate.
     * @return xCoordinate a double.
     */
    public double getxCoordinate() {
        return xCoordinate;
    }
    
    /**
     * Sets the x-coordinate.
     * @param xCoordinate the x-coordinate to set.
     */
    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    
    /**
     * Returns the y-coordinate.
     * @return yCoordinate a double.
     */
    public double getyCoordinate() {
        return yCoordinate;
    }
    
    /**
     * Sets the y-coordinate.
     * @param yCoordinate the y-coordinate to set.
     */
    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    
    /**
     * Returns the z-coordinate.
     * @return zCoordinate a double.
     */
    public double getzCoordinate() {
        return zCoordinate;
    }
    
    /**
     * Sets the z-coordinate.
     * @param zCoordinate the z-coordinate to set.
     */
    public void setzCoordinate(double zCoordinate) {
        this.zCoordinate = zCoordinate;
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
     * Returns the surface area.
     * @return surfaceArea a double.
     */
    public double getSurfaceArea() {
        double surfaceArea = (FOUR * Math.PI * Math.pow(radius, TWO));
        return surfaceArea;
    }
    
    /**
     * Returns the volume.
     * @return volume a double.
     */
    public double getVolume() {
        double volume = ((FOUR / THREE) * Math.PI * Math.pow(radius, THREE));
        return volume;
        
    }

    /**
     * Returns a string representation of this object's state.
     * @return representation as a string.
     */
    @Override
    public String toString() {
        return "Sphere [xCoordinate=" + xCoordinate + ", yCoordinate=" 
            + yCoordinate + ", zCoordinate=" + zCoordinate + ", radius=" 
                + radius + "]";
    }
    
}
