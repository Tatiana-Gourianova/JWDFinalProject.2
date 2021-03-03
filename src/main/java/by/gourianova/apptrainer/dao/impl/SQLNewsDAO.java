package by.gourianova.apptrainer.dao.impl;

import by.gourianova.apptrainer.dao.NewsDAO;
import by.gourianova.apptrainer.bean.News;
import by.gourianova.apptrainer.dao.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLNewsDAO implements NewsDAO {

	static {
		MYSQLDriverLoader.getInstance();
	}

	@Override
	public List<News> all() throws DAOException {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		List<News> news = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/news_management?useSSL=false&serverTimezone=UTC",
					"root", "778899");
			
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM news");
			
			news = new ArrayList<News>();
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String brief = rs.getString("brief");
				News n = new News(id, title, brief);
				
				news.add(n);
				
			}
		} catch (SQLException e) {
			throw new DAOException(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				throw new DAOException(e);
			}
		}

		return news;
	}

}
