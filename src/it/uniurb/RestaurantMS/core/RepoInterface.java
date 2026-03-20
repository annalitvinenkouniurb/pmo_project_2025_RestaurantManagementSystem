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
     *Return a random Id.
     * @return Id
     */
    public int generateItemId();
    
    /**
     *
     * @return Return 1 if an element is successfully removed and 0 otherwise.
     */
    public boolean removeItem(X itemToRemove);
    
    /**
     *
     * Set the name chosen.
     * @param name Name to set.
     */
    
    /* ???  
*/ 
    public boolean updateItemName(X itemToUpdate, String name);
    
    public Collection<X> getContents();
    
}
