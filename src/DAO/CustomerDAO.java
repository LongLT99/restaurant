/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.customer;

/**
 *
 * @author MyPC
 */
public class CustomerDAO extends DAO{

    public CustomerDAO() {
        super();
    }
    
    public ArrayList<customer> searchCustomer(String name){
        ArrayList<customer> result = new ArrayList<customer>();
		String sql = "SELECT * FROM customer WHERE cus_name LIKE ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" + name + "%");
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				customer cus = new customer();
				cus.setId(rs.getInt("id"));
				cus.setCus_name(rs.getString("cus_name"));
				cus.setAddress(rs.getString("address"));
				cus.setTel_number(rs.getString("tel_number"));
				cus.setEmail(rs.getString("email"));
				result.add(cus);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
    }
    
    public boolean addCustomer(customer cus) throws SQLException{
        String sql = "INSERT INTO customer (cus_name, address, email, tel_number) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cus.getCus_name());
            ps.setString(2, cus.getAddress());
            ps.setString(3, cus.getEmail());
            ps.setString(4, cus.getTel_number());
            
            ps.executeUpdate();
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if(generatedKeys.next()){
                cus.setId(generatedKeys.getInt(1));
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
}
