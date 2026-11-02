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
     * Method to generate item ID.
     * @return Id
     */
    public int generateItemId();

    /**
     * Create new item.
     * @param NewItemId Id od the new item to be crated.
     * @return Returns the new item.
     */
    public X addItem(int NewItemId);
    
    /**
     * Method to remove item.
     * @param itemToRemove Item that has to be removed.
     * @return Return 1 if an element is successfully removed and 0 otherwise.
     */
    public boolean removeItem(X itemToRemove);
    
    /**
     * Method to get the contents of specific colletion.
     * @return Return the contents of collection.
     */
    public Collection<X> getContents();

    public Object searchItemByName(String name);
    
}
