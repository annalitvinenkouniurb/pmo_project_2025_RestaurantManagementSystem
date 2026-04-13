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
     * Constructor.
     * @param id Ingredient ID.
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
     * Method to get ingredient ID.
     * @return Return the ingredient ID.
     */
    public int getIngredientId() {
        return ingredientId;
    }
    
    /**
     * Method to get ingredient name.
     * @return Return the name of the ingredient.
     */
    public String getIngredientName() {
        return ingredientName;
    }
    
    /**
     * Method to set ingredient name.
     * @param name Set the name of the ingredient.
     */
    public void setIngredientName(String name) {
        this.ingredientName = name;
    }
    
    /**
     * Method to get ingredient measurement unit.
     * @return Return the measurement unit of the ingredient.
     */
    public String getIngredientUnit() {
        return ingredientUnit;
    }
    
    /**
     * Method to set ingredient measurement unit.
     * @param unit Set the measurement unit of the ingredient.
     */
    public void setIngredientUnit(String unit) {
        this.ingredientUnit = unit;
    }
    
    /**
     * Method to get ingredient price.
     * @return Return the price of the ingredient.
     */
    public double getIngredientPrice() {
        return ingredientPrice;
    }
    
    /**
     * Method to set ingredient price.
     * @param price Set the price of the ingredient.
     */
    public void setIngredientPrice(double price) {
        this.ingredientPrice = price;
    }
    
    /**
     * Method to get ingredient quantity.
     * @return Return the quantity of the ingredient.
     */
    public double getIngredientQuantity() {
        return ingredientQuantity;
    }
    
    /**
     * Method to set ingredient quantity.
     * @param quantity Set the quantity of the ingredient.
     */
    public void setIngredientQuantity(double quantity) {
        this.ingredientQuantity = quantity;
    }
    
    /**
     * Method to get ingredient informations.
     * @return Return information about the ingredient.
     */
    @Override
    public String toString() {
        return "Ingredient{name='" + this.ingredientName + "', ID='" + this.ingredientId + "', unit='"
                + this.ingredientUnit + "', price=" + this.ingredientPrice + "'}"; 
    }    

}
