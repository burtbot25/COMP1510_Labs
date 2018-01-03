package ca.bcit.comp1510.lab5;

/**
 * NameDriver tests the methods of the Name class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        String wilburt = "Wilburt";
        String gan = "Gan";
        String herrera = "Herrera";
        
        Name myName = new Name(wilburt, gan, herrera);
        
        System.out.println(myName.toString());
        
        System.out.println("First name is: " + myName.getFirst());
        System.out.println("Middle name is: " + myName.getMiddle());
        System.out.println("Last name is: " + myName.getLast());
        
        
        System.out.println("Replacing English with Chinese name...");
        myName.setFirst("Li");
        myName.setMiddle("Jian");
        myName.setLast("Xing");

        
        System.out.println("Chinese first name is: " + myName.getFirst());
        System.out.println("Chinese middle name is: " + myName.getMiddle());
        System.out.println("Chinese last name is: " + myName.getLast());
        
        System.out.println("The length of your full name is: " 
            + myName.length());
        
        System.out.println("The initials of your full name is: " 
            + myName.getInitials());
        
        System.out.println("The 4th character in your name is: " 
            + myName.getCharacter(4));
        System.out.println("Your name with the Family Name first is: " 
            + myName.getFamilyFirst());
        
        System.out.println("Your first name equals to Li: " 
            + myName.equalsFirst("Li"));
        
        System.out.println("Your full name is: " + myName.getFullName());
        
        System.out.println("Your full name matches \"this\" full name: " 
            + myName.equalsFull(myName));
    }

}
