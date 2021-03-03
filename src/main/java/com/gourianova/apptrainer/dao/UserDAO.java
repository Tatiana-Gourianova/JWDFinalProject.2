package com.gourianova.apptrainer.dao;

import com.gourianova.apptrainer.bean.RegistrationInfo;
import com.gourianova.apptrainer.bean.User;

public interface UserDAO {
	
	User authorization (String login, String password) throws DAOException;
	boolean	registration(RegistrationInfo regInfo) throws DAOException;
	
}
