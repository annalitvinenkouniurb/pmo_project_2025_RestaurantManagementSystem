/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.model;

import java.util.HashMap;

/**
 *
 * @author lucapaolillo
 */
public class Recipe {
    private final int recipeId;
    private String recipeName;
    private final boolean isCustom;
    private HashMap<Ingredient, Double> recipeList;
    
    public Recipe (int id, String name, boolean custom) {
        this.recipeId = id;
        this.recipeName = name;
        this.isCustom = custom;
        this.recipeList = new HashMap<Ingredient, Double>();
    }
    
    public int getRecipeId() {
        return recipeId;
    }
    
    public String getRecipeName() {
        return recipeName;
    }
    
    public void setRecipeName(String name) {
        this.recipeName = name;
    }
    
    public boolean getIsCustom() {
        return isCustom;
        
    }
    
    @Override
    
    public String toString() {
        return "Recipe{name='" + this.recipeName + "', id='" + this.recipeId + "', 'is custom?'='"
                + this.isCustom + "'}"; 
    } 
    
    
    public void printContents(){
        System.out.println(this.recipeList);
    }
    
    public void addIngredientToRecipe(Ingredient ingr, Double quantity){
        this.recipeList.putIfAbsent(ingr, quantity);
    }
    
    public void removeIngredientFromRecipe(Ingredient ingr){
        this.recipeList.remove(ingr);
    }
    
    
    public void updateIngredientQuantity(Ingredient ingr, Double newQuantity){
        this.recipeList.put(ingr, newQuantity);
    }
        
}
