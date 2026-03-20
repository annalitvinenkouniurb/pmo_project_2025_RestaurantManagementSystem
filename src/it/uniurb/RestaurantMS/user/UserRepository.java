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
    
    public UserRepository() {
        this.userList = new LinkedHashSet<>();
    }
        
    public void setUserPassword(String newPassword) {
        this.password = newPassword;
    }

    
    @Override
    public int generateItemId() {
        if(this.userList.isEmpty()){
            return 1;
        }
        else{
            int id = this.userList.getLast().getId();
            return id + 1;
        }
    }

    
    public boolean addItem(String name, String password) {
        boolean added = false;
        User newUser = new User(this.generateItemId(), name, password);        
        if(!userList.contains(newUser)) {
            userList.addLast(newUser);
            added = true;
        }
        return added;
    }

    @Override
    public boolean removeItem(User userToRemove) {
        boolean removed = false;
        if(this.userList.contains(userToRemove)) {
            this.userList.remove(userToRemove);
            removed = true;
        }
        return removed;
            
           
    }

    @Override
    public boolean updateItemName(User userToUpdate, String newUserName) {
        boolean updated = false;
        if(userList.contains(userToUpdate)) {
            userToUpdate.setUserName(newUserName);
            updated = true;
        }
        return updated;
        
    }

    @Override
    public String toString() {
        return "UserName: " + this.username;
    }

    @Override
    public LinkedHashSet<User> getContents() {
        return this.userList;
    }
    
}
