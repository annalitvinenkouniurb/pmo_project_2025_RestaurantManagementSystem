/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.menu;

import java.util.LinkedHashSet;

/**
 *
 * @author lucapaolillo
 */
public class Menu {
    private final int menuId;
    private String menuName;
    private LinkedHashSet<MenuItem> menuItemList;            

    /**
     * Constructor.
     * @param id Menu ID.
     * @param name Menu name.
     */
    Menu(int id, String name) {
        this.menuId = id;
        this.menuName = name;
        this.menuItemList = new LinkedHashSet<>();
    }
    
    /**
     * Method to get menu ID.
     * @return Return menu ID.
     */
    public int getMenuId() {
        return menuId;
    }
    
    /**
     * Method to get menu name.
     * @return Return menu name.
     */
    public String getMenuName() {
        return this.menuName;
    }

    /**
     * Method to set menu name.
     * @param menuName Menu name to set.
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * Method to add items to menu.
     * @param itemToAdd Item to add to menu.
     */
    public void addToMenu(MenuItem itemToAdd){
        this.menuItemList.addLast(itemToAdd);
    }
    
    /**
     * Method to remove items from the menu.
     * @param itemToRemove Item that has to be removed.
     */
    public void removeFromMenu(MenuItem itemToRemove){
        this.menuItemList.remove(itemToRemove);
    }
    
    /**
     * Method to get menu informations.
     * @return Return menu informations.
     */
    @Override
    public String toString() {
        return "Menu {name='" + this.menuName + "', Id='" + this.menuId + "'}"; 
    } 
    
}
