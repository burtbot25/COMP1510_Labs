package ca.bcit.comp1510.lab12;

/**
 * Employee is an employee who earns a weekly pay rate.
 * 
 * @author BCIT
 * @version 2017
 */
public class Employee extends StaffMember {

    public static final int DEFAULT_SIN = 999_999_999;
    public static final double MINIMUM_WAGE = 20.0;

    protected int socialInsuranceNumber;
    protected double payRate;

    /**
     * Constructor for objects of type Employee.
     */
    public Employee() {
        socialInsuranceNumber = DEFAULT_SIN;
        payRate = MINIMUM_WAGE;
    }

    /**
     * Constructor for objects of type Employee.
     * 
     * @param name name
     * @param address address
     * @param phone phone
     * @param sinNumber
     * @param rate
     */
    public Employee(String name, String address, String phone, int sinNumber, double rate) {
        super(name, address, phone);

        socialInsuranceNumber = sinNumber;
        payRate = rate;
    }

    /**
     * Returns pay as a double.
     * @return payRate as a double
     */
    public double pay() {
        return payRate;
    }

    /**
     * Returns a String representation of this Employee.
     * @return string representation of this Employee.
     */
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialInsuranceNumber;
        return result;
    }


}
