package ca.bcit.comp1510.lab12;


/**
 * 
 * Executive is an executive staff member who earns a weekly pay rate. An
 * Executive can earn a bonus.
 * 
 * @author BCIT
 * @version 2017
 */
public class Executive extends Employee {

    private double bonus;

    /**
     * Constructor for objects of type Executive.
     */
    public Executive() {
        bonus = 0.0;
    }

    /**
     * Constructor for objects of type Executive.
     * 
     * @param name name
     * @param address address
     * @param phone phone
     * @param sinNumber
     * @param rate
     */
    public Executive(String name, String address, String phone, int sinNumber, double rate) {
        super(name, address, phone, sinNumber, rate);
        bonus = 0.0;
    }

    /**
     * Awards the specified bonus to the executive.
     * 
     * @param execBonus a double
     */
    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    /**
     * Computes and returns the pay for an executive, which is the regular
     * employee payment plus a one-time bonus.
     * 
     * @return payment as a double
     */
    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0;
        return payment;
    }

    /**
     * Returns a String representation of this Employee.
     * @return string representation of this Employee.
     */
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nWeekly Bonus: " + bonus;
        return result;
    }

}
