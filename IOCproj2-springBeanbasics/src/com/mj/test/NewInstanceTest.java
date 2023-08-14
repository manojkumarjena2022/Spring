package com.mj.test;

public class NewInstanceTest {
public static void main(String[] args) throws Exception {
	Class c=Class.forName(args[0]);
	Object obj=c.newInstance();
	System.out.println("Data"+obj);
}
}
