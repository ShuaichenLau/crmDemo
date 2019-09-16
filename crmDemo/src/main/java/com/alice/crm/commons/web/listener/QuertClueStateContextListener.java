package com.alice.crm.commons.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class
 * QuertClueStateContextListener
 *
 */
@WebListener
public class QuertClueStateContextListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public QuertClueStateContextListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
//	public void contextInitialized(ServletContextEvent sce) {
//		System.err.println("=====com.alice.crm.commons.web.listener.QuertClueStateContextListener");
//		DictionaryValueService dictionaryValueService = (DictionaryValueService) ServiceFactory
//				.getService(new DictionaryValueServiceImpl());
//		List<DictionaryValue> clueStateList = dictionaryValueService.queryDicValueBygrade("clueState");
//		ServletContext servletContext = sce.getServletContext();
//		servletContext.setAttribute("clueStateList", clueStateList);
//	}

}
