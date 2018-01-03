package ca.bcit.comp1510.lab11;

/**
 * BirdFarm tests the Ostrich, Penguin, and Cormorant classes.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class BirdFarm {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Ostrich ozzy = new Ostrich(2, "brown");
        Penguin pingu = new Penguin(1, "black and white");
        Cormorant cormier = new Cormorant(2, "dark blue");
        
        ozzy.move();
        pingu.move();
        cormier.move();

    }

}
