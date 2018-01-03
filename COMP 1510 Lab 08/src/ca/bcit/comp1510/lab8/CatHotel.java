package ca.bcit.comp1510.lab8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * CatHotel class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class CatHotel {
    
    /**
     * List of cats.
     */
    private ArrayList<Cat> catArray;
    
    /**
     * Name of hotel.
     */
    private String hotelName;
    
    /**
     * Number of cats removed.
     */
    private int numberRemoved;
    
    /**
     * Constructs an object of type CatHotel.
     * @param hotelName a String.
     */
    public CatHotel(String hotelName) {
        this.hotelName = "Hotel Name: " + hotelName;
        catArray = new ArrayList<Cat>();
    }
    
    /**
     * Adds cat to the list of cats.
     * @param cat a Cat object,
     */
    public void addCat(Cat cat) {
        catArray.add(cat);
    }
    
    /**
     * Empties list of cats.
     */
    public void removeAllGuests() {
        catArray.clear();
    }
    
    /**
     * Counts number of cats in the list.
     * @return number of cats in the list as an int.
     */
    public int guestCount() {
        return catArray.size();
    }
    
    /**
     * Removes a guest if they are older than the given age.
     * @param removeAge an int.
     */
    public void removeOldGuests(int removeAge) {
        numberRemoved = 0;
        Iterator<Cat> catIterator = catArray.iterator();
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            if (temp.getAge() >= removeAge) {
                catIterator.remove();
                numberRemoved++;
            }
        }
        
        if (numberRemoved == 1) {
            System.out.println(numberRemoved + " cat was removed");
        } else {
            System.out.println(numberRemoved + " cats were removed");
        }
    }
    
    /**
     * Prints out the list of Cats in the hotel and their name and ages.
     */
    public void printGuestList() {
        System.out.println(hotelName);
        for (Cat cat : catArray) {
            System.out.println(cat.toString());
        }
    }

    /**
     * Returns string representation of the CatHotel.
     * @return representation as a String.
     */
    @Override
    public String toString() {
        return "CatHotel [catArray=" + catArray + ", hotelName=" 
            + hotelName + ", numberRemoved=" + numberRemoved + "]";
    }
    
}
