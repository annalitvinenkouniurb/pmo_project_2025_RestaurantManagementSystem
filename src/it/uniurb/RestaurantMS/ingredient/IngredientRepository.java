/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.ingredient;

import it.uniurb.RestaurantMS.core.RepoInterface;
import java.util.LinkedHashSet;

/**
 *
 * @author lucapaolillo
 */
public class IngredientRepository implements RepoInterface<Ingredient> {
    private final LinkedHashSet<Ingredient> ingredientList;
    
    /**
     * Constructor.
     */
    public IngredientRepository() {
        this.ingredientList = new LinkedHashSet<>();
    }
    
    /**
     * Method to generate ingredient ID.
     * @return Return ingredient ID.
     */
    @Override
    public int generateItemId() {
        if(this.ingredientList.isEmpty()){
            return 1;
        }
        else {
            int id = this.ingredientList.getLast().getIngredientId();
            return id + 1;
        }
    }
    
    /**
     * Method to add ingredient.
     * @param name Name of the ingredient to add.
     * @param unit Measurement unit of the ingredient.
     * @param price Price of the ingredient.
     * @param quantity Quantity of the ingredient to add.
     * @return Return true if the ingredient has been added to the list.
     */
    public boolean addItem(String name, String unit, double price, double quantity) {
        boolean added = false;
        Ingredient ingredientToAdd = new Ingredient(this.generateItemId(), name, unit, price, quantity);
        
        if(!ingredientList.contains(ingredientToAdd)) {
            ingredientList.addLast(ingredientToAdd);
            added = true;
        }
        return added;
    }
    
    /**
     * Method to remove ingredient.
     * @param ingredientToRemove Ingredient to remove from the list.
     * @return Return true if the ingredient has ben removed successfully.
     */
    @Override
    public boolean removeItem(Ingredient ingredientToRemove) {
        boolean removed = false;
        
        if(ingredientList.contains(ingredientToRemove)) {
            ingredientList.remove(ingredientToRemove);
            removed = true;
        }
        return removed;
    }

    /**
     * Method to update ingredient name.
     * @param ingredientToUpdate Ingredient to update.
     * @param newName New name for the ingredient.
     * @return Return true if it has been correctly updated.
     */
    @Override
    public boolean updateItemName(Ingredient ingredientToUpdate, String newName) {
        boolean updated = false;
        if(ingredientList.contains(ingredientToUpdate)) {
            ingredientToUpdate.setIngredientName(newName);
            updated = true;
        }
        return updated;
    }

    /**
     * Method to get ingredient list.
     * @return Return ingredient list.
     */
    @Override
    public LinkedHashSet<Ingredient> getContents(){
        return this.ingredientList;
    }
    
    
    /**
     * Method to search ingredient.
     * @param ingredient Ingredient to search into the list.
     */
    public void searchIngredient(Ingredient ingredient) {
        if(this.ingredientList.contains(ingredient)) {
            System.out.println(ingredient);
        }
        else {
            System.out.println(ingredient + " non presente.");
        }
    }
    
}
