package com.mj.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.mj.beans")//alternate <context:component-scan />
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	//@Bean("ldt")
	@Bean
	//@Scope("prototype")
	public LocalDateTime createLocalDateTime()
	{
		System.out.println("AppConfig.createLocalDateTime()@Bean method");
		LocalDateTime ldt=LocalDateTime.now();
		return ldt;
	}
}
