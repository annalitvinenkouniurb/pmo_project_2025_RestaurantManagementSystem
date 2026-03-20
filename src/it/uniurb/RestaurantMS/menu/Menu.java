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

    
    Menu(int id, String name) {
        this.menuId = id;
        this.menuName = name;
        this.menuItemList = new LinkedHashSet<>();
    }
    
        
    public int getMenuId() {
        return menuId;
    }
    
       
    public String getMenuName() {
        return this.menuName;
        
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void addToMenu(MenuItem itemToAdd){
        this.menuItemList.addLast(itemToAdd);
        
    }
    
    public void removeFromMenu(MenuItem itemToRemove){
        this.menuItemList.remove(itemToRemove);
    }
    
    @Override
    public String toString() {
        return "Menu{name='" + this.menuName + "', Id='" + this.menuId + "'}"; 
    } 
    
}
