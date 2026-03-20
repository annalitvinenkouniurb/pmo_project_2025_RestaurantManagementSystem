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
    
    private final LinkedHashSet<StockOrder> orderList = new LinkedHashSet<>();            
    
    /**
     * Constructor.
     */
    public StockOrderRepository() {
        
    }
    
    @Override
    public int generateItemId(){
    if(this.orderList.isEmpty()){
            return 1;
        }
        else{
            int id = this.orderList.getLast().getOrderID();
            return id + 1;
        }    
    }
            
    public boolean addItem(String name){
        boolean added = false;
        StockOrder itemToAdd = new StockOrder(this.generateItemId(), name);
        
        if(!orderList.contains(itemToAdd)) {
            orderList.addLast(itemToAdd);
            added = true;
        }
        return added;
    }
    
    @Override
    public boolean removeItem(StockOrder itemToRemove){
        boolean removed = false;
        if(orderList.contains(itemToRemove)) {
            orderList.remove(itemToRemove);
            removed = true;
        }
        return removed;
    }
    
    @Override
    public boolean updateItemName(StockOrder orderToUpdate, String newName) {
        boolean updated = false;
        if(orderList.contains(orderToUpdate)) {
            orderToUpdate.setOrderName(newName);
            updated = true;
        }
        return updated;
        
    }
    
    public void searchOrder (StockOrder order) {
        
        
            if(this.orderList.contains(order)) {
                System.out.println(order);
            }
            else{
                System.out.println(order + " non presente.");
            }
        
    }
    
    @Override
    public LinkedHashSet getContents(){
        return this.orderList;
    }
    
}
