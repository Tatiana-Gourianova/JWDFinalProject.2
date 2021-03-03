package com.gourianova.apptrainer.service.impl;

import com.gourianova.apptrainer.bean.RegistrationInfo;
import com.gourianova.apptrainer.bean.User;
import com.gourianova.apptrainer.dao.DAOProvider;
import com.gourianova.apptrainer.service.ServiceException;
import com.gourianova.apptrainer.dao.DAOException;
import com.gourianova.apptrainer.dao.UserDAO;
import com.gourianova.apptrainer.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Override
	public User authorization(String login, String password) throws ServiceException {
		// validation
		if(login == null || "".equals(login) ) {// to bo cont....
			throw new ServiceException("wrong login or password");
		}
		
		DAOProvider provider = DAOProvider.getInstance();
        UserDAO userDAO = provider.getUserdao();
        
		User user = null;
		try {
			user = userDAO.authorization(login, password);
		}catch(DAOException e) {
			throw new ServiceException("error message", e);
		}
		return user;
	}

	@Override
	public boolean registration(RegistrationInfo regInfo) {
		// TODO Auto-generated method stub
		return false;
	}

}
