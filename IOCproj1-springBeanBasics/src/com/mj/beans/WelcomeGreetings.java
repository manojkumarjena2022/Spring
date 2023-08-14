package com.mj.beans;

public class WelcomeGreetings {
	static {
		System.out.println("WelcomeGreetings.statis block");
	}
	public WelcomeGreetings()
	{
		System.out.println("WelcomeGreetings default constructor");
	}
	public String welcome(String user) {
		return "Welcome to String::"+user;
	}

}
