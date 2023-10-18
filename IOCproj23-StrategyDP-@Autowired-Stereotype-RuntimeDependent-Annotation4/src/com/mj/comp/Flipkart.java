package com.mj.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("fpkt")
@Scope("singleton")
//@PropertySource("com/mj/commons/info.properties")

//@PropertySources(value={@PropertySource("com/mj/commons/info.properties"),@PropertySource("com/mj/commons/info1.properties")})

//@PropertySource("com/mj/commons/info.properties")
//@PropertySource("com/mj/commons/info1.properties")

//@PropertySource(value={"com/mj/commons/info.properties","com/mj/commons/info1.properties"})

@PropertySource({"com/mj/commons/info.properties","com/mj/commons/info1.properties"})

public class Flipkart {
	@Autowired
	@Qualifier("dtdc")
	Courier courier;
	
//	@Value("www.flipkart.com")
//	String url;
//	@Value("30")
//	int age;
	
	
	@Value("${ftp.info.url}")
	String url;
	@Value("${ftp.info.age}")
	int age;
	
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}
	
	//business method
	public String shopping(String[] items,float[] prices) {
		System.out.println("Url :"+url+" age : "+age);
		float billAmount=0.0f;
		for(float p:prices)
			billAmount+=p;
		int oid=new Random().nextInt(1000);
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+" prices "+Arrays.toString(prices)+" having bill amount "+billAmount+":::"+msg;
	}

}
