package com.gourianova.apptrainer.service;

import com.gourianova.apptrainer.bean.News;

import java.util.List;

public interface NewsService {
	List<News> takeAll() throws ServiceException;
}
