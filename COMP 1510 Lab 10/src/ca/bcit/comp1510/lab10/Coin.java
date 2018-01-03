package ca.bcit.comp1510.lab10;


/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;
    
    /**
     * Password to unlock the key.
     */
    private int password;
    
    /**
     * Indicates if the object is locked.
     */
    private boolean isLocked;

    /**
     * Constructs a Coin object.
     */
    public Coin() {
        isLocked = false;
        flip();
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
        if (!isLocked) {        
            face = (int) (Math.random() * 2);
            System.out.println(toString());
        } else {
            System.out.println("Coin object is locked. " 
                + "You must unlock the coin first");
        }
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return (face == HEADS);
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        
        return faceName;
    }

    /**
     * Sets the key password to access the object.
     * @see Lockable#setKey(int)
     * @param key an int.
     */
    @Override
    public void setKey(int key) {
        password = key;
    }

    /**
     * Locks the object if parameters match the password.
     * @see Lockable#lock(int)
     * @param key an int.
     * @return a boolean.
     */
    @Override
    public boolean lock(int key) {
        if (password == key) {
            isLocked = true;
        } else {
            isLocked = false;
        }
        return isLocked;
    }

    /**
     * Unlocks the object if the parameters match the password.
     * @see Lockable#unlock(int)
     * @param key an int.
     * @return a boolean.
     */
    @Override
    public boolean unlock(int key) {
        if (password == key) {
            isLocked = false;
        } else {
            isLocked = true;
        }
        return isLocked;
    }

    /**
     * Indicates if the object is locked.
     * @see Lockable#locked(int)
     * @param key
     * @return
     */
    @Override
    public boolean locked() {
        return isLocked;
    }
}

