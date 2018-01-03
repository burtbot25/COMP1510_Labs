package ca.bcit.comp1510.lab12;


/**
 * Staff.
 *
 * @author BCIT
 * @version 2017
 */
public class Staff {
    
    public static final int STAFF_SIZE = 8;
    
    private StaffMember[] staffList;

    /**
     * Constructor for objects of type Staff.
     */
    public Staff() {
        staffList = new StaffMember[STAFF_SIZE];
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", 123456789, 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", 123456789, 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", 123456789, 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", 123456789, 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
        staffList[6] = new Commission("Walter", "123 White Street", "555-1234", 123456789, 10.00, 0.2);
        staffList[7] = new Commission("Saul", "456 Goodman Ave", "555-4567", 987654321, 30.00, 0.05);
        
        
        
        ((Executive) staffList[0]).awardBonus(500.00);
        ((Hourly) staffList[3]).addHours(40);
        
        ((Commission) staffList[6]).addHours(35);
        ((Commission) staffList[6]).addSales(500);
        
        ((Commission) staffList[7]).addHours(20);
        ((Commission) staffList[7]).addSales(2000);

        }

    /**
     * Pays staff members.
     */
    public void payday() {
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);
            System.out.println();
            double amount = staffList[count].pay(); // polymorphic
            System.out.println(staffList[count] + " Paid: " + amount);
            System.out.println();
        }
    }
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.payday();
    }
}
