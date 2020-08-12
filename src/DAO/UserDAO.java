package DAO;

/**
 *
 * @author MyPC
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.User;

public class UserDAO extends DAO{

    public UserDAO() {
        super();
    }
    
    public boolean checkLogin(User user){
        boolean result = false;
        String sql = "SELECT id,staff_name,position FROM staff_user WHERE username = ? AND pass = ?";
        try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPass());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				user.setStaff_name(rs.getString("staff_name"));
				user.setPosition(rs.getString("position"));
                                user.setId(rs.getInt("id"));
				result = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
        
    }    
}
