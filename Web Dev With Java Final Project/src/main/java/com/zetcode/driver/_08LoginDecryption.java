package com.zetcode.driver;

import java.sql.Statement;
import java.util.List;

import com.citytech.basicsecurity.SimpleEncryption;
import com.jbbwebsolutions.utility.ESQL;
import com.jbbwebsolutions.utility.SQLExecutable;
import com.jbbwebsolutions.utility.SQLUtility;
import com.zetcode.bean.Car;
import com.zetcode.bean.City;
import com.zetcode.bean.Group;
import com.zetcode.bean.User;

import static com.zetcode.util.GLOBAL.DB_URL;

public class _08LoginDecryption {

	public static void main(String[] args) {
		
		
		String userId = "user-101";
		String password = "password1235";
		boolean isInDB;
		
		isInDB = findAll(userId, password);
		
		System.out.println(isInDB);

	}
	
	public static boolean findAll(String userId, String password) {
		
		String encryptedInput = SimpleEncryption.encrypt(password);
		
		boolean status;
	
		String sql = "SELECT * FROM APP.USERIDANDENCRYPTEDPASSWORD";
		
		SQLExecutable<User> executable = rs -> {
			
			String user = rs.getString("USERID");
			String encryptedPassword = rs.getString("ENCRYPTEDPASSWORD");
			
			return new User(user, encryptedPassword);
		};			
			 
		List<User> user = SQLUtility.execute(sql, DB_URL, ESQL.CONNECTION, executable);
		
		
		for (User item : user) {
			if (item.getPassword().contentEquals(encryptedInput)) {
				return true;
			}
		}
		
		return false;
	}
	

}
