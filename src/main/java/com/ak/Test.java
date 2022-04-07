package com.ak;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.Employee;

public class Test {

	public static void main(String[] args) {
		
	/*	ApplicationContext ac=new ClassPathXmlApplicationContext("laxmi.xml");
		ExampleSetter es=ac.getBean(ExampleSetter.class);
		System.out.println(es);
		*/
		
		Resource r=new ClassPathResource("laxmi.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        ExampleSetter e=factory.getBean("objj",ExampleSetter.class);  
        System.out.println(e);
        
		
	}
}
