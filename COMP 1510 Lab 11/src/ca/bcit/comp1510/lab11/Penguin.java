package ca.bcit.comp1510.lab11;

/**
 * Penguin class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Penguin extends Bird implements Aquatic, Terrestrial {

    /**
     * Constructs an object of type Penguin.
     * @param age an int.
     * @param featherColour a String.
     */
    public Penguin(int age, String featherColour) {
        super(age, featherColour);
    }
    
    /**
     * Makes the Penguin eat.
     * @see ca.bcit.comp1510.lab11.Animal#eat()
     */
    @Override
    public void eat() {
        System.out.println("I love oily nutritious fish!");
    }
    
    /**
     * Makes the Penguin move.
     * @see ca.bcit.comp1510.lab11.Animal#move()
     */
    public void move() {
        run();
        swim();
    }
    
    /**
     * Makes the Penguin run.
     * @see ca.bcit.comp1510.lab11.Terrestrial#run()
     */
    @Override
    public void run() {
        System.out.println("Waddle, waddle, waddle!");
        
    }

    /**
     * Makes the Penguin swim.
     * @see ca.bcit.comp1510.lab11.Aquatic#swim()
     */
    @Override
    public void swim() {
        System.out.println("Splash!");
        
    }

}
