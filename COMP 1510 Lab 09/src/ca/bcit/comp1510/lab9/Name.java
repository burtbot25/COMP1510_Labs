package ca.bcit.comp1510.lab9;

/**
 * Name class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Name implements Comparable<Name> {

    /**
     * First name.
     */
    private final String first;

    /**
     * Middle name.
     */
    private final String middle;

    /**
     * Last name.
     */
    private final String last;

    /**
     * Constructs an object of type Name.
     * @param first a String.
     * @param middle a String.
     * @param last a String.
     */
    public Name(String first, String middle, String last) {


        if (first == null || first.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a first name");
        } else {
            this.first = first;
        }

        if (middle == null) {
            this.middle = null;
        } else if (middle.trim().isEmpty()) {
            throw new IllegalArgumentException("Middle name cannot be empty");
        } else {
            this.middle = middle;
        }

        if (last == null || last.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a last name");
        } else {
            this.last = last;
        }
    }

    /**
     * Returns the first for this Name.
     * @return first
     */
    public String getFirst() {
        return first;
    }

    /**
     * Returns the middle for this Name.
     * @return middle
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Returns the last for this Name.
     * @return last
     */
    public String getLast() {
        return last;
    }

    /**
     * Compares each part of the parameter to the instance variables.
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     * @param o
     * @return
     */
    @Override
    public int compareTo(Name obj) {
        String paramLast = obj.getLast();
        String paramMiddle = obj.getMiddle();
        String paramFirst = obj.getFirst();
        int result = 0;


        if (this.last.compareTo(paramLast) == 0) {
            if (middle != null) {
                if (this.middle.compareTo(paramMiddle) == 0) {
                    result = this.first.compareTo(paramFirst);
                } else if (this.middle != null) {
                    result = this.middle.compareTo(paramMiddle);
                }
            }
        } else {
            result = this.last.compareTo(paramLast);
        }
        return result;
    }

    /**
     * Returns the String representation of the Name.
     * @see java.lang.Object#toString()
     * @return
     */
    @Override
    public String toString() {
        return "Name [first=" + first + ", middle=" + middle 
                + ", last=" + last + "]";
    }
}
