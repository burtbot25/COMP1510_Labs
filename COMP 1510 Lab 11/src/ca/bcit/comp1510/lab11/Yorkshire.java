package ca.bcit.comp1510.lab11;

/**
 * Yorkshire class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Yorkshire extends Dog {
    
    /**
     * Weight of a Yorkshire.
     */
    public static final int YORKSHIRE_WEIGHT = 4;
    
    /**
     * Determines if the Yorkshire catches rats or not.
     */
    private boolean ratter;
    
    /**
     * Constructs an object of type Yorkshire.
     * @param name a String.
     * @param ratter a boolean.
     */
    public Yorkshire(String name, boolean ratter) {
        super(name);
        this.ratter = ratter;
    }
    
    /**
     * Returns the ratter for this Yorkshire.
     * @return ratter
     */
    public boolean isRatter() {
        return ratter;
    }

    /**
     * Makes the Dog say yap yap yap!
     * @return a String.
     */
    public String speak() {
        return "YAPYAPYAP!";
    }
    
    /**
     * Returns the average weight of Yorkshires.
     * @see ca.bcit.comp1510.lab11.Dog#averageBreedWeightKG()
     * @return
     */
    @Override
    public double averageBreedWeightKG() {
        return YORKSHIRE_WEIGHT;
    }

    /**
     * Returns a String representation of this Yorkshire.
     * @see java.lang.Object#toString()
     * @return a String.
     */
    @Override
    public String toString() {
        return "Yorkshire [name=" + getName() + "]" + "[ratter=" + ratter + "]";
    }

    /**
     * Compares two Yorkshire objects if they have the same
     * name and ratter status.
     * @param yorkie a Yorkshire object.
     * @return boolean.
     */
    public boolean equals(Yorkshire yorkie) {
        return (this.getName() == yorkie.getName() 
                && this.ratter == yorkie.isRatter());
    }
    
}
