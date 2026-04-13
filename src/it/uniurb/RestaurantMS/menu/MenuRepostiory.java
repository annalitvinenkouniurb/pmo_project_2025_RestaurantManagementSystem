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
    
    /**
     * Constructor.
     */
    public MenuRepostiory() {
        this.menuList = new LinkedHashSet<>();
    }

    /**
     * Method to generate menu repository ID.
     * @return Return menu repository ID.
     */
    @Override
    public int generateItemId() {
        if(this.menuList.isEmpty()){
            return 1;
        }
        else {
            int id = this.menuList.getLast().getMenuId();
            return id + 1;
        }
    }

    /**
     * Method to add menu repository.
     * @param name Menu repository name.
     * @return Return true if it has been correctly added.
     */
    public boolean addItem(String name) {
        boolean added = false;
        Menu menuToAdd = new Menu(this.generateItemId(), name);
        
        if(!menuList.contains(menuToAdd)) {
            menuList.addLast(menuToAdd);
            added = true;
        }
        return added;
    }
    
    /**
     * Method to remove menu repository.
     * @param menuToRemove Menu repository to remove.
     * @return Return true if it has been correctly removed.
     */
    @Override
    public boolean removeItem(Menu menuToRemove) {
        boolean removed = false;
        if(menuList.contains(menuToRemove)) {
            menuList.remove(menuToRemove);
            removed = true;
        }
        return removed;
    }

    /**
     * Method to update menu repository name.
     * @param menuToUpdate Menu repository to update.
     * @param newName New menu repository name.
     * @return Return true if it has been correctly updated.
     */
    @Override
    public boolean updateItemName(Menu menuToUpdate, String newName) {
        boolean updated = false;
        
        if(menuList.contains(menuToUpdate)) {
            menuToUpdate.setMenuName(newName);
            updated = true;
        }
        return updated;
    }

    /**
     * Method to get menu list.
     * @return Return menu list.
     */
    @Override
    public LinkedHashSet<Menu> getContents() {
        return this.menuList;
    }
    
}
