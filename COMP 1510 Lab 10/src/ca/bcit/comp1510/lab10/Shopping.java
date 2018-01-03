package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Shopping tests the Transaction and Item classes.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Shopping {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        String name;
        double price;
        int quantity;
        
        Scanner scan = new Scanner(System.in);
        
        // addToCart Original
        System.out.println("How many items do you want to buy?");
        int numItems = scan.nextInt();
        Transaction transaction1 = new Transaction(numItems);
        String quit = "yes";
        
        do {
            for (int i = 0; i < numItems; i++) {
                System.out.println("Please enter the name, price" 
                    + " and quantity of your item(s)");
                
                System.out.println("Name: ");
                name = scan.next();
                System.out.println("Price: ");
                price = scan.nextDouble();
                System.out.println("Quantity: ");
                quantity = scan.nextInt();
                
                transaction1.addToCart(name, price, quantity);
            }
            System.out.println(transaction1.toString());
            System.out.println("Continue shopping? Type yes to continue.");
            quit = scan.next();
        } while (quit.equalsIgnoreCase("yes"));
        
        // addToCart Overload
        System.out.println("\"Quick Buy\" mode activated!");
        System.out.println("How many items do you want to buy?");
        numItems = scan.nextInt();
        Transaction transaction2 = new Transaction(numItems);
        do {
            for (int i = 0; i < numItems; i++) {
                System.out.println("Please enter the name and price" 
                    + " of your item(s)");
                
                System.out.println("Name: ");
                name = scan.next();
                System.out.println("Price: ");
                price = scan.nextDouble();
                
                transaction2.addToCart(new Item(name, price));
            }
            System.out.println(transaction2.toString());
                System.out.println("Continue shopping? Type yes to continue.");
                quit = scan.next();
        } while (quit.equalsIgnoreCase("yes"));
        
        System.out.println("Thanks for shopping!");
        scan.close();
    } // End of main method
}
