package ca.bcit.comp1510.lab11;

/**
 * Cormorant class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Cormorant extends Bird implements Aerial, Aquatic, Terrestrial {

    /**
     * Constructs an object of type Cormorant.
     * @param age an int.
     * @param featherColour a String.
     */
    public Cormorant(int age, String featherColour) {
        super(age, featherColour);
    }
    
    /**
     * Makes the Cormorant eat.
     * @see ca.bcit.comp1510.lab11.Animal#eat()
     */
    @Override
    public void eat() {
        System.out.println("Eat quickly, yum yum!");
    }
    
    /**
     * Makes the Cormorant move.
     * @see ca.bcit.comp1510.lab11.Animal#move()
     */
    public void move() {
        run();
        swim();
        fly();
    }
    
    /**
     * Makes the Cormorant run.
     * @see ca.bcit.comp1510.lab11.Terrestrial#run()
     */
    @Override
    public void run() {
        System.out.println("Watch me run with my wings wide open for balance!");
        
    }

    /**
     * Makes the Cormorant swim.
     * @see ca.bcit.comp1510.lab11.Aquatic#swim()
     */
    @Override
    public void swim() {
        System.out.println("I am a great diver, watch out fish!");
        
    }

    /**
     * Makes the Cormorant fly.
     * @see ca.bcit.comp1510.lab11.Aerial#fly()
     */
    @Override
    public void fly() {
        System.out.println("I must fly fast and low to avoid eagles!");
        
    }

}
