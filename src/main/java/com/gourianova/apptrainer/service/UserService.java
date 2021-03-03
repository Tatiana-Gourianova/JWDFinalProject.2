package com.gourianova.apptrainer.service;

import com.gourianova.apptrainer.bean.RegistrationInfo;
import com.gourianova.apptrainer.bean.User;

public interface UserService {
	User authorization(String login, String passport) throws ServiceException;
	boolean registration(RegistrationInfo regInfo) throws ServiceException;
}
