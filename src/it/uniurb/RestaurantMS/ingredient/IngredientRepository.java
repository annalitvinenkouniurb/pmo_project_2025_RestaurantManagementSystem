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
     *
     * Generate ingredient ID;
     */
    @Override
    public int generateItemId() {
        if(this.ingredientList.isEmpty()){
            return 1;
        }
        else{
            int id = this.ingredientList.getLast().getIngredientId();
            return id + 1;
        }
    }
    
    /**
     *
     * @param name
     * @param unit
     * @param price
     * @param quantity
     * @return Return true if the ingredient has been added to the list.
     */
    
    public boolean addItem(String name, String unit, double price, double quantity) {
        boolean added = false;
        Ingredient ingredientToAdd = new Ingredient(this.generateItemId(), name, 
                unit, price, quantity);
        
        if(!ingredientList.contains(ingredientToAdd)) {
            ingredientList.addLast(ingredientToAdd);
            added = true;
        }
        return added;
    }
    
    /**
     *
     * @param ingredientToRemove
     * @return Returns true if the ingredient has ben removed successfully.
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

    @Override
    public boolean updateItemName(Ingredient ingredientToUpdate, String newName) {
        boolean updated = false;
        if(ingredientList.contains(ingredientToUpdate)) {
            ingredientToUpdate.setIngredientName(newName);
            updated = true;
        }
        return updated;
        
    }

    @Override
    public LinkedHashSet getContents(){
        return this.ingredientList;
    }
    
    
    /**
     *
     * @param ingredient Ingredient to search in the list.
     */
    public void searchIngredient(Ingredient ingredient) {
        if(this.ingredientList.contains(ingredient)) {
            System.out.println(ingredient);
        }
        else{
            System.out.println(ingredient + " non presente.");
        }
        
    }
}
