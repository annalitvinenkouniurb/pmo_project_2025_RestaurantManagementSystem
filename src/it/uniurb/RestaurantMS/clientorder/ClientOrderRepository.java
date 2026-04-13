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
    
    /**
     * Constructor.
     */
    public ClientOrderRepository() {
        this.orderList = new LinkedHashSet<>();
    }

    /**
     * Method to generate client order repository ID.
     * @return Return client order repository ID.
     */
    @Override
    public int generateItemId() {
        if(this.orderList.isEmpty()){
            return 1;
        }
        else {
            int id = this.orderList.getLast().getOrderId();
            return id + 1;
        }
    }

    /**
     * Method to add client order to the client order repository.
     * @param name Name of the client order to set.
     * @param table Table of the client order.
     * @param status Status of the client order.
     * @return Return true if it has been correctly added.
     */
    public boolean addItem(String name, int table, OrderStatus status) {
        boolean added = false;        
        ClientOrder orderToAdd = new ClientOrder(generateItemId(), name, table, status);
        
        if(!orderList.contains(orderToAdd)) {
            orderList.addLast(orderToAdd);
            added = true;
        }
        return added;
    }

    /**
     * Method to remove item from the client order repository.
     * @param orderToRemove Client order to remove.
     * @return Return true if it has been correctly removed.
     */
    @Override
    public boolean removeItem(ClientOrder orderToRemove) {
        boolean removed = false;
        
        if(orderList.contains(orderToRemove)) {
            orderList.remove(orderToRemove);
            removed = true;
        }
        return removed;
    }

    /**
     * Method to update client order name.
     * @param clientOrderToUpdate Client order whose name has to be changed.
     * @param newName Client order new name to set.
     * @return Return true if it has been correcly updated.
     */
    @Override
    public boolean updateItemName(ClientOrder clientOrderToUpdate, String newName) {
        boolean updated = false;
        
        if(orderList.contains(clientOrderToUpdate)) {
            clientOrderToUpdate.setOrderName(newName);
            updated = true;
        }
        return updated;
    }

    /**
     * Method to get client order list.
     * @return Return client order list.
     */
    @Override
    public LinkedHashSet<ClientOrder> getContents() {
        return this.orderList;
    }
    
}
