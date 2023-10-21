package com.mj.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("voter")
public class VoterVerifier{
	@Value("${vt.name}")
	private String name;
	@Value("${vt.age}")
	private float age;
	private Date verficationDate;

	public VoterVerifier() {
		System.out.println("VoterVerifier.VoterVerifier()");
	}

	public void setVerficationDate(Date verficationDate) {
		this.verficationDate = verficationDate;
	}
	
	//init life cycle method or custom init method
	@PostConstruct
	public void myInit()
	{
		System.out.println("VoterVerifier.myInit()");
		verficationDate=new Date();//initializing bean properties that are not participated in injections
		//validation
		if(name==null || age<0)
			throw new IllegalArgumentException("invalid inputs are given for name,age properties");
	}
	//destroy life cycle method
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("VoterVerifier.myDestroy()");
		//nullifying bean properties
		name=null;
		age=0;
		verficationDate=null;
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
