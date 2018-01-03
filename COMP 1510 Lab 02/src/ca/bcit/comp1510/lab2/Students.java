package ca.bcit.comp1510.lab2;

/**
 * The Students class displays a table of grades.
 * 
 * @author Wilburt Herrera
 * @version 2017
 */
public class Students {

    /**
     *  Drives the program.
     *  @param args unused
     */
    public static void main(String[] args) {
        
        // Prints the top of the border
        System.out.println("///////////////////" 
            + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        
        // Prints the table title
        System.out.println("==" + "\t" + "    Student Points" + "\t" 
            + "    ==");
        
        // Prints the bottom of the border
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
            + "///////////////////");
        
        // Prints the headers
        System.out.println("Name\t    Lab     Bonus    Total");
        
        // Prints header underline
        System.out.println("----\t    ---     -----    -----");
       
        // Prints Joe's scores
        System.out.println("Joe\t    43\t    7\t     " + "50");
       
        // Prints William's scores
        System.out.println("William\t    50\t    8\t     " + "58");
      
        // Prints Mary Sue's scores
        System.out.println("Mary Sue    39\t    10\t     " + "49");
      
        // Prints Peng's scores
        System.out.println("Peng\t    87\t    6\t     " + "93");
      
        // Prints Kwon's scores
        System.out.println("Kwon\t    99\t    0\t     " + "99");
    }
}
