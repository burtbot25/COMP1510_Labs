package ca.bcit.comp1510.lab12;

import java.text.DecimalFormat;

/**
 * PaintCan class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class PaintCan {

    private DecimalFormat fmt = new DecimalFormat("0.00");
    
    /**
     * Coverage needed.
     */
    private double coverage;
    
    /**
     * Constructs an object of type PaintCan.
     * @param coverage a double.
     */
    public PaintCan(double coverage) {
        if (coverage > 0) {
            this.coverage = coverage;
        } else {
            throw new IllegalArgumentException(
                "Coverage must be greater than 0");
        }
    }
    
    /**
     * Returns the amount of cans of paint to paint the shape.
     * @param shape a Shape object.
     * @return a double.
     */
    public double amount(Shape shape) {
        return Double.parseDouble(fmt.format(shape.surfaceArea() / coverage));
    }
    
}
