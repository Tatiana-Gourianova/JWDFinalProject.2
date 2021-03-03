package by.gourianova.apptrainer.dao;

import by.gourianova.apptrainer.bean.News;

import java.util.List;

public interface NewsDAO {
	
	List<News> all()  throws DAOException;

}
