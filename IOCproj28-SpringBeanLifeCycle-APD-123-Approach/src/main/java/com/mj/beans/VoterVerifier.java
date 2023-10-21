package com.mj.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("voter")
public class VoterVerifier implements InitializingBean,DisposableBean {
	@Value("${vt.name}")
	private String name;
	@Value("${vt.age}")
	private float age;
	private Date verficationDate;

	public VoterVerifier() {
		System.out.println("VoterVerifier.VoterVerifier()");
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public void setVerficationDate(Date verficationDate) {
		this.verficationDate = verficationDate;
	}
	//init life cycle method or custom init method
	public void myInit()
	{
		System.out.println("VoterVerifier.myInit()-Declarative");
		verficationDate=new Date();//initializing bean properties that are not participated in injections
		//validation
		if(name==null || age<0)
			throw new IllegalArgumentException("invalid inputs are given for name,age properties");
	}
	//destroy life cycle method
	public void myDestroy()
	{
		System.out.println("VoterVerifier.myDestroy()-Declarative");
		//nullifying bean properties
		name=null;
		age=0;
		verficationDate=null;
	}
	@PostConstruct
	public void customInit()
	{
		System.out.println("VoterVerifier.customInit()-Annotation");
		verficationDate=new Date();//initializing bean properties that are not participated in injections
		//validation
		if(name==null || age<0)
			throw new IllegalArgumentException("invalid inputs are given for name,age properties");
	}
	@PreDestroy
	public void customDestroy()
	{
		System.out.println("VoterVerifier.customDestroy()-Annotation");
		//nullifying bean properties
		name=null;
		age=0;
		verficationDate=null;
	}

	

	@Override
	public void destroy() throws Exception {
		System.out.println("VoterVerifier.destroy()-DisposableBean(I)-Programmatic");
		//nullifying bean properties
		name=null;
		age=0;
		verficationDate=null;
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VoterVerifier.myInit()-InitializingBean(I)-Programmatic");
		verficationDate=new Date();//initializing bean properties that are not participated in injections
		//validation
		if(name==null || age<0)
			throw new IllegalArgumentException("invalid inputs are given for name,age properties");
		
	}
	//b.method
		public String checkVotingEligibility()
		{
			if(age<18)
				return "Mr/Miss/Mrs "+name+" you are not eligible for voting ...wait "+(18-age) +" years to cast your vote on-->"+verficationDate;
			else
				return "Mr/Miss/Mrs "+name+" you are eligible for voting dont wait on-->"+verficationDate;
		}
}
