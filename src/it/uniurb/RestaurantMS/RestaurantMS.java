/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.uniurb.RestaurantMS;

import it.uniurb.RestaurantMS.clientorder.ClientOrder;
import it.uniurb.RestaurantMS.clientorder.OrderStatus;
import it.uniurb.RestaurantMS.ingredient.IngredientRepository;
import it.uniurb.RestaurantMS.ingredient.IngredientUnit;
import it.uniurb.RestaurantMS.menu.Menu;
import it.uniurb.RestaurantMS.menu.MenuItem;
import it.uniurb.RestaurantMS.menu.MenuItemType;
/**
 *
 * @author lucapaolillo
 */
public class RestaurantMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IngredientRepository iR = new IngredientRepository();
        iR.addItem("Pomodoro", IngredientUnit.KG, 12.3);
        iR.addItem("Luca Paolillo", IngredientUnit.KG, 80);
        iR.addItem("Cipolla", IngredientUnit.PCS, 10);
        iR.addItem("Pomodoro rosso", IngredientUnit.KG, 1);

        System.out.println(iR.getContents());
        System.out.println("");

        System.out.println(iR.searchItemByName("pomodoro"));

        iR.removeItem("Pomodoro");
        System.out.println("");
        System.out.println(iR.getContents());
        

        
        /*
        order1.printContents();
        System.out.println("");
        order2.printContents();
        System.out.println("");
        */
        
        
        
        
    }
    
}
