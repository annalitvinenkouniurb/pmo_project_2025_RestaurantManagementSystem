/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.clientorder;

import it.uniurb.RestaurantMS.menu.MenuItem;
import java.util.HashMap;

/**
 *
 * @author lucapaolillo
 */
public class ClientOrder {
    
    private final int orderId;
    private String orderName;
    private int orderTable;
    private OrderStatus orderStatus;
    private final HashMap<MenuItem, Integer> orderList;  
    
    /**
     * Constructor.
     */
    ClientOrder(int id, String name, int table, OrderStatus status) {
        this.orderId = id;
        this.orderTable = table;
        this.orderName = name;
        this.orderStatus = status;
        this.orderList = new HashMap<>();
    }
    
    /**
     *
     * @return Return client's order ID.
     */
    public int getOrderId() {
        return orderId;
    }
    
    public String getOrderName() {
        return this.orderName;
    }
    
    public void setOrderName(String newName) {
        this.orderName = newName;
    }
    

    public int getOrderTable() {
        return orderTable;
    }
    
    public void setOrderTable(int newTable) {
        this.orderTable = newTable;
    }
    
    /**
     *
     * @return Return status of the order.
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
    
    public HashMap getOrderList(){
        return this.orderList;
    }
    
    public void addToOrder(MenuItem newItem, int quantity){
        this.orderList.putIfAbsent(newItem, quantity);
    }
    
    public void removeFromOrder(MenuItem itemToRemove){
        this.orderList.remove(itemToRemove);
    }
    
    public void setOrderStatus(OrderStatus newStatus) {
        this.orderStatus = newStatus;
    }
    
    
    @Override
    public String toString() {
        return "ClientOrder{name='" + this.orderName + "', id='" + 
                this.orderId + "', tabel='" + this.orderTable + 
                "', status='" + this.orderStatus  + "'}"; 
    }
    
}
