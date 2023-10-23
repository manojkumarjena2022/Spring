package com.mj.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	LocalDateTime datetime;
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	public String generateMessage(String user) {
		//get current hour of the day
		int hour=datetime.getHour();
		if(hour<12)
			return "Good morning "+user;
		if(hour<16)
			return "Good afternoon "+user;
		if(hour<20)
			return "Good evening "+user;
		else
			return "Good night "+user;
	}
}
