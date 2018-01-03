package ca.bcit.comp1510.lab8;

import java.util.ArrayList;

/**
 * Flips a coin 100 times and determines the longest run of Heads.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class CoinRunner {
    
    /**
     * Number of flips.
     */
    public static final int TOTAL_FLIPS = 100;
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        int maxRun = 0;
        int currentRun = 0;
        ArrayList<String> resultsArray = new ArrayList<String>();
        Coin coin = new Coin();
        
        /**
         * Flips the coin 100 times and stores the results into an array.
         */
        for (int i = 1; i <= TOTAL_FLIPS; i++) {
            coin.flip();
            resultsArray.add(coin.toString());
        }
        System.out.println(resultsArray);
        
        /**
         * Finds the longest streak of "Heads" out of the total # of flips.
         */
        for (int i = 0; i < TOTAL_FLIPS; i++) {
            if (resultsArray.get(i).equals("Heads")) {
                currentRun++;

                if (currentRun >= maxRun) {
                    maxRun = currentRun;
                }
            } else {
            currentRun = 0;
            }
        }
        System.out.println(maxRun);
        
    } // end of main method

}
