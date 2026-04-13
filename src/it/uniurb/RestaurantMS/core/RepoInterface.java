/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package it.uniurb.RestaurantMS.core;

import java.util.Collection;

/**
 *
 * @author lucapaolillo
 */
public interface RepoInterface<X> {
    
    /**
     * Method to get random ID.
     * @return Id
     */
    public int generateItemId();
    
    /**
     * Method to remove item.
     * @param itemToRemove Item that has to be removed.
     * @return Return 1 if an element is successfully removed and 0 otherwise.
     */
    public boolean removeItem(X itemToRemove);
    
    /**
     * Methodo to update item name.
     * @param itemToUpdate Item that name has to be updated.
     * @param name New name to set.
     * @return Return true if it has been correctly updated.
     */
    public boolean updateItemName(X itemToUpdate, String name);
    
    /**
     * Method to get the contents of specific colletion.
     * @return Return the contents of collection.
     */
    public Collection<X> getContents();
    
}
