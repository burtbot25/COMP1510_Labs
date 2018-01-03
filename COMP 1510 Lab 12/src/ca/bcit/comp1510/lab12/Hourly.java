package ca.bcit.comp1510.lab12;


/**
 * Hourly is an employee who earns an hourly pay rate.
 * 
 * @author BCIT
 * @version 2017
 */
public class Hourly extends Employee {

    public static final double DEFAULT_HOURS_WORKED = 37.5;

    private double hoursWorked;

    /**
     * Constructor for objects of type Hourly.
     */
    public Hourly() {
        hoursWorked = DEFAULT_HOURS_WORKED;
    }

    /**
     * Constructor for objects of type Hourly.
     * 
     * @param name
     * @param address
     * @param phone
     * @param sinNumber
     * @param rate
     */
    public Hourly(String name, String address, String phone, int sinNumber, double rate) {
        super(name, address, phone, sinNumber, rate);
        hoursWorked = 0.0;
    }

    /**
     * Adds the specified number of hours to this employee's accumulated hours.
     * 
     * @param moreHours a double
     */
    public void addHours(double moreHours) {
        hoursWorked += moreHours;
    }

    /**
     * Computes and returns the pay for this hourly employee.
     * 
     * @return payment as a double
     */
    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    /**
     * Returns a String representation of this Employee.
     * @return string representation of this Employee.
     */
    @Override
    public String toString() {
        String result = super.toString();

        result += "\nCurrent hours: " + hoursWorked;

        return result;
    }

}
