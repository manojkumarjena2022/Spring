package com.mj.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.mj.comp.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
		//get xml reader
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("com/mj/cfgs/applicationContext.xml");
		//get target class object
		Flipkart flipkartObj=beanFactory.getBean("flipkart",Flipkart.class);
		//invoke business method
		String result=flipkartObj.shopping(new String[] {"shirt","pant","deo"}, new float[] {440.00f,960.00f,120f});
		System.out.println(result);
	}
}
