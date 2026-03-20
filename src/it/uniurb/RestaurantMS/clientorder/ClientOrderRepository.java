/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.clientorder;

import it.uniurb.RestaurantMS.core.RepoInterface;
import java.util.LinkedHashSet;

/**
 *
 * @author nnltvnnk
 */
public class ClientOrderRepository implements RepoInterface<ClientOrder>{
    
    private final LinkedHashSet<ClientOrder> orderList;
    
    
    public ClientOrderRepository() {
        this.orderList = new LinkedHashSet<>();
    }

    @Override
    public int generateItemId() {
        if(this.orderList.isEmpty()){
            return 1;
        }
        else{
            int id = this.orderList.getLast().getOrderId();
            return id + 1;
        }
    }


    public boolean addItem(String name, int table, OrderStatus status) {
        boolean added = false;        
        ClientOrder orderToAdd = new ClientOrder(generateItemId(), name, table, status);
        
        if(!orderList.contains(orderToAdd)) {
            orderList.addLast(orderToAdd);
            added = true;
        }
        return added;
    }

    @Override
    public boolean removeItem(ClientOrder orderToRemove) {
        boolean removed = false;
        if(orderList.contains(orderToRemove)) {
            orderList.remove(orderToRemove);
            removed = true;
        }
        return removed;
    }

    @Override
    public boolean updateItemName(ClientOrder clientOrderToUpdate, String newName) {
        boolean updated = false;
        if(orderList.contains(clientOrderToUpdate)) {
            clientOrderToUpdate.setOrderName(newName);
            updated = true;
        }
        return updated;
        
    }

    @Override
    public LinkedHashSet getContents() {
        return this.orderList;
    }
    
}
