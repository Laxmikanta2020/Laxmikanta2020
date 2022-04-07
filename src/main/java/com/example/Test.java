package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("NewFile.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Employee e=(Employee)factory.getBean("ob");  
	    e.displayInfo();  
}

}