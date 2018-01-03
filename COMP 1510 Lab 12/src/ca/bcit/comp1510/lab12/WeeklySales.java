package ca.bcit.comp1510.lab12;

/**
 * WeeklySales tests the Salesperson classes.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class WeeklySales {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Salesperson[] salesArray = new Salesperson[10];
        
        salesArray[0] = new Salesperson("Cloud", "Strife", 50);
        salesArray[1] = new Salesperson("Tifa", "Lockhart", 45);
        salesArray[2] = new Salesperson("Barrett", "Wallace", 36);
        salesArray[3] = new Salesperson("Cid", "Highwind", 25);
        salesArray[4] = new Salesperson("Cait", "Sith", 3);
        salesArray[5] = new Salesperson("Yuffie", "Kisaragi", 34);
        salesArray[6] = new Salesperson("Reno", "Turk", 21);
        salesArray[7] = new Salesperson("Rufus", "Shinra", 43);
        salesArray[8] = new Salesperson("Red", "Thirteen", 13);
        salesArray[9] = new Salesperson("Zack", "Fair", 49);
        
        Sorting.insertionSort(salesArray);
        System.out.println("Sales ranking for the week: ");
        for (int i = 0; i < salesArray.length; i++) {
            System.out.println(salesArray[i].toString());
        }
    }

}
