package ca.bcit.comp1510.lab3;

// For Random generator
import java.util.Random;

/**
 * Draws a card at random.
 * @author Wilburt Herrera
 * @version 1.0
 */
public class CardGame {

    /**
     * Specifying card numbers 1-5.
     */
    enum Rank { ACE, TWO, THREE, FOUR, FIVE, 
        
    /**
     * Specifying card numbers 6-K.
     */
        SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING };
        
    /**
     * Specifying card suits.
     */
    enum Suit { HEARTS, DIAMONDS, CLUBS, SPADES }; 
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        Random random = new Random();
        
        // Randomizes card rank
        int randomRankChoice = random.nextInt(Rank.values().length);
        System.out.println(Rank.values()[12]);
        Rank randomRank = Rank.values()[randomRankChoice];
        
        // Randomizes card suit
        int randomSuitChoice = random.nextInt(Suit.values().length);
        Suit randomSuit = Suit.values()[randomSuitChoice];
        
        // Displays a random card
        System.out.println("Your card is the " + randomRank + " of " 
            + randomSuit);
    
    }
}
