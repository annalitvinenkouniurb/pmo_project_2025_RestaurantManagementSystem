/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.stockorder;

import it.uniurb.RestaurantMS.ingredient.Ingredient;
import java.util.HashMap;

/**
 *
 * @author lucapaolillo
 */
public class StockOrder {
    private final int stockOrderID;
    private String stockOrderName;
    private final HashMap<Ingredient, Integer> orderList;
    
    /**
     * Constructor.
     * @param id Stock order ID.
     * @param name Stock order name.
     */
    StockOrder(int id, String name){
        this.orderList = new HashMap<>();
        this.stockOrderID = id;
        this.stockOrderName = name;
    }
    
    /**
     * Method to add ingredient to the stock order.
     * @param ingr Ingredient to add.
     * @param quantity Quantity to add.
     */
    public void addIngredientToOrder(Ingredient ingr, int quantity){
        this.orderList.putIfAbsent(ingr, quantity);
    }
    
    /**
     * Method to remove ingredient from the stock order.
     * @param ingr Ingredient to remove.
     */
    public void removeIngredientFromOrder(Ingredient ingr){
        this.orderList.remove(ingr);
    }
    
    /**
     * Method to get the stock order ID.
     * @return Return stock order ID.
     */
    public int getOrderID(){
        return this.stockOrderID;
    }
    
    /**
     * Method to get stock order name.
     * @return Return stock order name.
     */
    public String getOrderName(){
        return this.stockOrderName;
    }
    
    /**
     * Method used to set stock order name.
     * @param name Name of stock order to set.
     */
    public void setOrderName(String name){
        this.stockOrderName = name;
    }
    
    /**
     * Method used to print stock order list contents.
     */
    public void printContents(){
        System.out.println(this.orderList);
    }
    
    /**
     * Method to get stock order informations.
     * @return Return stock order informations.
     */
    @Override
    public String toString() {
        return "StockOrder{name='" + this.stockOrderName + "', ID='" + this.stockOrderID + "'}"; 
    } 
}
