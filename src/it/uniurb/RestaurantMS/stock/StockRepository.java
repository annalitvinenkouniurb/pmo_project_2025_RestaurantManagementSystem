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
    
    public StockRepository() {
        this.stockEntryList = new LinkedHashSet<>();
    }
            
   /**
     *
     * Generate stock entry ID;
     */
    @Override
    public int generateItemId() {
        if(this.stockEntryList.isEmpty()){
            return 1;
        }
        else{
            int id = this.stockEntryList.getLast().getStockEntryId();
            return id + 1;
        }
    }
    
    /**
     *
     * @param expiryDate
     * @param quantity
     * @param ingr
     * @param name
     * @return Return true if the stock entry has been added to the list.
     */
    
    public boolean addItem(LocalDate expiryDate, Double quantity, 
            Ingredient ingr, String name) {
        boolean added = false;
        StockEntry stockEntryToAdd = new StockEntry(this.generateItemId(), 
                expiryDate, quantity, ingr, name);
        
        if(!stockEntryList.contains(stockEntryToAdd)) {
            stockEntryList.addLast(stockEntryToAdd);
            added = true;
        }
        return added;
    }
    
    /**
     *
     * @param stockEntryToRemove
     * @return Returns true if the stock entry has ben removed successfully.
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
    
    @Override
    public boolean updateItemName(StockEntry stockEntryToUpdate, String newName) {
        boolean updated = false;
        if(stockEntryList.contains(stockEntryToUpdate)) {
            stockEntryToUpdate.setStockEntryName(newName);
            updated = true;
        }
        return updated;
        
    }

    @Override
    public LinkedHashSet getContents(){
        return this.stockEntryList;
    }
    
}
