package ca.bcit.comp1510.lab12;

/**
 * Salesperson class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Salesperson implements Comparable<Salesperson> {

    /**
     * First name of the Salesperson.
     */
    private final String firstName;
    
    /**
     * LastName of the Salesperson.
     */
    private final String lastName;
    
    /**
     * Number of sales for the Salesperson.
     */
    private final int numSales;
    

    /**
     * Constructs an object of type Salesperson.
     * @param firstName a String.
     * @param lastName a String.
     * @param numSales an int.
     */
    public Salesperson(String firstName, String lastName, int numSales) {
        if (firstName.trim().equals("") || firstName == null 
                || lastName.trim().equals("") || lastName == null) {
            throw new IllegalArgumentException("Names cannot be null" 
                + " or only whitespace");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
            this.numSales = numSales;
        }
    }

    /**
     * Returns the firstName for this Salesperson.
     * @return firstName a String.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the lastName for this Salesperson.
     * @return lastName a String.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the numSales for this Salesperson.
     * @return numSales a String.
     */
    public int getNumSales() {
        return numSales;
    }

    /**
     * Compares the current Salesperson's sales with the sales
     * of the Salesperson passed as a parameter. The Salesperson
     * who has more sales comes first.
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     * @param o
     * @return
     */
    @Override
    public int compareTo(Salesperson seller) {
        if (this.numSales < seller.getNumSales()) {
            return 1;
        } else if (this.numSales > seller.getNumSales()) {
            return -1;
        }
        return 0;
    }
    
    /**
     * Returns a String representation of the Salesperson.
     * @see java.lang.Object#toString()
     * @return a String.
     */
    @Override
    public String toString() {
        return "Name:\t" + firstName + " " 
            + lastName + "\t\tSales: \t" + numSales;
    }
    
}
