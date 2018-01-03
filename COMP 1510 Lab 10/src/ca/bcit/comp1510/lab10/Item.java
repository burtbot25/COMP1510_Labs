package ca.bcit.comp1510.lab10;

import java.text.NumberFormat;

/**
 * Item class.
 *
 * @author Wilburt Herrera
 * @version 2017
 */
public class Item {
    
    /**
     * Name of the item.
     */
    private final String name;
    
    /**
     * Price of the item.
     */
    private final double price;
    
    /**
     * Quantitu of the item.
     */
    private final int quantity;
    
    /**
     * Currency formatter.
     */
    private NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    /**
     * Constructs an object of type Item.
     * @param name a String.
     * @param price a double.
     * @param quantity an int.
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    /**
     * Constructs an object of type Item, and sets the quantity to 1.
     * @param name a String.
     * @param price a double.
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    /**
     * Returns the name for this Item.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the price for this Item.
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the quantity for this Item.
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Returns a String representation of the Item object.
     * @see java.lang.Object#toString()
     * @return a String of the object's states.
     */
    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + currency.format(getPrice()) 
            + "/each" + ", quantity=" + quantity + "]";
    }
    
}
