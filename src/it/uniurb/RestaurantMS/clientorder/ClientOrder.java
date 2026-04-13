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
     * @param id Client order ID.
     * @param name Client order name.
     * @param table Client order table.
     * @param status Client order status.
     */
    ClientOrder(int id, String name, int table, OrderStatus status) {
        this.orderId = id;
        this.orderTable = table;
        this.orderName = name;
        this.orderStatus = status;
        this.orderList = new HashMap<>();
    }
    
    /**
     * Method to get order ID.
     * @return Return client's order ID.
     */
    public int getOrderId() {
        return orderId;
    }
    
    /**
     * Method to get client order name.
     * @return Return client order name.
     */
    public String getOrderName() {
        return this.orderName;
    }
    
    /**
     * Method to set client order name.
     * @param newName New client order name to set.
     */
    public void setOrderName(String newName) {
        this.orderName = newName;
    }
    
    /**
     * Method to get client order table.
     * @return Return client order table.
     */
    public int getOrderTable() {
        return orderTable;
    }
    
    /**
     * Method to set client order table.
     * @param newTable New client order table to set.
     */
    public void setOrderTable(int newTable) {
        this.orderTable = newTable;
    }
    
    /**
     * Method to get client order status.
     * @return Return status of the order.
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
    
    /**
     * Method to get client order list.
     * @return Return client order list.
     */
    public HashMap getOrderList(){
        return this.orderList;
    }
    
    /**
     * Method to add new item to the client order list.
     * @param newItem New item to add.
     * @param quantity Item quantity.
     */
    public void addToOrder(MenuItem newItem, int quantity){
        this.orderList.putIfAbsent(newItem, quantity);
    }
    
    /**
     * Method to remove item from the client order list.
     * @param itemToRemove 
     */
    public void removeFromOrder(MenuItem itemToRemove){
        this.orderList.remove(itemToRemove);
    }
    
    /**
     * Method to set new client order status.
     * @param newStatus New client order status to set.
     */
    public void setOrderStatus(OrderStatus newStatus) {
        this.orderStatus = newStatus;
    }
    
    /**
     * Method to get client order informations.
     * @return Return client order informations.
     */
    @Override
    public String toString() {
        return "ClientOrder {name='" + this.orderName + "', id='" + 
                this.orderId + "', tabel='" + this.orderTable + 
                "', status='" + this.orderStatus  + "'}"; 
    }
    
}
