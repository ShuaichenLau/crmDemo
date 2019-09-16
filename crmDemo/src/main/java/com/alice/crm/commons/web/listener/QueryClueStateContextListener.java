package com.alice.crm.commons.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class
 * QueryClueStateContextListener
 * @author LauShuaichen
 */
@WebListener
public class QueryClueStateContextListener implements ServletContextListener {

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
//	public void contextInitialized(ServletContextEvent sce) {
//		// 调用 service 查询 **线索状态** --!
//		DictionaryValueService dictionaryValueService = (DictionaryValueService) ServiceFactory.getService(new DictionaryValueServiceImpl());
//		List<DictionaryValue> clueStateList = dictionaryValueService.queryDicValueBygrade("clueState");
//		// 把aictivityTypeList 保存到context中
//		ServletContext servletContext = sce.getServletContext();
//		servletContext.setAttribute("clueStateList", clueStateList);
//
//	}

}
