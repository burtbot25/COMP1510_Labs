package ca.bcit.comp1510.lab11;

/**
 * Labrador class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Labrador extends Dog {
    
    /**
     * Weight of the Labrador.
     */
    public static final int LABRADOR_WEIGHT = 35;
    
    /**
     * Color of the Labrador.
     */
    private String color;
    
    /**
     * Constructs an object of type Labrador.
     * @param name a String.
     * @param color a String.
     */
    public Labrador(String name, String color) {
        super(name);
        
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Player name " 
                + "cannot be null or blank");
        } else {
            this.color = color;
        }
    }
    
    /**
     * Returns the color for this Labrador.
     * @return color a String.
     */
    public String getColor() {
        return color;
    }

    /**
     * Makes the Dog say bow wow!
     * @return a String.
     */
    public String speak() {
        return "BOW WOW!";
    }

    /**
     * Determines average weight of the labrador in KG.
     * @see ca.bcit.comp1510.lab11.Dog#averageBreedWeightKG()
     * @return a double.
     */
    @Override
    public double averageBreedWeightKG() {
        return LABRADOR_WEIGHT;
    }

    /**
     * Returns a String representation of this dog.
     * @see java.lang.Object#toString()
     * @return a String.
     */
    @Override
    public String toString() {
        return "Labrador [name=" + getName() + "]" + "[color=" + color + "]";
    }
    
    /**
     * Compares two Labrador objects if they have the same
     * name and color.
     * @param lab a Labrador object
     * @return boolean.
     */
    public boolean equals(Labrador lab) {
        return (this.getName() == lab.getName() 
                && this.color.equals(lab.getColor()));
    }

}
