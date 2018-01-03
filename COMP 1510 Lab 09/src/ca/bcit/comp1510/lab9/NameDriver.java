package ca.bcit.comp1510.lab9;

import java.util.ArrayList;

/**
 * NameDriver adds names to an array list, sorts it by last name 
 * alphabetical order then prints the results.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        ArrayList<Name> nameList = new ArrayList<Name>();
        
        Name ironman = new Name("Tony", "Edward", "Stark");
        Name spidey = new Name("Peter", "Benjamin", "Parker");
        Name wolvie = new Name("James", "Logan", "Howlett");
        Name cap = new Name("Steve", null, "Rogers");
        
        nameList.add(ironman);
        nameList.add(spidey);
        nameList.add(wolvie);
        nameList.add(cap);
        
        System.out.println("BEFORE SORT");
        for (Name name : nameList) {
            System.out.println(name.toString());
        }

        nameList.sort(null);
        System.out.println("SORTED");
        for (Name name : nameList) {
            System.out.println(name.toString());
        }
    }

}
