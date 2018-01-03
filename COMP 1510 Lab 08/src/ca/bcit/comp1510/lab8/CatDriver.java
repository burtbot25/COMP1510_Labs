package ca.bcit.comp1510.lab8;

import java.util.Random;

/**
 * CatDriver tests the CatHotel and Cat objects.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class CatDriver {
    
    /**
     * Range of randomizer.
     */
    private static final int RANDOM_RANGE = 10;
    
    /**
     * Range of age.
     */
    private static final int AGE_RANGE = 5;
    
    /**
     * Drives the program.
     * @param args unsused.
     */
    public static void main(String[] args) {
        CatHotel catHotel = new CatHotel("Catmandu");
        Random random = new Random();
        int randomCatAge = random.nextInt(RANDOM_RANGE);
        int randomCatAge2 = random.nextInt(RANDOM_RANGE);
        int randomCatAge3 = random.nextInt(RANDOM_RANGE);
        
        Cat garfield = new Cat("Garfield", randomCatAge);
        Cat cleo = new Cat("  ", randomCatAge2);
        Cat pusheen = new Cat("Pusheen", randomCatAge3);
        
        catHotel.addCat(garfield);
        catHotel.addCat(cleo);
        catHotel.addCat(pusheen);
        
        catHotel.printGuestList();
        System.out.println("There are: " + catHotel.guestCount() + " cats");

        catHotel.removeOldGuests(AGE_RANGE);
        System.out.println("***Hotel status***");
        catHotel.printGuestList();
        
        catHotel.removeAllGuests();
        System.out.println("***Hotel emptied***");
        catHotel.printGuestList();
    }

}
