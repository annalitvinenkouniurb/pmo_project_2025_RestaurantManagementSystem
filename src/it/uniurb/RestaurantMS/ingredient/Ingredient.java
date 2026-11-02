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
    private IngredientUnit ingredientUnit;
    
    /**
     * Constructor.
     * @param id Ingredient ID.
     * @param name Ingredient name.
     * @param unit Metric system used for the ingredient.
     */
    Ingredient(int id, String name, IngredientUnit unit) {
        this.ingredientId = id;
        this.ingredientName = name;
        this.ingredientUnit = unit;
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
    public IngredientUnit getIngredientUnit() {
        return ingredientUnit;
    }
    
    /**
     * Method to set ingredient measurement unit.
     * @param unit Set the measurement unit of the ingredient.
     */
    public void setIngredientUnit(IngredientUnit unit) {
        this.ingredientUnit = unit;
    }
    
    /**
     * Method to get ingredient informations.
     * @return Return information about the ingredient.
     */
    @Override
    public String toString() {
        return "Ingredient{name='" + this.ingredientName + "', ID='" 
                + this.ingredientId + "', unit='" + this.ingredientUnit + "'}"; 
    }    

}
