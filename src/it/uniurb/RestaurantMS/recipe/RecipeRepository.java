/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.recipe;

import it.uniurb.RestaurantMS.core.RepoInterface;
import java.util.LinkedHashSet;

/**
 *
 * @author nnltvnnk
 */
public class RecipeRepository implements RepoInterface<Recipe>{
    private final LinkedHashSet<Recipe> recipeList = new LinkedHashSet<>();            
    
    /**
     * Constructor.
     */
    public RecipeRepository() {
        
    }

    /**
     * Method to generate recipe repository ID.
     * @return Return recipe repository ID.
     */
    @Override
    public int generateItemId() {
        if(this.recipeList.isEmpty()){
            return 1;
        }
        else {
            int id = this.recipeList.getLast().getRecipeId();
            return id + 1;
        }
    }

    /**
     * Method to add recipe.
     * @param name Name of the recipe to add.
     * @param custom 
     * @return Return true if it has been correctly added.
     */
    public boolean addItem(String name, boolean custom) {
        boolean added = false;
        Recipe recipeToAdd = new Recipe(this.generateItemId(), name, custom);
        
        if(!recipeList.contains(recipeToAdd)) {
            recipeList.addLast(recipeToAdd);
            added = true;
        }
        return added;
    }
    
    /**
     * Method to remove recipe.
     * @param recipeToRemove Recipe to remove.
     * @return Return true if the recipe has ben removed successfully.
     */
    @Override
    public boolean removeItem(Recipe recipeToRemove) {
        boolean removed = false;
        
        if(recipeList.contains(recipeToRemove)) {
            recipeList.remove(recipeToRemove);
            removed = true;
        }
        return removed;
    }

    /**
     * Method to update recipe name.
     * @param recipeToUpdate Recipe to update.
     * @param newName New name to set.
     * @return Return true if it has been correctly updated.
     */
    @Override
    public boolean updateItemName(Recipe recipeToUpdate, String newName) {
        boolean updated = false;
        
        if(recipeList.contains(recipeToUpdate)) {
            recipeToUpdate.setRecipeName(newName);
            updated = true;
        }
        return updated;
    }

    /**
     * Method to get recipe list.
     * @return Return recipe list.
     */
    @Override
    public LinkedHashSet getContents(){
        return this.recipeList;
    }
    
    /**
     * Method to search recipe.
     * @param recipe Recipe to search.
     */
    public void searchRecipe(Recipe recipe) {
        if(this.recipeList.contains(recipe)) {
            System.out.println(recipe);
        }
        else {
                System.out.println(recipe + " not found.");
            }
    }
    
}
