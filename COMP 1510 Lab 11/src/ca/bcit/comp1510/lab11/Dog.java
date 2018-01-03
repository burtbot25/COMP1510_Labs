package ca.bcit.comp1510.lab11;

/**
 * Dog class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public abstract class Dog {

    /**
     * Name of the dog.
     */
    protected String name;
    
    /**
     * Constructs an object of type Dog.
     * @param name a String.
     * @throws NullPointerException throws exception
     */
    protected Dog(String name) throws NullPointerException {
        this.name = name;
    }

    /**
     * Returns the name for this Dog.
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Makes the Dog say woof!
     * @return a String.
     */
    public String speak() {
        return "WOOF!";
    }
    
    /**
     * Abstract method for the average weight of the breed in KG.
     * @return a double.
     */
    public abstract double averageBreedWeightKG();

    /**
     * Returns a String representation of this Dog object.
     * @see java.lang.Object#toString()
     * @return a String.
     */
    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }

    /**
     * Dogs are equal if their names are equal.
     * @see java.lang.Object#equals(java.lang.Object)
     * @param dogName a Dog object.
     * @return a boolean.
     */
    public boolean equals(Dog dogName) {
        return (this.getName().equals(dogName.getName()));
    }
    
    
    
}
