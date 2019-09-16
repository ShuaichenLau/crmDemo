package com.alice.crm.commons.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class
 * QueryClueGradeContextListener
 * @author LauShuaichen
 */
@WebListener
public class QueryClueGradeContextListener implements ServletContextListener {

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
//	public void contextInitialized(ServletContextEvent sce) {
//		System.err.println("com.alice.crm.commons.web.listener.QueryClueGradeContextListener");
//		// 调用 service 查询 **等级** --!
//		DictionaryValueService dictionaryValueService = (DictionaryValueService) ServiceFactory.getService(new DictionaryValueServiceImpl());
//		List<DictionaryValue> gradeList = dictionaryValueService.queryDicValueBygrade("grade");
//		// 把aictivityTypeList 保存到context中
//		ServletContext servletContext = sce.getServletContext();
//		servletContext.setAttribute("gradeList", gradeList);
//
//	}

}
