/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.ingredient;

import it.uniurb.RestaurantMS.core.RepoInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author lucapaolillo
 */
public class IngredientRepository implements RepoInterface<Ingredient> {
    private final HashMap<Ingredient, Double> ingredientList;
    
    /**
     * Constructor.
     */
    public IngredientRepository() {
        this.ingredientList = new HashMap<>();
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
            int maxId = 0;
            for(Ingredient ing : ingredientList.keySet()){
                if(ing.getIngredientId() > maxId){
                    maxId = ing.getIngredientId();
                }
            }
            return maxId + 1;
        }
    }
    
    /**
     * Method to add ingredient.
     * @param name Name of the ingredient to add.
     * @param unit Measurement unit of the ingredient.
     * @param quantity Quantity of the ingredient to add.
     * @return Return true if the ingredient has been added to the list.
     */
    public Ingredient addItem(String name, IngredientUnit unit, double quantity) {
        
        Ingredient ingredientToAdd = new Ingredient(this.generateItemId(), name, unit);
        
        if(!ingredientList.keySet().contains(ingredientToAdd)) {
            ingredientList.put(ingredientToAdd, quantity);
        }
        return ingredientToAdd;
    }
    
    /**
     * Method to remove ingredient.
     * @param ingredientToRemove Ingredient to remove from the list.
     * @return Return true if the ingredient has ben removed successfully.
     */
    @Override
    public boolean removeItem(String ingredientToRemove) {
        boolean removed = false;
        
        for(Ingredient ing : this.ingredientList.keySet()){
            if(ing.getIngredientName() == ingredientToRemove) {
                System.out.println("Item to remove: " + ingredientToRemove);
                removed = true;
            }
        }
        return removed;
    }

    /**
     * Method to get ingredient list.
     * @return Return ingredient list.
     */
    @Override
    public List<Ingredient> getContents(){
        List<Ingredient> orderedIngredients = new ArrayList<>(ingredientList.keySet());
        Collections.sort(orderedIngredients, Comparator.comparing(Ingredient :: getIngredientName));
        return orderedIngredients;
    }
    
    
    /**
     * Method to search ingredient.
     * @param ingredient Ingredient to search into the list.
    */

    public List<Ingredient> searchItemByName(String keyword) {
        String keywordLower = keyword.toLowerCase();
        List<Ingredient> searchResults = new ArrayList<>();

        searchResults = ingredientList.keySet().stream()
                .filter(ingr -> ingr.getIngredientName().toLowerCase().contains(keywordLower))
                .collect(Collectors.toList());

        return searchResults;
    }
}
