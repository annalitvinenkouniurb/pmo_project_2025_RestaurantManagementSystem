/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.ingredient;

import it.uniurb.RestaurantMS.core.MenuItemInterface;

/**
 * This Class is used to create and define ingredients and
 * their parameters.
 *
 */
public class Ingredient implements MenuItemInterface{
    
    private final int ingredientId;
    private String ingredientName;
    private String ingredientUnit;
    private double ingredientPrice;
    private double ingredientQuantity;
    
    /**
     *
     * @param id Ingredient identifier.
     * @param name Ingredient name.
     * @param unit Metric system used for the ingredient.
     * @param price The price per unit of the ingredient.
     * @param quantity Ingredient quantity.
     */
   
    Ingredient(int id, String name, String unit, double price, double quantity) {
        this.ingredientId = id;
        this.ingredientName = name;
        this.ingredientUnit = unit;
        this.ingredientPrice = price;
        this.ingredientQuantity = quantity;
        
    }
    
    /**
     *
     * @return Returns the ingredient ID.
     */
    public int getIngredientId() {
        return ingredientId;
    }
    
    /**
     *
     * @return Returns the name of the ingredient.
     */
    public String getIngredientName() {
        return ingredientName;
    }
    
    /**
     *
     * @param name: Sets the name of the ingredient.
     */
    public void setIngredientName(String name) {
        this.ingredientName = name;
    }
    
    /**
     *
     * @return Returns the measurement unit of the ingredient.
     */
    public String getIngredientUnit() {
        return ingredientUnit;
    }
    
    /**
     *
     * @param unit: Sets the measurement unit of the ingredient.
     */
    public void setIngredientUnit(String unit) {
        this.ingredientUnit = unit;
    }
    
    /**
     *
     * @return Returns the price of the ingredient.
     */
    public double getIngredientPrice() {
        return ingredientPrice;
    }
    
    /**
     *
     * @param price: Sets the price of the ingredient.
     */
    public void setIngredientPrice(double price) {
        this.ingredientPrice = price;
    }
    
    /**
     *
     * @return Returns the quantity of the ingredient.
     */
    public double getIngredientQuantity() {
        return ingredientQuantity;
    }
    
    /**
     *
     * @param quantity: Sets the quantity of the ingredient.
     */
    public void setIngredientQuantity(double quantity) {
        this.ingredientQuantity = quantity;
    }
    
    /**
     * 
     * @return Returns information about the ingredient.
     */
    @Override
    public String toString() {
        return "Ingredient{name='" + this.ingredientName + "', ID='" + this.ingredientId + "', unit='"
                + this.ingredientUnit + "', price=" + this.ingredientPrice + "'}"; 
    }    

}
