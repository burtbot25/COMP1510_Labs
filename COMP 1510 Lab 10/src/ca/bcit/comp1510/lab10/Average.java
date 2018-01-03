package ca.bcit.comp1510.lab10;

/**
 * Average tests the command line arguments.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Average {
    
    /**
     * Drives the program.
     * @param args passed from the command line.
     */
    public static void main(String[] args) {
        int numerator = 0;
        
        if (args.length == 0) {
            System.out.println("No Arguments");
            return;
        } else {
            try {
                for (int i = 0; i < args.length; i++) {
                    System.out.println("You entered: " + args[i]);
                    numerator += Integer.parseInt(args[i]);
                }
                double average = (numerator / (args.length));
                System.out.println("Your average is " + average);
            } catch (IllegalArgumentException ex) {
                System.out.println("Only numbers can be averaged");
            }

        } // end of if else
    }

}
