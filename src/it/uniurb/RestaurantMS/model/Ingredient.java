/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.model;

/**
 * This Class is used to create and define ingredients and
 * their parameters.
 *
 */
public class Ingredient {
    
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
   
    public Ingredient(int id, String name, String unit, double price, double quantity) {
        this.ingredientId = id;
        this.ingredientName = name;
        this.ingredientUnit = unit;
        this.ingredientPrice = price;
        this.ingredientQuantity = quantity;
        
    }
    
    public Ingredient(int id, String name, String unit) {
        this.ingredientId = id;
        this.ingredientName = name;
        this.ingredientUnit = unit;
        this.ingredientPrice = 0;
        this.ingredientQuantity = 0;
        
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
     * @return Returns true if the name is successfully set.
     */
    public boolean setIngredientName(String name) {
        this.ingredientName = name;
        return true;
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
     * @return Returns true if the measurement unit is successfully set.
     */
    public boolean setIngredientUnit(String unit) {
        this.ingredientUnit = unit;
        return true;
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
     * @return Returns true if the price is successfully set.
     */
    public boolean setIngredientPrice(double price) {
        this.ingredientPrice = price;
        return true;
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
     * @return Returns true if the quantity is successfully set.
     */
    public boolean setIngredientQuantity(double quantity) {
        this.ingredientQuantity = quantity;
        return true;
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
