/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author MyPC
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Table;

public class TableDAO extends DAO {

    public TableDAO() {
        super();
    }
    
    public ArrayList<Table> searchTable(int key, Date intime, Date outtime){
        ArrayList<Table> result = new ArrayList<Table>();
        String sql = "(SELECT tb.id FROM oderedtable AS ot INNER JOIN tble AS tb ON ot.id_tbl = tb.id" +
                        "INNER JOIN bill AS b ON ot.id_bill = b.id WHERE b.oder_time between \"?\"" +
                        "and \"?\") AND t.maxGuest >= ?";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sdf.format(intime));
			ps.setString(2, sdf.format(outtime));
			ps.setString(3, sdf.format(key));
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Table t = new Table();
				t.setId(rs.getInt("id"));
				t.setTblname(rs.getString("name"));
				t.setMaxGuest(rs.getInt("max"));
				t.setDescrip(rs.getString("des"));
				result.add(t);
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
    }
    
}
