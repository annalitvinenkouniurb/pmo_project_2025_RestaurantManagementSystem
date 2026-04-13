/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.stock;

import it.uniurb.RestaurantMS.core.RepoInterface;
import it.uniurb.RestaurantMS.ingredient.Ingredient;
import java.time.LocalDate;
import java.util.LinkedHashSet;


/**
 *
 * @author lucapaolillo
 */
public class StockRepository implements RepoInterface<StockEntry> {
    private final LinkedHashSet<StockEntry> stockEntryList;
    
    /**
     * 
     * Constructor.
     */
    public StockRepository() {
        this.stockEntryList = new LinkedHashSet<>();
    }
            
    /**
     *
     * Method to generate stock entry ID.
     */
    @Override
    public int generateItemId() {
        if(this.stockEntryList.isEmpty()){
            return 1;
        }
        else {
            int id = this.stockEntryList.getLast().getStockEntryId();
            return id + 1;
        }
    }
    
    /**
     * Method to add stock.
     * @param expiryDate Expiry date of the stock to add.
     * @param quantity Stock quantity to add.
     * @param ingr Ingredient to add.
     * @param name Name of the stock to add.
     * @return Return true if it has been correctly added.
     */
    public boolean addItem(LocalDate expiryDate, Double quantity, Ingredient ingr, String name) {
        boolean added = false;
        StockEntry stockEntryToAdd = new StockEntry(this.generateItemId(), expiryDate, quantity, ingr, name);
        
        if(!stockEntryList.contains(stockEntryToAdd)) {
            stockEntryList.addLast(stockEntryToAdd);
            added = true;
        }
        return added;
    }
    
    /**
     * Method to remove stock entry.
     * @param stockEntryToRemove Stock entry to remove.
     * @return Return true if the stock entry has ben removed successfully.
     */
    @Override
    public boolean removeItem(StockEntry stockEntryToRemove) {
        boolean removed = false;
        
        if(stockEntryList.contains(stockEntryToRemove)) {
            stockEntryList.remove(stockEntryToRemove);
            removed = true;
        }
        return removed;
    }
    
    /**
     * Method to update stock entry name.
     * @param stockEntryToUpdate Stock entry to update.
     * @param newName Stock entry new name.
     * @return Return true if it has been correctly updated.
     */
    @Override
    public boolean updateItemName(StockEntry stockEntryToUpdate, String newName) {
        boolean updated = false;
        
        if(stockEntryList.contains(stockEntryToUpdate)) {
            stockEntryToUpdate.setStockEntryName(newName);
            updated = true;
        }
        return updated;
    }

    /**
     * Method to get stock entry list.
     * @return Return stock entry list.
     */
    @Override
    public LinkedHashSet<StockEntry> getContents(){
        return this.stockEntryList;
    }
    
}
