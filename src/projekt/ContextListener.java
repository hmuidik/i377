package projekt;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent arg0) {
    	try {
    		SetupDao setupDao = new SetupDao();
        	setupDao.createSchema();
        	setupDao.addData();
        	
			
		}   catch (Exception e) {
			System.out.println("Failed to create schema and add data!");
			e.printStackTrace();
		}
    	
    	System.out.println("Context initialized!");
        
    }

    public void contextDestroyed(ServletContextEvent arg0) {
    	
    	SetupDao setupDao = new SetupDao();
    	try {
			setupDao.dropSchema();
			
		}   catch (Exception e) {
			System.out.println("Failed to drop schema!");
			e.printStackTrace();
		}
    	System.out.println("context destroyed");
        
    }
	
}
