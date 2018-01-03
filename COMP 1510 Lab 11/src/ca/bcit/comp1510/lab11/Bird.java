package ca.bcit.comp1510.lab11;

/**
 * Bird class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public abstract class Bird extends Animal {

    /**
     * Feather colour of the bird.
     */
    protected String featherColour;
    
    /**
     * Constructs an object of type Bird.
     * @param featherColour a String.
     * @param age an int.
     */
    public Bird(int age, String featherColour) {
        super(age);
        this.featherColour = featherColour;
        
    }
    
    /**
     * Returns the featherColour for this Bird.
     * @return featherColour a String.
     */
    public String getFeatherColour() {
        return featherColour;
    }

    /**
     * Sets the featherColour for this Bird.
     * @param featherColour the featherColour to set
     */
    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }


}
