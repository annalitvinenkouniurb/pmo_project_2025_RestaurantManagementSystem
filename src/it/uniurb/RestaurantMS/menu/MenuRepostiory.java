/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.menu;

import it.uniurb.RestaurantMS.core.RepoInterface;
import java.util.LinkedHashSet;

/**
 *
 * @author nnltvnnk
 */
public class MenuRepostiory implements RepoInterface<Menu>{
    
    private final LinkedHashSet<Menu> menuList;
    
    
    public MenuRepostiory() {
        this.menuList = new LinkedHashSet<>();
    }

    @Override
    public int generateItemId() {
        if(this.menuList.isEmpty()){
            return 1;
        }
        else{
            int id = this.menuList.getLast().getMenuId();
            return id + 1;
        }
    }

    
    public boolean addItem(String name) {
        boolean added = false;
        Menu menuToAdd = new Menu(this.generateItemId(), name);
        
        if(!menuList.contains(menuToAdd)) {
            menuList.addLast(menuToAdd);
            added = true;
        }
        return added;
    }
    
    @Override
    public boolean removeItem(Menu menuToRemove) {
        boolean removed = false;
        if(menuList.contains(menuToRemove)) {
            menuList.remove(menuToRemove);
            removed = true;
        }
        return removed;
    }

    @Override
    public boolean updateItemName(Menu menuToUpdate, String newName) {
        boolean updated = false;
        if(menuList.contains(menuToUpdate)) {
            menuToUpdate.setMenuName(newName);
            updated = true;
        }
        return updated;
        
    }

    @Override
    public LinkedHashSet getContents() {
        return this.menuList;

    }
    
}
