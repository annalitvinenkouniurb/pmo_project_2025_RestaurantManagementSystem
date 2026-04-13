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
     * Constructor.
     * @param name Name of the dish.
     * @param price Price of the dish.
     * @param dishType Type of the dish.
     */
    MenuItem(String name, double price, MenuItemType itemType, MenuItemInterface itemContents) {
        this.menuItemName = name;
        this.menuItemPrice = price;
        this.menuItemType = itemType;
        this.menuItemContents = itemContents;
    }
    
    /**
     * Method to get menu item name.
     * @return Return the menu item name.
     */
    public String getMenuItemName() {
        return this.menuItemName;
    }
    
    /**
     * Method to set new name to the menu item.
     * @param newName new name to set.
     */
    public void setMenuItemName(String newName) {
        this.menuItemName = newName;
    }
    
    /**
     * Method to get menu item price.
     * @return Return menu item price.
     */
    public double getMenuItemPrice() {
        return this.menuItemPrice;
    }
    
    /**
     * Method to set menu item price.
     * @param newPrice New price to set.
     */
    public void setMenuItemPrice(Double newPrice) {
        this.menuItemPrice = newPrice;
    }
    
    /**
     * Method to get menu item type.
     * @return Return menu item type.
     */
    public MenuItemType getMenuItemType() {
        return this.menuItemType;
    }
    
    /**
     * Method to set menu item type.
     * @param newType New type to set.
     */
    public void setMenuItemType(MenuItemType newType) {
        this.menuItemType = newType;
    }

    /**
     * Menu to get menu item contents.
     * @return Return menu item contents.
     */
    public MenuItemInterface getMenuItemContents(){
        return this.menuItemContents;
    }
    
    /**
     * Method to set menu item contents.
     * @param newContents New menu item contents to set.
     */
    public void setMenuItemContents(MenuItemInterface newContents){
        this.menuItemContents = newContents;
    }
        
    /**
     * Method to get menu item informations.
     * @return Return menu item informations.
     */
    @Override
    public String toString() {
        return "MenuItem{name='" + this.menuItemName + "', price='" + 
                this.menuItemPrice + "', type='" + this.menuItemType + "'}"; 
    }
    
}
