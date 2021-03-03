package by.gourianova.apptrainer.service;

import by.gourianova.apptrainer.bean.RegistrationInfo;
import by.gourianova.apptrainer.bean.User;

public interface UserService {
	User authorization(String login, String passport) throws ServiceException;
	boolean registration(RegistrationInfo regInfo) throws ServiceException;
}
