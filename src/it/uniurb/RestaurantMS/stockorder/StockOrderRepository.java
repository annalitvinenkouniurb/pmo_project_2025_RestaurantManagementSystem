/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.stockorder;
import it.uniurb.RestaurantMS.core.RepoInterface;
import java.util.LinkedHashSet;

/**
 *
 * @author nnltvnnk
 */
public class StockOrderRepository implements RepoInterface<StockOrder>{
    private final LinkedHashSet<StockOrder> orderList;            
    
    /**
     * 
     * Constructor.
     */
    public StockOrderRepository() {
        this.orderList = new LinkedHashSet<>(); 
    }
    
    /**
     * Method to generate stock order ID.
     * @return Return stock order ID.
     */
    @Override
    public int generateItemId(){
    if(this.orderList.isEmpty()){
            return 1;
        }
        else {
            int id = this.orderList.getLast().getOrderID();
            return id + 1;
        }    
    }
    
    /**
     * Method to add stock order to the stock order list.
     * @param name Name of stock order to add.
     * @return Return true if it has been correctly added.
     */        
    public boolean addItem(String name){
        boolean added = false;
        StockOrder itemToAdd = new StockOrder(this.generateItemId(), name);
        
        if(!orderList.contains(itemToAdd)) {
            orderList.addLast(itemToAdd);
            added = true;
        }
        return added;
    }
    
    /**
     * Method to remove stock order from stock order list.
     * @param itemToRemove Stock order to remove from the list.
     * @return Return true if it has been correctly removed.
     */
    @Override
    public boolean removeItem(StockOrder itemToRemove){
        boolean removed = false;
        if(orderList.contains(itemToRemove)) {
            orderList.remove(itemToRemove);
            removed = true;
        }
        return removed;
    }
    
    /**
     * Method to update stock order name.
     * @param orderToUpdate Stock order to update.
     * @param newName New name of the stock order.
     * @return Return true if it has been correctly updated.
     */
    @Override
    public boolean updateItemName(StockOrder orderToUpdate, String newName) {
        boolean updated = false;
        
        if(orderList.contains(orderToUpdate)) {
            orderToUpdate.setOrderName(newName);
            updated = true;
        }
        return updated;
    }
    
    /**
     * Method to search stock order.
     * @param order Order to search.
     */
    public void searchOrder (StockOrder order) {
        
            if(this.orderList.contains(order)) {
                System.out.println(order);
            }
            else{
                System.out.println(order + " not found.");
            }
    }
    
    /**
     * Method to get stock order list.
     * @return Return stock order list.
     */
    @Override
    public LinkedHashSet<StockOrder> getContents(){
        return this.orderList;
    }
    
}
