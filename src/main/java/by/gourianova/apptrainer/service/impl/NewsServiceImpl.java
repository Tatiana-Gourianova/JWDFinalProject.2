package by.gourianova.apptrainer.service.impl;

import by.gourianova.apptrainer.dao.DAOProvider;
import by.gourianova.apptrainer.service.NewsService;
import by.gourianova.apptrainer.bean.News;
import by.gourianova.apptrainer.dao.DAOException;
import by.gourianova.apptrainer.dao.NewsDAO;
import by.gourianova.apptrainer.service.ServiceException;

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
