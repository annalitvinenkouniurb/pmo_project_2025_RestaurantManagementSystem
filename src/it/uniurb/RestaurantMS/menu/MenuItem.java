/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.menu;

import it.uniurb.RestaurantMS.core.MenuItemInterface;

/*
 * This Class describes single menu entries.
 */
public class MenuItem {
    
    private String menuItemName;
    private double menuItemPrice;
    private MenuItemType menuItemType;
    private MenuItemInterface menuItemContents;
    
    /**
     *
     * @param name It is the name of the dish.
     * @param price It is the price of the dish.
     * @param dishType it is the type of the dish.
     */
    MenuItem(String name, double price, MenuItemType itemType, MenuItemInterface itemContents) {
        this.menuItemName = name;
        this.menuItemPrice = price;
        this.menuItemType = itemType;
        this.menuItemContents = itemContents;
    }
    
    /**
     *
     * @return Return the name of the dish.
     */
    public String getMenuItemName() {
        return this.menuItemName;
    }
    
    public void setMenuItemName(String newName) {
        this.menuItemName = newName;
    }
    
    /**
     *
     * @return Return the price of the dish.
     */
    public double getMenuItemPrice() {
        return this.menuItemPrice;
    }
    
    
    public void setMenuItemPrice(Double newPrice) {
        this.menuItemPrice = newPrice;
    }
    
    /**
     *
     * @return 
     */
    public MenuItemType getMenuItemType() {
        return this.menuItemType;
    }
    
    public void setMenuItemType(MenuItemType newType) {
        this.menuItemType = newType;
    }

    public MenuItemInterface getMenuItemContents(){
        return this.menuItemContents;
    }
    
    public void setMenuItemContents(MenuItemInterface newContents){
        this.menuItemContents = newContents;
    }
        
    @Override
    public String toString() {
        return "MenuItem{name='" + this.menuItemName + "', price='" + 
                this.menuItemPrice + "', type='" + this.menuItemType + "'}"; 
    }
    
}
