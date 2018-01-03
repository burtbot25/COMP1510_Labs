package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * ComparePlayers compares objects of the Player class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class ComparePlayers {

    /**
     * Player2's number.
     */
    public static final int INTEGER = 24;
    
    
    /**
     * Player3's number.
     */
    public static final int NEG_INTEGER = -32;
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player[] playerArray = new Player[2];
        
        try {
            Player player1 = new Player(null, "Lakers", 1);
            System.out.println(player1.toString());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            Player player2 = new Player("Kobe", "", INTEGER);
            System.out.println(player2.toString());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            Player player3 = new Player("Shaq", "Magic", NEG_INTEGER);
            System.out.println(player3.toString());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        
        for (int i = 0; i < playerArray.length; i++) {
           try {
            System.out.println("Enter player name: ");
            String name = scan.nextLine();
            System.out.println("Enter team name: ");
            String teamName = scan.nextLine();
            System.out.println("Enter player number: ");
            int number = Integer.parseInt(scan.nextLine());
            playerArray[i] = new Player(name, teamName, number);
           } catch (IllegalArgumentException ex) {
               System.out.println(ex.getMessage());
           }
        }
        
        System.out.println(playerArray[0].compareTo(playerArray[1]));
        System.out.println(playerArray[0].equals(playerArray[1]));
        
        scan.close();
        

    }

}
