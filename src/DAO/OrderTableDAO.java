/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import model.Bill;
import model.Customer;
import model.Odered_table;
import model.Table;
import model.User;

/**
 *
 * @author MyPC
 */
public class OrderTableDAO extends DAO{
    
    private Bill b;
    private Odered_table ot;

    public OrderTableDAO() {
        super();
    }
    
    public boolean addBill(User user,Table tbl, Customer cus, Date odtime){
        b = new Bill();
        ot = new Odered_table();
        String sqlAddBill = "INSERT INTO bill (oder_time, guest_num, id_cus, id_user) VALUES (?, ?, ?, ?)";
        String sqlOrderRoom = "INSERT INTO oderedtable (price, checkin, id_tbl, id_bill) VALUES ( 200, 0, ?, ?)";
        String sqlcheckOrderRoom = "SELECT * FROM oderedtable AS ot INNER JOIN bill AS b ON ot.id_bill = b.id WHERE b.oder_time >= ? AND b.oder_time <= ? AND ot.id_tbl = ?";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //khoang thoi gian dat ban
        Calendar cal = Calendar.getInstance();
        cal.setTime(odtime);
        cal.add(Calendar.HOUR, -1);
        cal.add(Calendar.MINUTE, -30);
        Date intime = cal.getTime();
        cal.add(Calendar.HOUR, 3);
        Date outtime = cal.getTime();
      
        try{
            PreparedStatement ps = con.prepareStatement(sqlcheckOrderRoom);
            ps.setString(1, sdf.format(intime));
            ps.setString(2, sdf.format(outtime));
            ps.setString(3, tbl.getId()+"");
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return false;
            } else {
                ps = con.prepareStatement(sqlAddBill, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, sdf.format(odtime));
                ps.setString(2, tbl.getMaxGuest()+"");
                ps.setString(3, cus.getId()+"");
                ps.setString(4, user.getId()+"");
                
                ps.executeUpdate();	
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if(generatedKeys.next()){
                    b.setId(generatedKeys.getInt(1));                    
                }
                
                ps = con.prepareStatement(sqlOrderRoom,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, tbl.getId());
                ps.setInt(2, b.getId());
                
                ps.executeUpdate();	
                ResultSet generatedKeys2 = ps.getGeneratedKeys();
                if(generatedKeys2.next()){
                    ot.setId(generatedKeys2.getInt(1));                    
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
}
