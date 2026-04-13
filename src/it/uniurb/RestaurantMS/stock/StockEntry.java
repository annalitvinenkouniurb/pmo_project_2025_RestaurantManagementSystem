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
    private LocalDate stockEntryExpiryDate;
    private Double stockEntryQuantity;
    private final Ingredient entryIngredient;
    private String entryName;
    
    /**
     * Constructor.
     * @param id Stock entry ID.
     * @param name Stock entry name.
     * @param expiryDate Stock entry expiry date.
     * @param quantity Stock entry quantity.
     * @param ingr Stock entry ingredient.
     * @param name Stock entry name.
     */
    StockEntry(int id, LocalDate expiryDate, Double quantity, Ingredient ingr, String name) {
        this.stockEntryId = id;
        this.stockEntryExpiryDate = expiryDate;
        this.stockEntryQuantity = quantity;
        this.entryIngredient = ingr;
        this.entryName = name;
    }
    
    /**
     * Method to get stock entry ID.
     * @return Return stock entry ID.
     */
    public int getStockEntryId() {
        return this.stockEntryId;
    }
    
    
    /**
     * Method to get stock entry expiry date.
     * @return Return expiry date.
     */
    public LocalDate getStockEntryExpiryDate() {
        return this.stockEntryExpiryDate;
    }
    
    /**
     * Method to set stock entry expiry date.
     * @param date Expiry date to set.
     */
    public void setStockEntryExpiryDate(LocalDate date) {
        this.stockEntryExpiryDate = date;
    }
    
    /**
     * Method to get stock entry quantity.
     * @return Return stock entry quantity.
     */
    public Double getStockEntryQuantity() {
        return this.stockEntryQuantity;
    }
    
    /**
     * Method to set stock entry quantity.
     * @param newQuantity New stock entry quantity to set.
     */
    public void setStockEntryQuantity(Double newQuantity) {
        this.stockEntryQuantity = newQuantity;
    }
    
    /**
     * Method to get stock entry name.
     * @return Return stock entry name.
     */
    public String getStockEntryName() {
        return this.entryName;
    }
    
    /**
     * Method to set stock entry name.
     * @param name Stock entry name to set.
     */
    public void setStockEntryName(String name) {
        this.entryName = name;
    }
    
    /**
     * Method to get stock entry informations.
     * @return Return stock entry informations.
     */
    @Override
    public String toString() {
        return "StockEntry{ID='" + stockEntryId + "', Quantity='" + stockEntryQuantity + "'";
    }
    
}
