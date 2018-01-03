package ca.bcit.comp1510.lab6;

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
     */
    public Name(String first, String middle, String last) {
        // this.first = first;
        // this.middle = middle;
        // this.last = last;
        
        if (first.trim().length() == 0) {
            this.first = "(BLANK)";
        } else {
            first = first.trim();
            String capital = first.substring(0, 1).toUpperCase();
            String lowercase = first.substring(1, first.length()).toLowerCase();
            String newFirst = (capital + lowercase);
            this.first = newFirst;
        }
        
        if (middle.trim().length() == 0) {
            this.middle = "(BLANK)";
        } else {
            middle = middle.trim();
            String capital = middle.substring(0, 1).toUpperCase();
            String lowercase = 
                middle.substring(1, middle.length()).toLowerCase();
            String newMiddle = (capital + lowercase);
            this.middle = newMiddle;
        }
        
        if (last.trim().length() == 0) {
            this.last = "(BLANK)";
        } else {
            last = last.trim();
            String capital = last.substring(0, 1).toUpperCase();
            String lowercase = last.substring(1, last.length()).toLowerCase();
            String newLast = (capital + lowercase);
            this.last = newLast;
        }
        
        
        
    }
    
    /**
     * Sets first name.
     * @param first a String
     */
    public void setFirst(String first) {
        // this.first = first;
        
        if (first.trim().length() != 0) {
            first = first.trim();
            String capital = first.substring(0, 1).toUpperCase();
            String lowercase = first.substring(1, first.length()).toLowerCase();
            String newFirst = (capital + lowercase);
            this.first = newFirst;
        }
    }
    
    /**
     * Sets middle name.
     * @param middle a String
     */
    public void setMiddle(String middle) {
        // this.middle = middle;
        
        if (middle.trim().length() != 0) {
            middle = middle.trim();
            String capital = middle.substring(0, 1).toUpperCase();
            String lowercase = 
                middle.substring(1, middle.length()).toLowerCase();
            String newMiddle = (capital + lowercase);
            this.middle = newMiddle;
        }
    }
    
    /**
     * Sets last name.
     * @param last a String
     */
    public void setLast(String last) {
        // this.last = last;
        
        if (last.trim().length() != 0) {
            last = last.trim();
            String capital = last.substring(0, 1).toUpperCase();
            String lowercase = last.substring(1, last.length()).toLowerCase();
            String newlast = (capital + lowercase);
            this.last = newlast;
        }
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
     * Returns the character length of the full name.
     * @return length an int.
     */
    public int length() {
        int length = (first.length() + middle.length() + last.length());
        return length;
    }
    
    /**
     * Returns initials.
     * @return initials a String.
     */
    public String getInitials() {
        String caps = (first.substring(0, 1).toUpperCase() 
            + middle.substring(0, 1).toUpperCase() 
            + last.substring(0, 1).toUpperCase());
        return caps;
    }
    
    /**
     * Returns character at the given character position.
     * @param character an int.
     * @return index a char.
     */
    public char getCharacter(int character) {
        String full = (first + middle + last);
        
        if (character >= full.length()) {
            char index = '@';
            return index;
        } else {
            char index = full.charAt(character);
            return index;
        }
    }
    
    /**
     * Returns the format: "Last, First Middle".
     * @return family a String.
     */
    public String getFamilyFirst() {
        String family = (last + "," + " " + first + " " + middle);
        return family;
    }
    
    /**
     * Compares if the input matches the first name.
     * @param comparison a String.
     * @return equal a boolean.
     */
    public boolean equalsFirst(String comparison) {
        boolean equal = comparison.equals(first);
        return equal;
    }
    
    /**
     * Returns the full name.
     * @return first + middle + last a String
     */
    public String getFullName() {
        return (first + middle + last); 
    }
    
    /**
     * Compares a Name object with "this" Name object.
     * @param name a Name object.
     * @return same a boolean.
     */
    public boolean equalsFull(Name name) { 
        boolean same = (name.getFirst().equals(this.first)
                && name.getMiddle().equals(this.middle)
                && name.getLast().equals(this.last));
        return same;
    }
    
    /**
     * Returns a string representation of this object's state.
     * @return representation as a string.
     */
    @Override
    public String toString() {
        return "Name [first=" + first + ", middle=" + middle 
            + ", last=" + last + "]";
    }
}
