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

public class Table implements Serializable{
    private int id;
    private String tblname;
    private int maxGuest;
    private String descrip;

    public Table() {
        super();
    }
    
    public Table(int id, String tblname, int maxGuest, String descrip) {
        this.id = id;
        this.tblname = tblname;
        this.maxGuest = maxGuest;
        this.descrip = descrip;
    }

    public int getId() {
        return id;
    }

    public String getTblname() {
        return tblname;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTblname(String tblname) {
        this.tblname = tblname;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }    
    
}
