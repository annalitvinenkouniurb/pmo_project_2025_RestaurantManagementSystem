/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.uniurb.RestaurantMS;

import it.uniurb.RestaurantMS.model.*;
import it.uniurb.RestaurantMS.repository.*;

/**
 *
 * @author lucapaolillo
 */
public class RestaurantMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IngredientRepository ingRepo = new IngredientRepository();
        StockOrderRepository orderRepo = new StockOrderRepository();
        StockOrder order1 = new StockOrder(orderRepo.generateItemId(), "Order N. 1");
        StockOrder order2 = new StockOrder(orderRepo.generateItemId(), "Order N. 2");
        
        Ingredient ingredient1 = new Ingredient(ingRepo.generateItemId(), "Cipolla", "Kg", 2.0, 10);        
        ingRepo.addItem(ingredient1);
        
        Ingredient ingredient2 = new Ingredient(ingRepo.generateItemId(), "Latte", "Lt", 1.35, 10);        
        ingRepo.addItem(ingredient2);
        
        Ingredient ingredient3 = new Ingredient(ingRepo.generateItemId(), "Burro", "Kg", 3.7, 1.5);
        ingRepo.addItem(ingredient3);
        
        order1.addIngredientToOrder(ingredient1, 10);
        order1.addIngredientToOrder(ingredient3, 30);
        order1.addIngredientToOrder(ingredient2, 20);
        
        order1.printContents();
        System.out.println("");
        order1.removeIngredientFromOrder(ingredient3);
        order1.printContents();
        System.out.println("");
        
        
        //order2.printContents();
        //orderRepo.addItem(order1);        
        //orderRepo.addItem(order2);
        
        //orderRepo.printContents();
        
        
        
    }
    
}
