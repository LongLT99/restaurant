/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MyPC
 */
import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String Staff_name;
    private String username;
    private String pass;
    private String position;
    
    public User() {
        super();
    }
    
    public User(int id, String Staff_name, String username, String pass, String position){
        super();
        this.id = id;
        this.Staff_name = Staff_name;
        this.username = username;
        this.pass = pass;
        this.position = position;
    }
    
    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }
    
    public String getStaff_name() {
        return Staff_name;
    }
    
    public void setStaff_name(String Staff_name){
        this.Staff_name = Staff_name;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }
    
    public String getPass() {
        return pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position ) {
        this.position = position;
    }
    
}