package com.zetcode.service;

import com.zetcode.persistence.LoginDAO;

public class LoginService {

	public static boolean login(String userId, String password) {
		
		LoginDAO loginDao = new LoginDAO();
		
		
		if (loginDao.isValidUser(userId, password)) {
			return true;
		}
		
		return false;
	}

}
