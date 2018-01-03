package ca.bcit.comp1510.lab4;

/**
 * Tests the Name object.
 * @author Burt
 * @version 1.0
 */
public class NameTester {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {

        String wilburt = "Wilburt";
        String gan = "Gan";
        String herrera = "Herrera";
        
        Name fullName = new Name(wilburt, gan, herrera);
        
        System.out.println(fullName.toString());
        
        System.out.println(fullName.getFirst());
        System.out.println(fullName.getMiddle());
        System.out.println(fullName.getLast());
        
        fullName.setFirst("Li");
        fullName.setMiddle("Jian");
        fullName.setLast("Xing");
        
        System.out.println(fullName.getFirst());
        System.out.println(fullName.getMiddle());
        System.out.println(fullName.getLast());
        
        
        // Student Object Tester
        Student burt = new Student("Wilburt", "Herrera", 1991, 1029698, 4.0);
        System.out.println(burt.toString());
    }

}
