package org.asmod.springjsfprimefaces;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/*
 * Bootstraps Spring in the web application, 
 * An alternative to using XML 
 * 
 */
public class MyWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		
		//Create the 'root' Spring application context		
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(SpringConfiguration.class);
		
		//Manage the lifecycle of the root application context
		container.addListener(new ContextLoaderListener(rootContext));
		
	}
	
	

}
