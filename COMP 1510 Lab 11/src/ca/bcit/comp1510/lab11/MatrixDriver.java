package ca.bcit.comp1510.lab11;

/**
 * MatrixDriver tests the Matrix class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class MatrixDriver {

    /**
     * Used in matrix addition.
     */
    public static final int THREE = 3;
    
    /**
     * Used in matrix addition.
     */
    public static final int FOUR = 4;
    
    /**
     * Used in matrix addition.
     */
    public static final int FIVE = 5;
    
    /**
     * Used in matrix addition.
     */
    public static final int SIX = 6;
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setValue(2, 0, 0);
        matrix1.setValue(THREE, 0, 1);
        matrix1.setValue(FOUR, 1, 0);
        matrix1.setValue(FIVE, 1, 1);
        System.out.println(matrix1.toString());
        System.out.println();
        
        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setValue(1, 0, 0);
        matrix2.setValue(2, 0, 1);
        matrix2.setValue(THREE, 1, 0);
        matrix2.setValue(FOUR, 1, 1);
        System.out.println(matrix2.toString());
        System.out.println();
        
        Matrix matrix3 = matrix1.add(matrix2);
        System.out.println(matrix3.toString());
        System.out.println();
        
        Matrix matrix4 = new Matrix(2, THREE);
        matrix4.setValue(1, 0, 0);
        matrix4.setValue(2, 0, 1);
        matrix4.setValue(THREE, 0, 2);
        matrix4.setValue(FOUR, 1, 0);
        matrix4.setValue(FIVE, 1, 1);
        matrix4.setValue(SIX, 1, 2);
        System.out.println(matrix4.toString());
        System.out.println();
        
        try {
            matrix4.add(matrix3);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Cannot add matrices with different dimensions");
        }
        
    }

}
