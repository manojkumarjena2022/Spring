package com.mj.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.mj.comp.Courier;
import com.mj.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	static {
		//locate properties file
		try {
			FileInputStream fis=new FileInputStream("src/com/mj/commons/input.properties");
			//load properties file to Properties object
			props=new Properties();
			props.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("unable input file found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No input file found to load");
			e.printStackTrace();
		}
	}
	//static factory method having factory pattern logic
	public static Flipkart getInstance() {
		try {
			//get dependent class name from from properties object
			String className=props.getProperty("courier.type");
			//load and create dependent class object
			Class c=Class.forName(className);
			Courier courier=(Courier)c.newInstance();
			//create target class object
			Flipkart flipkartObj=new Flipkart();
			//asign dependent class object to target class object
			flipkartObj.setCourier(courier);
			return flipkartObj;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
