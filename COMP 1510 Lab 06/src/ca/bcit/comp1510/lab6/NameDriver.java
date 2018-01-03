package ca.bcit.comp1510.lab6;

/**
 * NameDriver tests the methods of the Name class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class NameDriver {

    /**
     * Get character length tester value.
     */
    public static final int EXCEED = 100; 
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        // Assigning blank/empty names
        String first = "     ";
        String middle = "     ";
        String last = "        ";
        
        // Create new name of blanks
        Name myName = new Name(first, middle, last);
        System.out.println("New name: " + myName.toString());
        
        // Sets new name and reformats to Name case
        myName.setFirst("pETER");
        myName.setMiddle("bENJAMIN");
        myName.setLast("pARKER");
        System.out.println("Name case: " + myName.toString());
        
        // Testing setting names to blank/empty
        myName.setFirst("    ");
        myName.setMiddle("    ");
        myName.setLast("    ");
        System.out.println("When object is mutated to white space or empty: " 
            + myName.toString());
        
        System.out.println("First name is: " + myName.getFirst());
        System.out.println("Middle name is: " + myName.getMiddle());
        System.out.println("Last name is: " + myName.getLast());
        
        // Testing getCharacter when parameter exceeds length
        char length = myName.getCharacter(EXCEED);
        System.out.println("The character is: " + length);
        
        
        // Second test
        String f = "   Wilburt    ";
        String m = "    Gan";
        String l = "   Herrera   ";
        
        Name burt = new Name(f, m, l);
        System.out.println("White space instantiation " + burt.toString());
        
        burt.setFirst("   Burt    ");
        burt.setMiddle("   Gan    ");
        burt.setLast("   Herrera   ");
        
        System.out.println("Leading and ending blanks trimmed: " 
            + burt.toString());
    }

}
