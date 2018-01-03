package ca.bcit.comp1510.lab12;

/**
 * Commission
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Commission extends Hourly{

    /**
     * Total sales of the employee.
     */
    private double totalSales;
    
    /**
     * Commission percentrage of sales.
     */
    private double commission;
    
    /**
     * Constructs an object of type Commission.
     * @param name a String.
     * @param address a String.
     * @param phoneNum a String.
     * @param sinNum an int.
     * @param payRate a double.
     * @param commission a double.
     */
    public Commission(String name, String address, 
        String phoneNum, int sinNum, double payRate, double commission) {
        super(name, address, phoneNum, sinNum, payRate);
        this.commission = commission;
    }
    
    /**
     * Adds sales to the totalSales amount.
     * @param sales a double.
     */
    public void addSales(double sales) {
        this.totalSales += sales;
    }
    
    /**
     * Calculates the total pay.
     * @see ca.bcit.comp1510.lab12.Hourly#pay()
     * @return totalPay a double.
     */
    public double pay() {
        double totalPay = super.pay() + (totalSales * commission);
        totalSales = 0;
        return totalPay;
    }

    /**
     * Reutrns a String representation of the Commission class.
     * @see java.lang.Object#toString()
     * @return
     */
    @Override
    public String toString() {
        String result = super.toString();

        result += "\nTotal Sales: " + totalSales;
        return result;
    }
    
    
    
}
