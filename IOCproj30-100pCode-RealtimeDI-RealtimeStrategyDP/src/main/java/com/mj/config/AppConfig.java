package com.mj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.mj")
public class AppConfig {
	@Bean("oracleDS")
	public DriverManagerDataSource createDSForOracle()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dmds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		dmds.setUsername("system");
		dmds.setPassword("tiger");
		return dmds;
	}
	@Bean("mysqlDS")
	public DriverManagerDataSource createDSForMySQL()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql:///spring_boot_tutorial");
		dmds.setUsername("root");
		dmds.setPassword("");
		return dmds;
	}

}
