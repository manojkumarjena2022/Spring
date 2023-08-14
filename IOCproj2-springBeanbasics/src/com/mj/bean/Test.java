package com.mj.bean;

public class Test {
	private int a,b;
	
	static
	{
		System.out.println("Test::static block");
	}
	public Test() {
		// TODO Auto-generated constructor stub
		System.out.println("Test::default constructor");
	}

	public Test(int a, int b) {
		System.out.println("Test::param 2 constructor");
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Test[a="+a+",b="+b+"]";
	}
	

}
