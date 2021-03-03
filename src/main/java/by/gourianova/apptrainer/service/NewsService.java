package by.gourianova.apptrainer.service;

import by.gourianova.apptrainer.bean.News;

import java.util.List;

public interface NewsService {
	List<News> takeAll() throws ServiceException;
}
