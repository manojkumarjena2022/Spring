package com.mj.beans;
public class User {
	private String userName;
	WishMessageGenerator wmg;
	static {
		System.out.println("User static block executed");
	}
	public User(String userName,WishMessageGenerator wmg) {
		System.out.println("User :: 2-param constructor");
		this.userName=userName;
		this.wmg=wmg;
	}
	public String getUserName() {
		System.out.println("User :: getUserName()");
		return userName;
	}
}
