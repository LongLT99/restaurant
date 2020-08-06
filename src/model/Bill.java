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
import java.util.*;
public class Bill implements Serializable {
    private int id;
    private Date order_time;
    private int guest_num;
    private Date checkout_time;
    private float discount;
    private String note;

    public Bill() {
        super();
    }

    public Bill(int id, Date order_time, int guest_num, Date checkout_time, float discount, String note) {
        super();
        this.id = id;
        this.order_time = order_time;
        this.guest_num = guest_num;
        this.checkout_time = checkout_time;
        this.discount = discount;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public int getGuest_num() {
        return guest_num;
    }

    public Date getCheckout_time() {
        return checkout_time;
    }

    public float getDiscount() {
        return discount;
    }

    public String getNote() {
        return note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public void setGuest_num(int guest_num) {
        this.guest_num = guest_num;
    }

    public void setCheckout_time(Date checkout_time) {
        this.checkout_time = checkout_time;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void setNote(String note) {
        this.note = note;
    }   
    
}
