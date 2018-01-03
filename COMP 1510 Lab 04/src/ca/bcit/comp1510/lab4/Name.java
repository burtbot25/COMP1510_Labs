package ca.bcit.comp1510.lab4;

/**
 * Creates a Name class.
 * @author Wilburt Herrera
 * @version 1.0
 */
public class Name {
    
    /**
     * First name.
     */
    private String first;
    
    /**
     * Middle name.
     */
    private String middle;
    
    /**
     * Last name.
     */
    private String last;
    
    
    /**
     * Constructs an object of type Name.
     * @param first a string
     * @param middle a string
     * @param last a string
     * @return
     */
    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    
    /**
     * Sets first name.
     * @param first a String
     */
    public void setFirst(String first) {
        this.first = first;
    }
    
    /**
     * Sets middle name.
     * @param middle a String
     */
    public void setMiddle(String middle) {
        this.middle = middle;
    }
    
    /**
     * Sets last name.
     * @param last a String
     */
    public void setLast(String last) {
        this.last = last;
    }
    
    /**
     * Returns the first name.
     * @return firstName as a String
     */
    public String getFirst() {
        return first;
    }
    
    /**
     * Returns the middle name.
     * @return middleName as a String
     */
    public String getMiddle() {
        return middle;
    }
    
    /**
     * Returns the last name.
     * @return lastName as a String
     */
    public String getLast() {
        return last;
    }
    
    /**
     * Returns a string representation of this object's state.
     * @return representation as a string.
     */
    @Override
    public String toString() {
        
        String result = (first + " " + middle + " " + last);
        return result;
    }
}
