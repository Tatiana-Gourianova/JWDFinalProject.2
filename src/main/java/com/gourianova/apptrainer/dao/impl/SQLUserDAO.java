package com.gourianova.apptrainer.dao.impl;

import com.gourianova.apptrainer.bean.User;
import com.gourianova.apptrainer.bean.RegistrationInfo;
import com.gourianova.apptrainer.dao.DAOException;
import com.gourianova.apptrainer.dao.UserDAO;

public class SQLUserDAO implements UserDAO {

	static {
		MYSQLDriverLoader.getInstance();
	}
	
	@Override
	public User authorization(String login, String password) throws DAOException {

       System.out.println("USER AUTHORIZATION");
		
       return new User();
	}

	@Override
	public boolean registration(RegistrationInfo regInfo) {
		// TODO Auto-generated method stub
		return false;
	}

}
