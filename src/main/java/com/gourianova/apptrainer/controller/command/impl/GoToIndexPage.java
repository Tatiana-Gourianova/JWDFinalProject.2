package com.gourianova.apptrainer.controller.command.impl;

import com.gourianova.apptrainer.controller.command.Command;
import com.gourianova.apptrainer.service.NewsService;
import com.gourianova.apptrainer.bean.News;
import com.gourianova.apptrainer.service.ServiceException;
import com.gourianova.apptrainer.service.ServiceProvider;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GoToIndexPage implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServiceProvider provider = ServiceProvider.getInstance();
		NewsService newsService = provider.getNewsService();
		
		try {
			List<News> news = newsService.takeAll();
			
			request.setAttribute("news", news);
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main_index.jsp");
			requestDispatcher.forward(request, response);
			
		} catch (ServiceException e) {
			// TODO перейти на глобальную страницу ошибок
			e.printStackTrace();
		}	
	

	}

}
