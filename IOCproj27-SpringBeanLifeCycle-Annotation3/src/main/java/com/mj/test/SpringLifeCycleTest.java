package com.mj.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mj.beans.VoterVerifier;

public class SpringLifeCycleTest {

	public static void main(String[] args) {
		//create IOC
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/mj/cfgs/applicationContext.xml");
		//get spring bean object
		VoterVerifier voterVerifier=ctx.getBean("voter",VoterVerifier.class);
		try {
			System.out.println(voterVerifier.checkVotingEligibility());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//close IOC
		ctx.close();
	}

}
