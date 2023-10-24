package com.mj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.mj")
@ImportResource(locations = "com/mj/cfgs/applicationContext.xml")
public class AppConfig {

}
