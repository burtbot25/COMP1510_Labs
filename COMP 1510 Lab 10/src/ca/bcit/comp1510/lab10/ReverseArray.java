package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * ReverseArray creates an array with the size of the user's input,
 * adds the numbers into the array from the user, and reverses
 * the order of the input.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class ReverseArray {

    /**
     * Swaps elements in the array.
     * @param numbers an integer array.
     */
    public static void swap(int[] numbers) {
        for (int j = 0; j < (numbers.length / 2); j++) {
            // current holds current number
            int current = numbers[j];
            // storing the last number to the current position of current
            numbers[j] = numbers[numbers.length - j - 1];
            // stores current into the end of the array.
            numbers[numbers.length - j - 1] = current;
        }
    }
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Takes user input for the array size
        System.out.println("Enter an integer for the size of the array.");
        int arraySize = scan.nextInt();
        int[] numbers = new int[arraySize];
        
        // Takes user input to fill the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();  
        }
        
        // Swaps the positions in the array
        swap(numbers);
        
        // Prints the new order of the array
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
        
        
        scan.close();
    }

}
