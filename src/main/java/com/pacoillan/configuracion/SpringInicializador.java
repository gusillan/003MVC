package com.pacoillan.configuracion;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringInicializador implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
		contexto.register(ConfiguradorSpring.class); // Registra los beans de Spring
		contexto.setServletContext(servletContext);  // Nos liga el contexto o la aplicacion web al configurador
		// Carga dinamicamente el Servlet de Spring controlador para manejar la aplicacion 
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(contexto));		
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
	}
	
	

}
