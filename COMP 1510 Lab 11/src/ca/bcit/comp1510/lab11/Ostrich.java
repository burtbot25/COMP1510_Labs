package ca.bcit.comp1510.lab11;

/**
 * Ostrich class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Ostrich extends Bird implements Terrestrial {

    /**
     * Constructs an object of type Ostrich.
     * @param age an int.
     * @param featherColour a String.
     */
    public Ostrich(int age, String featherColour) {
        super(age, featherColour);
    }
    
    /**
     * Makes the Ostrich move.
     * @see ca.bcit.comp1510.lab11.Animal#move()
     */
    public void move() {
        run();
    }
    
    /**
     * Makes the Ostrich run.
     * @see ca.bcit.comp1510.lab11.Terrestrial#run()
     */
    @Override
    public void run() {
        System.out.println("Look at how fast I lope across the savannah!");
    }
    
    /**
     * Makes the Ostrich eat.
     * @see ca.bcit.comp1510.lab11.Animal#eat()
     */
    @Override
    public void eat() {
        System.out.println("Watch me gobble up these lizards yum yum!");
    }

}
