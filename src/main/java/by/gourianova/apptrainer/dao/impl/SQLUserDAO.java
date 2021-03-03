package by.gourianova.apptrainer.dao.impl;

import by.gourianova.apptrainer.bean.User;
import by.gourianova.apptrainer.bean.RegistrationInfo;
import by.gourianova.apptrainer.dao.DAOException;
import by.gourianova.apptrainer.dao.UserDAO;

public class SQLUserDAO implements UserDAO{

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
