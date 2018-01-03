package ca.bcit.comp1510.lab6;

import java.util.Random;

/**
 * Mathematics runs several methods of calculations.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Mathematics {
    
    /**
     * Pi.
     */
    public static final double PI = 3.14159;
    
    /**
     * FT : KM Ratio.
     */
    public static final double ONE_FOOT_TO_KILOMETRE_RATIO = 0.0003048000;
    
    /**
     * Square exponent.
     */
    public static final int SQUARE = 2;
    
    /**
     * Range of random numbers. (0-10)
     */
    public static final int RANGE = 11;
    
    /**
     * Shifts random range limit by 10. (0-10)->(10-20)
     */
    public static final int LIMITSHIFT = 10;
    
    /**
     * Excluding 15.
     */
    public static final int EXCLUDE = 15;
    
    /**
     * Returns the area of the circle with the specified radius.
     * @param radius of a circle.
     * @return area as a double.
     */
    public double getCircleArea(double radius) {
        double area = PI * Math.pow(radius, SQUARE);
        return area;
    }
    
    /**
     * Returns the area of the square with the specified edge length.
     * @param edgeLength of the square.
     * @return area as a double.
     */
    public double getSquareArea(double edgeLength) {
        double area = Math.pow(edgeLength, SQUARE);
        return area;
    }
    
    /**
     * Returns the sum of the specified values.
     * @param first operand.
     * @param second operand.
     * @return sum of the operands.
     */
    public double add(double first, double second) {
        double sum = first + second;
        return sum;
    }
    
    /**
     * Returns the product of the specified values.
     * @param first operand.
     * @param second operand.
     * @return product of the operands.
     */
    public double multiply(double first, double second) {
        double product = first * second;
        return product;
    }
    
    /**
     * Returns the difference of the specified values.
     * @param first operand.
     * @param second operand.
     * @return difference of the operands.
     */
    public double subtract(double first, double second) {
        double difference = first - second;
        return difference;
    }
    
    /**
     * Returns the quotient of the specified values. If the divisor is zero,
     * returns zero instead of NaN or infinity.
     * @param first operand.
     * @param second operand.
     * @return quotient of the operands.
     */
    public double divide(int first, int second) {
        double quotient;
        
        if (second == 0) {
            quotient = 0;
        } else {
            quotient = (first / second);
        }
        
        return quotient;
    }
    /**
     * Returns the absolute value of the specified integer.
     * 
     * @param number to test.
     * @return absolute value of a number.
     */
    public int absoluteValue(int number) {
        int absolute = Math.abs(number);
        return absolute;
    }
    
    /**
     * Returns a random number between 10 and 20 inclusive,
     * but NOT 15.
     * @return random number in range [10, 20] excluding 15.
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        
        Random rand = new Random();
        int random = (rand.nextInt(RANGE) + LIMITSHIFT);
        
        while (random == EXCLUDE) {
            random = (rand.nextInt(RANGE) + LIMITSHIFT);
        }
        return random;
    }
    
    /**
     * Converts the specified number of feet to kilometres.
     * @param feet to convert.
     * @return kilometres in the specified number of feet.
     */
    public double convertFeetToKilometres(double feet) {
        double kilometres = (feet * ONE_FOOT_TO_KILOMETRE_RATIO);
        return kilometres;
    }
    
    /**
     * Returns the sum of the positive integers between 0 and the specified
     * number inclusive. If the specified number is negative, returns zero.
     * @param number upper bound.
     * @return sum as an integer.
     */
    public int sumOfInts(int number) {
        int sum = 0;
        
        if (number < 0) {
            sum = 0;
        } else {
            while (number >= 0) {
                sum += number;
                number--;
            }
        }
        return sum;
    }
    
    /**
     * Returns true if the specified value is positive, else false.
     * @param number to test
     * @return true if number is positive, else false.
     */
    public boolean isPositive(int number) {
        boolean yup = true;
        boolean nope = false;
        
        if (number > 0) {
            return yup;
        } else {
        return nope;
        }
    }
    
    /**
     * Returns true if the specified value is even, else false.
     * @param number to test
     * @return true if number is even, else.
     */
    public boolean isEven(int number) {
        boolean yup = true;
        boolean nope = false;
        
        if ((number % 2) == 1) {
            return nope;
        } else {
            return yup;
        }
    }
    
    /**
     * Returns sum of the even numbers between 0 and the specified value,
     * inclusive.
     * @param number upper bound.
     * @return sum of the even numbers between 0 and number.
     */
    public int sumOfEvens(int number) {
        int sum = 0;
        
        // for positive numbers
        if (number > 0) {
            while (number > 0) {
                sum += number;
                
                if ((number % 2) == 1) {
                    number--;
                } else {
                    number = number - 2;
                }
            }
        } else { // for negative numbers
            while (number < 0) {
                sum += number;
                
                if ((number % 2) == 1) {
                    number++;
                } else {
                    number = number + 2;
                }
            }
        }
        return sum;
    }
    
    /**
     * Returns the sum of the number between zero and the
     * first parameter that are divisible by the second
     * number. For example, sumOfProducts(10, 3) will return
     * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
     * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
     * return -2 + -4 + -6 + -8 = -30.
     * @param bound the upper bound
     * @param divisor the divisor.
     * @return sum
     */
    public int sumOfProducts(int bound, int divisor) {
        int sum = 0;
        int count = 1;
        
        if (bound > 0) { // For positive
            while (divisor <= bound) {
                sum += divisor;
                divisor += divisor / count;
                count++;
            }
        } else { // For negative
            while (divisor >= bound) {
                divisor = (Math.abs(divisor) * (-1));
                sum += divisor;
                divisor += divisor / count;
                count++;
            }
        }
        return sum;
    }

}
