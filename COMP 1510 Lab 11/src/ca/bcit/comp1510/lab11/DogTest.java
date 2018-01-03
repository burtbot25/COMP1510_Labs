package ca.bcit.comp1510.lab11;

/**
 * DogTest tests the Dog, Yorkshire and Labrador classes.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class DogTest {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        // Cannot instantiate because it is abstract!
        // Dog dog = new Dog();

        Labrador hannah = new Labrador("Hannah", "Golden");
        System.out.println(hannah.toString());
        System.out.println(hannah.speak());
        System.out.println(hannah.averageBreedWeightKG());
        
        Yorkshire sebastian = new Yorkshire("Sebastian", true);
        System.out.println(sebastian.toString());
        System.out.println(sebastian.speak());
        System.out.println(sebastian.averageBreedWeightKG());
    }

}
