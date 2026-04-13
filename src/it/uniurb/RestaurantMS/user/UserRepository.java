/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.user;

import it.uniurb.RestaurantMS.user.User;
import it.uniurb.RestaurantMS.core.RepoInterface;
import java.util.Collection;
import java.util.LinkedHashSet;

/**
 *
 * @author lucapaolillo
 */
public class UserRepository implements RepoInterface<User> {
    private LinkedHashSet<User> userList;
    private String username;
    private String password;
    
    /**
     *
     * Constructor.
    */
    public UserRepository() {
        this.userList = new LinkedHashSet<>();
    }
        
    /**
     * Method to set user password.
     * @param newPassword The user password to set.
     */
    public void setUserPassword(String newPassword) {
        this.password = newPassword;
    }

    /**
     * Method to generate user ID.
     * @return Return the ID generated for user.
     */
    @Override
    public int generateItemId() {
        if(this.userList.isEmpty()){
            return 1;
        }
        else {
            int id = this.userList.getLast().getId();
            return id + 1;
        }
    }

    /**
     * Method to add user to the user repository.
     * @param name Name of the new user.
     * @param password Password to set for the new user.
     * @return Return true if the user had benn added correctly.
     */
    public boolean addItem(String name, String password) {
        boolean added = false;
        User newUser = new User(this.generateItemId(), name, password);        
        if(!userList.contains(newUser)) {
            userList.addLast(newUser);
            added = true;
        }
        return added;
    }

    /**
     * Method to remove user from the user repository.
     * @param userToRemove User to remove from the list.
     * @return Return true if it has been correctly removed.
     */
    @Override
    public boolean removeItem(User userToRemove) {
        boolean removed = false;
        if(this.userList.contains(userToRemove)) {
            this.userList.remove(userToRemove);
            removed = true;
        }
        return removed;      
    }

    /**
     * Method to update user's username.
     * @param userToUpdate User to update.
     * @param newUserName New username to set.
     * @return Return true if it has been correctly updated.
     */
    @Override
    public boolean updateItemName(User userToUpdate, String newUserName) {
        boolean updated = false;
        if(userList.contains(userToUpdate)) {
            userToUpdate.setUserName(newUserName);
            updated = true;
        }
        return updated;
    }

    /**
     * Method to get some user informations.
     * @return Return user informations.
     */
    @Override
    public String toString() {
        return "UserName: " + this.username;
    }

    /**
     * Method to get user list.
     * @return Return the user list.
     */
    @Override
    public LinkedHashSet<User> getContents() {
        return this.userList;
    }
    
}
