package ca.bcit.comp1510.lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ForbiddenWords class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class ForbiddenWords {

    /**
     * String array object.
     */
    private ArrayList<String> words;
    
    /**
     * File scanner object.
     */
    private Scanner fileScanner;
    
    /**
     * Constructs a forbidden words object.
     * @param fileName a String.
     * @throws FileNotFoundException 
     */
    public ForbiddenWords(String fileName) throws FileNotFoundException {
        words = new ArrayList<String>();
        
        fileScanner = new Scanner(new File(fileName));
        
        while (fileScanner.hasNext()) {
            words.add(fileScanner.next());
        }
    }
    
    /**
     * Checks if password is a forbidden word.
     * @param input a String.
     * @return boolean.
     */
    public boolean containsWord(String input) {
        for (String forbid : words) {
            if (forbid.equals(input)) {
                return true;
            }
        }
        return false;
    }
    
}
