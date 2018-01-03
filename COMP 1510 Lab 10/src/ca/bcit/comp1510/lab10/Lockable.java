package ca.bcit.comp1510.lab10;

/**
 * Lockable interface.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public interface Lockable {
    
    /**
     * Sets the key password.
     * @param key an int.
     */
    void setKey(int key);
    
    /**
     * Locks the key if the correct password is entered.
     * @param key an int.
     * @return a boolean.
     */
    boolean lock(int key);
    
    /**
     * Unlocks the key if the correct password is entered.
     * @param key an int.
     * @return a boolean.
     */
    boolean unlock(int key);
    
    /**
     * Indicates if the the implementing object is locked.
     * @return a boolean.
     */
    boolean locked();
    
}
