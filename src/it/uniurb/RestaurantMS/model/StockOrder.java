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
public class StockOrder {
    private final int stockOrderID;
    private String stockOrderName;
    private HashMap<Ingredient, Integer> orderList;
    
    public StockOrder(int id, String name){
        this.orderList = new HashMap<Ingredient, Integer>();
        this.stockOrderID = id;
        this.stockOrderName = name;
    }
    
    public void addIngredientToOrder(Ingredient ingr, int quantity){
        this.orderList.putIfAbsent(ingr, quantity);
    }
    
    public void removeIngredientFromOrder(Ingredient ingr){
        this.orderList.remove(ingr);
    }
    
    public int getOrderID(){
        return this.stockOrderID;
    }
    public String getOrderName(){
        return this.stockOrderName;
    }
    public void setOrderName(String name){
        this.stockOrderName = name;
    }
    public void printContents(){
        System.out.println(this.orderList);
    }
    @Override
    public String toString() {
        return "StockOrder{name='" + this.stockOrderName + "', ID='" + this.stockOrderID + "'}"; 
    } 
}
