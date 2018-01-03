package ca.bcit.comp1510.lab8;

/**
 * Cat class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Cat {

    /**
     * Cat's name.
     */
    private String name;
    
    /**
     * Cat's age.
     */
    private int age;
    
    /**
     * Constructs an object of type Cat.
     * @param name a String.
     * @param age an int.
     */
    public Cat(String name, int age) {
        this.age = age;
        if (age < 0) {
            this.age = 0;
        }
        if (name.trim().equals("")) {
            this.name = "Cleo";
        } else {
            this.name = name;
        }
    }

    /**
     * Returns the name for this Cat.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age for this Cat.
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age for this Cat.
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns a String representation of this Cat.
     * @return representation as a String.
     */
    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + "]";
    }
    
    
} // end of class
