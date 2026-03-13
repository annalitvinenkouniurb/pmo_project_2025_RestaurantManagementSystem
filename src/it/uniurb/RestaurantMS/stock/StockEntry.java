/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.stock;

import it.uniurb.RestaurantMS.ingredient.Ingredient;
import java.time.LocalDate;

/**
 *
 * @author lucapaolillo
 */
public class StockEntry {
    
    private final int stockEntryId;
    private String stockEntryName;
    private LocalDate stockEntryExpireDate;
    private Double stockEntryQuantity;
    private Ingredient ingr;
    
    /**
     *
     * @param id
     * @param name
     * @param expireDate
     */
    public StockEntry(int id, String name, LocalDate expireDate) {
        this.stockEntryId = id;
        this.stockEntryName = name;
        this.stockEntryExpireDate = expireDate;        
    }
    
    /**
     *
     * @return
     */
    public int getStockEntryId() {
        return this.stockEntryId;
    }
    
    /**
     *
     * @return
     */
    public String getStockEntryName() {
        return this.stockEntryName;
    }
    
    /**
     *
     * @param name
     */
    public void setStockEntrytName(String name) {
        this.stockEntryName = name;
    }
    
    /**
     *
     * @return
     */
    public LocalDate getStockEntryExpireDate() {
        return this.stockEntryExpireDate;
    }
    
    /**
     *
     * @param date
     */
    public void setStockEntryExpireDate(LocalDate date) {
        this.stockEntryExpireDate = date;
    }
    
    /**
     *
     * @return
     */
    public Double getStockEntryQuantity() {
        return this.stockEntryQuantity;
    }
    
    /**
     *
     * @param newQuantity
     */
    public void updateStockEntryQuantity(Double newQuantity) {
        this.stockEntryQuantity = newQuantity;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "StockEntry{name='" + stockEntryName + "', ID='" + stockEntryId + "', Quantity='"
                + stockEntryQuantity + "'";
    }
    
}
