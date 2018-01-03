package ca.bcit.comp1510.lab12;


/**
 * Volunteer is a staff member who does not get paid for their work.
 * 
 * @author BCIT
 * @version 2017
 */
public class Volunteer extends StaffMember {

    /**
     * Constructor for objects of type Volunteer.
     */
    public Volunteer() {
        super();
    }

    /**
     * Constructor for objects of type Volunteer.
     * 
     * @param name
     * @param address
     * @param phone
     */
    public Volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }

    /**
     * A Volunteer earns no pay.
     * 
     * @return 0.0, as a double
     */
    public double pay() {
        return 0.0;
    }

    /**
     * Returns a String representation of this Employee.
     * @return string representation of this Employee.
     */
    @Override
    public String toString() {
        String result = super.toString();

        result += "\nWorks as an unpaid volunteer.";

        return result;
    }
}
