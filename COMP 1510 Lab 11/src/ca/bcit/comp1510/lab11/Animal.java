package ca.bcit.comp1510.lab11;

/**
 * Animal abstract class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public abstract class Animal {

    /**
     * Age of the animal.
     */
    protected int age;
    
    /**
     * Constructs an object of type Animal.
     * @param age an int.
     */
    public Animal(int age) {
        this.age = age;
    }
    
    /**
     * Abstract method to eat.
     */
    public void eat() {
        
    }
    
    /**
     * Returns the age for this Animal.
     * @return age an int.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age for this Animal.
     * @param age the age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Abstract method to move.
     */
    public void move() {
        
    }
}
