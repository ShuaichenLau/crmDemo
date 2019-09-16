package com.alice.crm.commons.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class
 * QueryIndustryContextListener
 *
 */
@WebListener
public class QueryIndustryContextListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public QueryIndustryContextListener() {
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
//		System.err.println("com.alice.crm.commons.web.listener.QueryIndustryContextListener");
//		DictionaryValueService dictionaryValueService = (DictionaryValueService) ServiceFactory
//				.getService(new DictionaryValueServiceImpl());
//		List<DictionaryValue> industryList = dictionaryValueService.queryDicValueBygrade("industry");
//		// 把aictivityTypeList 保存到context中
//		ServletContext servletContext = sce.getServletContext();
//		servletContext.setAttribute("industryList", industryList);
//	}

}
