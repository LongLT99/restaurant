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
public class Odered_table implements Serializable{
    private int id;
    private float price;
    private float discount;
    private boolean checkin;

    public Odered_table() {
        super();
    }

    public Odered_table(int id, float price, float discount, boolean checkin) {
        super();
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.checkin = checkin;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public float getDiscount() {
        return discount;
    }

    public boolean isCheckin() {
        return checkin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void setCheckin(boolean checkin) {
        this.checkin = checkin;
    }
    
}
