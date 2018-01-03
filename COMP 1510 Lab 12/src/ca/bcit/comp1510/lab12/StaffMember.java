package ca.bcit.comp1510.lab12;


/**
 * StaffMember represents a generic member of the organization's personnel.
 * 
 * @author BCIT
 * @version 2017
 */
abstract public class StaffMember {

    public static final String DEFAULT_NAME = "JANE DOE";
    public static final String DEFAULT_ADDRESS = "123 MAIN STREET";
    public static final String DEFAULT_PHONE = "604-999-9999";

    protected String name;
    protected String address;
    protected String phone;

    /**
     * Constructor for objects of type StaffMember.
     */
    public StaffMember() {
        name = DEFAULT_NAME;
        address = DEFAULT_ADDRESS;
        phone = DEFAULT_PHONE;
    }

    /**
     * Constructor for objects of type StaffMember.
     * 
     * @param name String
     * @param address String
     * @param phone String
     */
    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Returns a String representation of this Employee.
     * @return string representation of this Employee.
     */
    @Override
    public String toString() {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        return result;
    }

    /**
     * Derived classes must define the pay method for each type of employee.
     * 
     * @return the amount paid as a double
     */
    public abstract double pay();

}
