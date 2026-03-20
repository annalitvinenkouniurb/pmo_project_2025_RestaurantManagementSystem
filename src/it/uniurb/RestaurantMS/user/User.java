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
    
    User(int id, String name, String password) {
        this.userId = id;
        this.userName = name;
        this.userPassword = password;
    }
    
    public int getId() {
        return this.userId;
    }
    
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String newName) {
        this.userName = newName;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.userName + " ID: " + this.userId;
    }
}
