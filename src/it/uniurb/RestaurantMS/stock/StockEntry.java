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
    private LocalDate stockEntryExpireDate;
    private Double stockEntryQuantity;
    private final Ingredient entryIngredient;
    private String entryName;
    
    /**
     *
     * @param id
     * @param name
     * @param expireDate
     */
    
    StockEntry(int id, LocalDate expireDate, Double quantity, Ingredient ingr, String name) {
        this.stockEntryId = id;
        this.stockEntryExpireDate = expireDate;
        this.stockEntryQuantity = quantity;
        this.entryIngredient = ingr;
        this.entryName = name;
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
    public void setStockEntryQuantity(Double newQuantity) {
        this.stockEntryQuantity = newQuantity;
    }
    
    public String getStockEntryName() {
        return this.entryName;
    }
    
    public void setStockEntryName(String name) {
        this.entryName = name;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "StockEntry{ID='" + stockEntryId + "', Quantity='"
                + stockEntryQuantity + "'";
    }
    
}
