package ca.bcit.comp1510.lab3;

// For Random Generating
import java.util.Random;

/**
 * Rolls different types of dice.
 * @author Wilburt Herrera
 * @version 1.0
 */
public class Dice {
    
    /**
     *  4-sided Max Roll.
     */
    static final int D4 = 4;
    
    /**
     *  6-sided Max Roll.
     */
    static final int D6 = 6;
    
    /**
     *  8-sided Max Roll.
     */
    static final int D8 = 8;
    
    /**
     *  10-sided Max Roll.
     */
    static final int D10 = 10;
    
    /**
     *  12-sided Max Roll.
     */
    static final int D12 = 12;
    
    /**
     *  20-sided Max Roll.
     */
    static final int D20 = 20;
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        // Random Factor
        Random random = new Random();
        
        // dice rollers
        int roll4 = random.nextInt(D4) + 1;
        int roll6 = random.nextInt(D6) + 1;
        int roll8 = random.nextInt(D8) + 1;
        int roll10 = random.nextInt(D10) + 1;
        int roll12 = random.nextInt(D12) + 1;
        int roll20 = random.nextInt(D20) + 1;
        
        // 4-sided dice roll
        System.out.println("Your 4-sided die rolled: " + roll4);
        
        // 6-sided dice roll
        System.out.println("Your 6-sided die rolled: " + roll6);
        
        // 8-sided dice roll
        System.out.println("Your 8-sided die rolled: " + roll8);
        
        // 10-sided dice roll
        System.out.println("Your 10-sided die rolled: " + roll10);
        
        // 12-sided dice roll
        System.out.println("Your 12-sided die rolled: " + roll12);

        // 20-sided dice roll
        System.out.println("Your 20-sided die rolled: " + roll20);
        
        // Total value of all dice
        System.out.println("The value of all 6 dice is: " 
            + (roll4 + roll6 + roll8 + roll10 + roll12 + roll20));
    }

}
