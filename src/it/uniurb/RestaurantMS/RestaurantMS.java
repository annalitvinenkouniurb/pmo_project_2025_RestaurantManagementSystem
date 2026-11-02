/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.uniurb.RestaurantMS;

import it.uniurb.RestaurantMS.clientorder.ClientOrder;
import it.uniurb.RestaurantMS.clientorder.OrderStatus;
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

        /* Menu item */
        /*
        MenuItem mI = new MenuItem("New Menu Item", 12.5, MenuItemType.STARTER, );
        */

        /* Client order statur: 0="New", 1="In progress", 2="Completed"
         */
        ClientOrder cO = new ClientOrder(123, "Test Order", 2, OrderStatus.NEW);
        System.out.println(cO.getOrderId());
        System.out.println(cO.getOrderName());
        System.out.println(cO.getOrderTable());
        System.out.println(cO.getOrderStatus());
        System.out.println(cO.getOrderList());
        System.out.println(cO.toString());
        


        /*
        order1.printContents();
        System.out.println("");
        order2.printContents();
        System.out.println("");
        */
        
        
        
        
    }
    
}
