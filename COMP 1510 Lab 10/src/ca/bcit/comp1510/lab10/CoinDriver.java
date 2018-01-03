package ca.bcit.comp1510.lab10;

/**
 * CoinDriver tests the Lockable interface.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class CoinDriver {
    
    /**
     * Password for the coin object.
     */
    public static final int PASSWORD = 0225;
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        System.out.println("***Before setting key and locking***");
        Coin coin1 = new Coin();
        
        System.out.println("***Locking coin1***");
        coin1.setKey(PASSWORD);
        coin1.lock(PASSWORD);
        coin1.flip();
        
        System.out.println("***After unlocking***");
        coin1.setKey(PASSWORD);
        coin1.unlock(PASSWORD);
        coin1.flip();
    }

}
