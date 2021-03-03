package com.gourianova.apptrainer.dao;

import com.gourianova.apptrainer.bean.News;

import java.util.List;

public interface NewsDAO {
	
	List<News> all()  throws DAOException;

}
