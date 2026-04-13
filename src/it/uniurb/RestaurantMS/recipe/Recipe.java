/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.recipe;

import it.uniurb.RestaurantMS.core.MenuItemInterface;
import it.uniurb.RestaurantMS.ingredient.Ingredient;
import java.util.HashMap;

/**
 *
 * @author lucapaolillo
 */
public class Recipe  implements MenuItemInterface{
    private final int recipeId;
    private String recipeName;
    private final boolean isCustom;
    private final HashMap<Ingredient, Double> recipeList;
    
    /**
     * Constructor.
     * @param id Recipe ID.
     * @param name Recipe name.
     * @param custom 
     */
    public Recipe (int id, String name, boolean custom) {
        this.recipeId = id;
        this.recipeName = name;
        this.isCustom = custom;
        this.recipeList = new HashMap<>();      
    }
    
    /**
     * Method to get recipe ID.
     * @return Return recipe ID.
     */
    public int getRecipeId() {
        return recipeId;
    }
    
    /**
     * Method to get recipe name.
     * @return Return recipe name.
     */
    public String getRecipeName() {
        return recipeName;
    }
    
    /**
     * Method to set recipe name.
     * @param name Recipe name to set.
     */
    public void setRecipeName(String name) {
        this.recipeName = name;
    }
    
    /**
     * Method to know if recipe is custom.
     * @return Return true if it is custom.
     */
    public boolean getIsCustom() {
        return isCustom;
    }
    
    /**
     * Method to get recipe informations.
     * @return Return recipe informations.
     */
    @Override
    public String toString() {
        return "Recipe{name='" + this.recipeName + "', id='" + this.recipeId + "', 'is custom?'='"
                + this.isCustom + "'}"; 
    }
    
    /**
     * Method to add ingredient to recipe.
     * @param ingr Ingredient to add.
     * @param quantity Quantity of the ingredient that has to be added.
     */
    public void addIngredientToRecipe(Ingredient ingr, Double quantity){
        this.recipeList.putIfAbsent(ingr, quantity);
    }
    
    /**
     * Method to remove ingredient from recipe.
     * @param ingr Ingredient to remove from recipe.
     */
    public void removeIngredientFromRecipe(Ingredient ingr){
        this.recipeList.remove(ingr);
    }
    
    /**
     * Method to update ingredient quantity in a recipe.
     * @param ingr Ingredient whose quantity has to be updated.
     * @param newQuantity New ingredient quantity.
     */
    public void updateIngredientQuantity(Ingredient ingr, Double newQuantity){
        this.recipeList.put(ingr, newQuantity);
    }
}
