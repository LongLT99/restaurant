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
public class customer implements  Serializable{
    private int id;
    private String cus_name;
    private String address;
    private String email;
    private String tel_number;

    public customer() {
        super();
    }
    
    public customer(int id, String cus_name, String address, String email, String tel_number){
        super();
        this.id = id;
        this.cus_name = cus_name;
        this.address = address;
        this.email = email;
        this.tel_number = tel_number;
    }

    public int getId() {
        return id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getTel_number() {
        return tel_number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel_number(String tel_number) {
        this.tel_number = tel_number;
    }
    
}
