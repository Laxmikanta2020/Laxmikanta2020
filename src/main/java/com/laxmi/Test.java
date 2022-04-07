package com.laxmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
//		Engine eng=new Engine();
//		//Car car=new Car(eng);
//		Car car=new Car();
//		car.setEng(eng);
//		car.drive();
		
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		Car car=ap.getBean(Car.class);
		car.drive();
	}
}
