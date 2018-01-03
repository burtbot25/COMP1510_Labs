package ca.bcit.comp1510.lab7;

import java.util.Scanner;
import java.util.Random;

/**
 * A set of games utilizing the random class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Games {
    
    /**
     * Score option.
     */
    public static final int SCORE = 1;
    
    /**
     * Guess the Number game option.
     */
    private static final int GUESS = 2;
    
    /**
     * Rock, Paper, Scissors game option.
     */
    private static final int RPS = 3;
    
    /**
     * Quit option.
     */
    private static final int QUIT = 4;
    
    /**
     * Range for Guessing the Number.
     */
    private static final int GUESS_RANGE = 101;
    
    /**
     * Limit for correct guesses to obtain reward.
     */
    private static final int GUESS_LIMIT = 5;
    
    /**
     * Points reward.
     */
    private static final int GUESS_REWARD = 5;
    
    /**
     * Points penalty.
     */
    private static final int GUESS_PENALTY = 3;
    
    /**
     * User's score.
     */
    private int score;
    
    /**
     * Scanner object.
     */
    private Scanner scan;
    
    /**
     * Random object.
     */
    private Random rand;
    
    /**
     * Stores user input.
     */
    private int input;
    
    /**
     * Constructs an object of type Games.
     */
    public Games() {
        this.score = 0;
        this.scan = new Scanner(System.in);
        this.rand = new Random();
    }
    
    /**
     * Creates the public play method.
     */
    public void play() {
        
        do {
            System.out.println("Welcome to the Games program!");
            System.out.println("Make your choice (enter a number):");
            System.out.println("1. See you score");
            System.out.println("2. Guess a number");
            System.out.println("3. Play Rock, Paper, Scissors");
            System.out.println("4. Quit");
            System.out.print("> ");
            
            while (!scan.hasNextInt()) {
                System.out.println("Please enter a number from 1 - 4");
                System.out.println(">");
                scan.next();
            } 
            input = scan.nextInt();
            
            /**
             * Game options.
             */
            switch (input) {
            case SCORE :
                System.out.println("Your score is: " + score);
                break;
            case GUESS :
                guessANumber();
                break;
            case RPS :
                rockPaperScissors();
                break;
            case QUIT : 
                break;
            default :
                System.out.println("Please enter a valid number.");
                System.out.print("> ");
            }
        } while (!(input == QUIT));
    }
    
    /**
     * Guess a Number game.
     */
    public void guessANumber() {
        int guess;
        int answer;
        int count = 1;
        
        /**
         * Number to be guessed.
         */
        answer = rand.nextInt(GUESS_RANGE);
        
        do {
            //Prompts user for a guess.
            System.out.println("I've picked a random number between 0 and 100" 
                + "\nCan you guess it?" + "\nGuess the number!");
            guess = scan.nextInt();
            
            /**
             * <p> Processes user's guess. If the user guesses under 5 tries,
             * they are rewarded with 5 points, otherwise, the score is
             * unaffected</p>
             */
            if (guess == answer) {
                System.out.println("RIGHT!");
                if (count <= GUESS_LIMIT) {
                    score += GUESS_REWARD;
                    System.out.println("You earned 5 points!");
                }
            } else if (guess > answer) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            
            count++;
        } while (guess != answer);
    }
    
    /**
     * Rock, Paper, Scissors game.
     */
    public void rockPaperScissors() {
        
        int userHand = -1;
        final int rock = 0;
        final int paper = 1;
        final int scissors = 2;
        
        /**
         * CPU hand.
         */
        int cpuHand = rand.nextInt(2);
        
        /**
         * Prompts user for their hand.
         */
        System.out.println("I've picked one of ROCK, PAPER, and SCISSORS"
                + "\nWhat will you choose?");
        String userGuess = scan.next().trim().toLowerCase();
        
        /**
         * Guess validator.
         */
        while (!userGuess.equals("rock") 
                && !userGuess.equals("paper") 
                && !userGuess.equals("scissors")) {
            System.out.println("That's not a valid answer. Please try again.");
            userGuess = scan.next().trim().toLowerCase();
        }
        
        /**
         * Assigns user's hand to the corresponding selection.
         */
        if (userGuess.equals("rock")) {
            userHand = rock;
        } else if (userGuess.equals("paper")) {
            userHand = paper;
        } else if (userGuess.equals("scissors")) {
            userHand = scissors;
        } 
        
        /**
         * Determines results of the hands thrown.
         */
        switch (userHand) {
        case rock : 
            if (userHand == rock && cpuHand == scissors) {
                System.out.println("You win! Rock crushes scissors");
            } else if (userHand == rock && cpuHand == paper) {
                System.out.println("Sorry, you lose. I had paper.");
            } else {
                System.out.println("We tied!");
            }
            break;
        case paper :
            if (userHand == paper && cpuHand == rock) {
                System.out.println("You win! Paper cover rock!");
            } else if (userHand == paper && cpuHand == scissors) {
                System.out.println("Sorry, you lose. I had scissors.");
            } else {
                System.out.println("We tied!");
            }
            break;
        case scissors :
            if (userHand == scissors && cpuHand == paper) {
                System.out.println("You win! Scissors cuts paper!");
            } else if (userHand == scissors && cpuHand == rock) {
                System.out.println("Sorry, you lose. I had rock.");
            } else {
                System.out.println("We tied!");
            }
            break;
        default : 
        }
        
        /**
         * Win reward and loss penalty.
         */
        if ((userHand == rock && cpuHand == scissors) 
            || (userHand == paper && cpuHand == rock) 
            || (userHand == scissors && cpuHand == paper)) {
            System.out.println("You earned 5 points!");
            score += GUESS_REWARD;
        } else if ((userHand == rock && cpuHand == paper) 
            || (userHand == paper && cpuHand == scissors) 
            || (userHand == scissors && cpuHand == rock)) {
            System.out.println("You lose! You lost 3 points!");
            score -= GUESS_PENALTY;
        }
        
    }
    
}
