package com.alice.crm.commons.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class QueryStageContextListener
 *
 */
@WebListener
public class QueryStageContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public QueryStageContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
//    public void contextInitialized(ServletContextEvent sce)  {
//    	 System.err.println("****com.alice.crm.commons.web.listener.QueryStageContextListener");
//         DictionaryValueService dictionaryValueService = (DictionaryValueService) ServiceFactory
//   				.getService(new DictionaryValueServiceImpl());
//   		List<DictionaryValue> stageList = dictionaryValueService.queryDicValueBygrade("stage");
//   		ServletContext servletContext = sce.getServletContext();
//   		servletContext.setAttribute("stageList", stageList);
//    }
	
}
