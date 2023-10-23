package com.mj.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.mj")
@PropertySource(value = "com/mj/commons/jdbc.properties")
@ImportResource(locations = "com/mj/cfgs/applicationContext.xml")
public class AppConfig {
	@Autowired
	private Environment env;
	@Bean
	public DriverManagerDataSource createDS()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		//note:since these java method call statements we can not use @Value with $...}
		dmds.setDriverClassName(env.getProperty("jdbc.driver"));//key pass as argument
		dmds.setUrl(env.getProperty("jdbc.url"));
		dmds.setUsername(env.getProperty("jdbc.user"));
		dmds.setPassword(env.getProperty("jdbc.password"));
		return dmds;
	}
	
}
