package ca.bcit.comp1510.lab10;

import java.text.NumberFormat;

/**
 * Transaction class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Transaction {

    /**
     * The number to expand the cart by.
     */
    public static final int EXPAND = 3;
    
    /**
     * Stores elements of type Item.
     */
    private Item[] cart;
    
    /**
     * The total price of the Items in the array.
     */
    private double totalPrice;
    
    /**
     * The number of Item objects.
     */
    private int itemCount;
    
    /**
     * The number of items in the cart.
     */
    private int itemsInCart;
    
    /**
     * Size of the array.
     */
    private int arraySize;
    
    /**
     * Currency formatter.
     */
    private NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    /**
     * Constructs an object of type Transaction.
     * @param arraySize size of the Item array.
     */
    public Transaction(int arraySize) {
        
        this.arraySize = arraySize;
        cart = new Item[this.arraySize];
        totalPrice = 0;
        itemCount = 0;
    }
    
    /**
     * Adds item to the cart.
     * @param name a String.
     * @param price a double.
     * @param quantity an int.
     */
    public void addToCart(String name, double price, int quantity) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        Item item = new Item(name, price, quantity);
        cart[itemCount] = item;
        itemCount++;
        totalPrice += (price * quantity);
    }
    
    /**
     * Adds item to the cart.
     * @param item an Item object.
     */
    public void addToCart(Item item) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = item;
        itemCount++;
        totalPrice += item.getPrice();
    }
    
    /**
     * Increases size of the cart by 3 items.
     */
    public void increaseSize() {
        Item[] temp = new Item[arraySize + EXPAND];
        
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
        cart = temp;
    }
    
    /**
     * Returns the total price of the cart.
     * @return a double.
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * Returns the count of items in the cart.
     * @return an int.
     */
    public int getCount() {
        itemsInCart = 0;
        for (Item item : cart) {
            if (item != null) {
                itemsInCart += item.getQuantity();
            }
        }
        return itemsInCart;
    }

    /**
     * Returns a String representation of the Transaction.
     * @see java.lang.Object#toString()
     * @return
     */
    @Override
    public String toString() {
        String allItems = "";
        for (Item item : cart) {
            if (item != null) {
                allItems += item.toString() + ", ";
            }
        }
        
        return "Transaction:\n" + "Items in the cart: " + allItems 
            + "\nTotal Price: " + currency.format(getTotalPrice()) 
            + "\nItems in cart: " + getCount();
    }
    
    
}
