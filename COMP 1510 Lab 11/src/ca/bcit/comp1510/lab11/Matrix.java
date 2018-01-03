package ca.bcit.comp1510.lab11;

/**
 * Matrix class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Matrix {

    /**
     * A 2D matrix.
     */
    private int[][] array2d;
    
    /**
     * Constructs an object of type Matrix.
     * @param rows an int.
     * @param columns an int.
     */
    public Matrix(int rows, int columns) {
        array2d = new int[rows][columns];
    }
    
    /**
     * Returns the number of rows in the matrix.
     * @return an int.
     */
    public int getRows() {
        return array2d.length;
    }
    
    /**
     * Returns the number of columns in the matrix.
     * @return an int.
     */
    public int getColumns() {
        return array2d[0].length;
    }
    
    /**
     * Returns the value of the integer in that location in the matrix.
     * @param rows an int.
     * @param columns an int.
     * @return returns value of the integer at that location.
     */
    public int getValue(int rows, int columns) {
        return array2d[rows][columns];
    }
    
    /**
     * Sets a value in the specified location.
     * @param newValue an int.
     * @param rows an int.
     * @param columns an int.
     */
    public void setValue(int newValue, int rows, int columns) {
        array2d[rows][columns] = newValue;
    }

    /**
     * Returns a String representation of the Matrix.
     * @see java.lang.Object#toString()
     * @return a String.
     */
    @Override
    public String toString() {
        String matrix = "|";
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix += " " + getValue(i, j) + " ";
            }
            if (i < (getRows() - 1)) {
            matrix += "|\n|";
            }
            if (i == getRows() - 1) {
                matrix += "|";
            }
        }
        return matrix;
    }
    
    /**
     * Adds a matrix with the matrix being called.
     * @param matrix a Matrix object.
     * @return a Matrix.
     * @throws ArrayIndexOutOfBoundsException an exception.
     */
    public Matrix add(Matrix matrix) throws ArrayIndexOutOfBoundsException {
        Matrix newMatrix = new Matrix(this.getRows(), this.getColumns());
        
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                int sum = array2d[i][j] + matrix.getValue(i, j);
                newMatrix.setValue(sum, i, j);
            }
        }
        return newMatrix;
    }
    
    
    
    
    
}
