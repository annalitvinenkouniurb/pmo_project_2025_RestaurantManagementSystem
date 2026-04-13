/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.user;

/**
 *
 * @author lucapaolillo
 */
public class User {
    private int userId;
    private String userName;
    private String userPassword;
    
    /**
     * 
     * @param id User ID.
     * @param name Username.
     * @param password Password for the user account.
     */
    User(int id, String name, String password) {
        this.userId = id;
        this.userName = name;
        this.userPassword = password;
    }
    
    /**
     * Method to return user ID.
     * @return Return the user ID.
     */
    public int getId() {
        return this.userId;
    }
    
    /**
     * Method to return username.
     * @return Return username.
     */
    public String getUserName() {
        return this.userName;
    }
    
    /**
     * Method to set new username.
     * @param newUserName New username to set.
     */
    public void setUserName(String newUserName) {
        this.userName = newUserName;
    }
    
    /**
     * Method to get user informations.
     * @return Return some user informations.
     */
    @Override
    public String toString() {
        return "Name: " + this.userName + " ID: " + this.userId;
    }
}
