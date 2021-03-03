package by.gourianova.apptrainer.dao;

import by.gourianova.apptrainer.bean.RegistrationInfo;
import by.gourianova.apptrainer.bean.User;

public interface UserDAO {
	
	User authorization (String login, String password) throws DAOException;
	boolean	registration(RegistrationInfo regInfo) throws DAOException;
	
}
