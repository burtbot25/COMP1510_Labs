
package ca.bcit.comp1510.lab5;

/**
 * Cube stores 4 parts.
 * 
 * @author Wilburt
 * @version 1.0
 */
public class Cube {
    
    /**
     * Used for Cube surface area calculation.
     */
    private static final double SIX = 6.0;
    
    /**
     * Used for Cube space diagonal calculation..
     */
    private static final double THREE = 3.0;
    
    /**
     * Used for Cube face calculation.
     */
    private static final double TWO = 2.0;
    
    /**
     * x-coordinate of the cube.
     */
    private double xCoordinate;
    
    /**
     * y-coordinate of the cube.
     */
    private double yCoordinate;
    
    /**
     * z-coordinate of the cube.
     */
    private double zCoordinate;
    
    /**
     * edgeLength of the cube.
     */
    private double edgeLength;
    
    /**
     * Constructs an object of type cube.
     * @param xCoordinate a double
     * @param yCoordinate a double
     * @param zCoordinate a double
     * @param edgeLength a double
     */
    public Cube(double xCoordinate, double yCoordinate, 
        double zCoordinate, double edgeLength) {
            this.xCoordinate = xCoordinate;
            this.yCoordinate = yCoordinate;
            this.zCoordinate = zCoordinate;
            this.edgeLength = edgeLength;
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
     * Returns the edge length.
     * @return edgeLength a double.
     */
    public double getEdgeLength() {
        return edgeLength;
    }
    
    /**
     * Sets the edgeLength.
     * @param edgeLength the edgeLength to set.
     */
    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    
    /**
     * Returns the surface area.
     * @return surfaceArea a double.
     */
    public double getSurfaceArea() {
        double surfaceArea = (SIX * Math.pow(edgeLength, TWO));
        return surfaceArea;
    }
    
    /**
     * Returns the volume.
     * @return volume a double.
     */
    public double getVolume() {
        double volume = Math.pow(edgeLength, THREE);
        return volume;
        
    }
    
    /**
     * Returns the face diagonal.
     * @return faceDiagonal a double.
     */
    public double getFaceDiagonal() {
        double faceDiagonal = (Math.sqrt(TWO) * edgeLength);
        return faceDiagonal;
    }
    
    /**
     * Returns the space diagonal.
     * @return spaceDiagonal a double.
     */
    public double getSpaceDiagonal() {
        double spaceDiagonal = (Math.sqrt(THREE) * edgeLength);
        return spaceDiagonal;
    }

    /**
     * Returns a string representation of this object's state.
     * @return representation as a string.
     */
    @Override
    public String toString() {
        return "Sphere [xCoordinate=" + xCoordinate + ", yCoordinate=" 
            + yCoordinate + ", zCoordinate=" + zCoordinate + ", radius=" 
                + edgeLength + "]";
    }
    
}
