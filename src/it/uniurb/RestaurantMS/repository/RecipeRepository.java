/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.repository;

import it.uniurb.RestaurantMS.model.Recipe;
import java.util.LinkedHashSet;

/**
 *
 * @author nnltvnnk
 */
public class RecipeRepository implements RepoInterface<Recipe>{
    
    private LinkedHashSet<Recipe> recipeList = new LinkedHashSet<>();            
    
    /**
     * Constructor.
     */
    
    public RecipeRepository() {
        
    }

    @Override
    public int generateItemId() {
        if(this.recipeList.isEmpty()){
            return 1;
        }
        else{
            int id = this.recipeList.getLast().getRecipeId();
            return id + 1;
        }
    }

    @Override
    public boolean addItem(Recipe recipeToAdd) {
        boolean added = false;        
        if(!recipeList.contains(recipeToAdd)) {
            recipeList.addLast(recipeToAdd);
            added = true;
        }
        return added;
    }
    
    /**
     *
     * @param recipeToRemove
     * @return Returns true if the recipe has ben removed successfully.
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


    @Override
    public boolean updateItemName(Recipe recipeToUpdate, String newName) {
        boolean updated = false;
        if(recipeList.contains(recipeToUpdate)) {
            recipeToUpdate.setRecipeName(newName);
            updated = true;
        }
        return updated;
        
    }

    @Override
    public void printContents(){
        for(Recipe item : recipeList){
            System.out.println(item.toString());
            
        }
    }
    
    
     public void searchRecipe(Recipe recipe) {
        
        
            if(this.recipeList.contains(recipe)) {
                System.out.println(recipe);
            }
            else{
                System.out.println(recipe + " non presente.");
            }
        
    }
    
}
