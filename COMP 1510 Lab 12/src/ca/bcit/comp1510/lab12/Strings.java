package ca.bcit.comp1510.lab12;


import java.util.Scanner;

/**
 * Strings class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Strings {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        String[] stringList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many Strings do you want to sort? ");
        size = scan.nextInt() + 1;
        stringList = new String[size];
        System.out.println("\nEnter the Strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.nextLine();
        }
        Sorting.insertionSort(stringList);
        System.out.println("\nYour Strings in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.print(stringList[i] + "  ");
        }
        System.out.println();
        
        System.out.print("\nHow many Strings do you want to sort? ");
        size = scan.nextInt() + 1;
        stringList = new String[size];
        System.out.println("\nEnter the Strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.nextLine();
        }
        Sorting.selectionSort(stringList);
        System.out.println("\nYour Strings in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.print(stringList[i] + "  ");
        }
        
        scan.close();
    }
}
