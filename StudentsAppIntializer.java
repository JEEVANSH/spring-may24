package com.jshsb.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentsAppIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses(){
		// TODO Auto-generated method 
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses(){
		Class[] configFiles= {StudentConfig.class};
		return configFiles;
	}

	@Override
	protected String[] getServletMappings(){
		String [] mapping= {"/"};
		return mapping;
	}

}
