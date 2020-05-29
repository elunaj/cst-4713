package com.zetcode.persistence;

import static com.zetcode.util.GLOBAL.DB_URL;

import java.util.List;

import com.citytech.basicsecurity.SimpleEncryption;
import com.jbbwebsolutions.dao.IQuery;
import com.jbbwebsolutions.utility.ESQL;
import com.jbbwebsolutions.utility.SQLExecutable;
import com.jbbwebsolutions.utility.SQLUtility;
import com.zetcode.bean.User;

public class LoginDAO implements IQuery<User> {

	public boolean isValidUser(String userId, String password) {
		
	String encryptedInput = SimpleEncryption.encrypt(password);
		
		String sql = "SELECT * FROM APP.USERIDANDENCRYPTEDPASSWORD";
		
		SQLExecutable<User> executable = rs -> {
			
			String user = rs.getString("USERID");
			String encryptedPassword = rs.getString("ENCRYPTEDPASSWORD");
			
			return new User(user, encryptedPassword);
		};			
			 
		List<User> user = SQLUtility.execute(sql, DB_URL, ESQL.CONNECTION, executable);
		
		
		for (User item : user) {
			if (item.getPassword().contentEquals(encryptedInput)
					&& item.getUserId().contentEquals(userId)) {
				return true;
			}
		}
		
		return false;
	}
			

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
