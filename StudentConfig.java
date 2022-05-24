package com.jshsb.sm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.jshsb"})
public class StudentConfig {
	
	@Bean
	public InternalResourceViewResolver viweresolver() {
		
		InternalResourceViewResolver viweresolver=new InternalResourceViewResolver();
		viweresolver.setPrefix("/WEB-INF/view/");
		viweresolver.setSuffix(".jsp");
		
		return viweresolver;
		
	}

}
