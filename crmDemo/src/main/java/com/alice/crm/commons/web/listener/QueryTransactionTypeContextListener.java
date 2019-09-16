package com.alice.crm.commons.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class QueryTransactionTypeContextListener
 *
 */
@WebListener
public class QueryTransactionTypeContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public QueryTransactionTypeContextListener() {
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
//    	 System.err.println("****com.alice.crm.commons.web.listener.QueryTransactionTypeContextListener");
//         DictionaryValueService dictionaryValueService = (DictionaryValueService) ServiceFactory
//   				.getService(new DictionaryValueServiceImpl());
//   		List<DictionaryValue> transactionTypeList = dictionaryValueService.queryDicValueBygrade("transactionType");
//   		ServletContext servletContext = sce.getServletContext();
//   		servletContext.setAttribute("transactionTypeList", transactionTypeList);
//    }
	
}
