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

public class restaurant implements Serializable{
    private int id;
    private String res_name;
    private String res_address;
    private String descrip;

    public restaurant() {
    super();
    }
        
    public restaurant(int id, String res_name, String res_address, String descrip){
        super();
        this.id = id;
        this.res_name = res_name;
        this.res_address = res_address;
        this.descrip = descrip;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getRes_name() {
        return res_name;
    }
    
    public void setRes_name(String res_name) {
        this.res_name = res_name;
    }
    
    public String getRes_address() {
        return res_address;
    }
    
    public void setRes_address(String res_address) {
        this.res_address = res_address;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    
}
