/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.stock;

import it.uniurb.RestaurantMS.core.RepoInterface;
import java.util.LinkedHashSet;


/**
 *
 * @author lucapaolillo
 */
public class StockRepository implements RepoInterface<StockEntry> {

    private LinkedHashSet<StockEntry> stockEntryList;
    
    
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
    
       /*public LinkedHashSet<StockEntry> duplicateStockEntryList() {
            LinkedHashSet<StockEntry> StockEntryListDuplicated = new LinkedHashSet<>();
            this.stockEntryList = StockEntryListDuplicated;
            return StockEntryListDuplicated;
    }
    */
    
    /**
     *
     * @param stockEntryToAdd
     * @return Return true if the stock entry has been added to the list.
     */
    
    @Override
    public boolean addItem(StockEntry stockEntryToAdd) {
        boolean added = false;        
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

    
    /**
     *
     * @param stockEntryToSearch Stock entry to search in the list.
     */
    /* public void searchStockEntry(StockEntry stockEntryToSearch) {
            if(this.stockEntryList.contains(stockEntryToSearch)) {
                System.out.println(stockEntryToSearch);
            }
            else{
                System.out.println(stockEntryToSearch + " non presente.");
            }        
    }
*/
    

    @Override
    public boolean updateItemName(StockEntry stockEntryToUpdate, String newName) {
        boolean updated = false;
        if(stockEntryList.contains(stockEntryToUpdate)) {
            stockEntryToUpdate.setStockEntrytName(newName);
            updated = true;
        }
        return updated;
        
    }

    @Override
    public void printContents(){
        for(StockEntry item : stockEntryList){
            System.out.println(item.toString());
            
        }
    }
    
    
}
