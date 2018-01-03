/**
 * 
 */
package ca.bcit.comp1510.lab4;

/**
 * Creates a Student class.
 * @author Burt
 * @version 1.0
 */
public class Student {
    
    /**
     * First name.
     */
    private String firstName;
    
    /**
     * Last name.
     */
    private String lastName;
    
    /**
     * Year of birth.
     */
    private int yearOfBirth;
    
    /**
     * Student number.
     */
    private int studentNum;
    
    /**
     * Grade point average.
     */
    private double gpa;
    
    /**
     * Creates a Student object.
     * @param first First Name.
     * @param last Last Name.
     * @param year Birth Year.
     * @param num Student Number.
     * @param grade GPA.
     */
    public Student(String first, String last, int year, int num, double grade) {
        firstName = first;
        lastName = last;
        yearOfBirth = year;
        studentNum = num;
        gpa = grade;
    }
    
    /**
     * Sets first name.
     * @param first to String.
     */
    public void setFirstName(String first) {
        firstName = first;
    }
    
    /**
     * Sets last name.
     * @param last to String.
     */
    public void setLastName(String last) {
        lastName = last;
    }
    
    /**
     * Sets year of birth.
     * @param year to int
     */
    public void setYear(int year) {
        yearOfBirth = year;
    }
    
    /**
     * Sets student number.
     * @param num to int
     */
    public void setNumber(int num) {
        studentNum = num;
    }
    
    /**
     * Sets grade point average.
     * @param grade to double
     */
    public void setGrade(double grade) {
        gpa = grade;
    }
    
    /**
     * Returns first name value of Student to String.
     * @return to String
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Returns last value of Student to String.
     * @return to String
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Returns year of birth of Student to int.
     * @return to int
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    
    /**
     * Returns the student number of Student to int.
     * @return to int
     */
    public int getStudentNumber() {
        return studentNum;
    }
    
    /**
     * Returns the GPA of Student to double.
     * @return to double
     */
    public double getGPA() {
        return gpa;
    }
    
    /**
     * Returns student's profile.
     * @return toString to String
     */
    public String toString() {
        
        String value = ("Full Name: " + firstName + " " + lastName 
                + "\nYear of Birth " + yearOfBirth + "\nStudent Number: " 
                + studentNum + "\nGPA: " + gpa);

        return value;
    }
}
