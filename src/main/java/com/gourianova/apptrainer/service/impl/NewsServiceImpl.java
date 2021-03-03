package com.gourianova.apptrainer.service.impl;

import com.gourianova.apptrainer.dao.DAOProvider;
import com.gourianova.apptrainer.service.NewsService;
import com.gourianova.apptrainer.bean.News;
import com.gourianova.apptrainer.dao.DAOException;
import com.gourianova.apptrainer.dao.NewsDAO;
import com.gourianova.apptrainer.service.ServiceException;

import java.util.List;

public class NewsServiceImpl implements NewsService {

	@Override
	public List<News> takeAll() throws ServiceException {

		DAOProvider provider = DAOProvider.getInstance();
		NewsDAO newsDAO = provider.getNewsDAO();
		
		List<News> news;
		try {
			news = newsDAO.all();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return news;
	}
}
