package com.laxmi;

public class Car extends Engine{
	
	
	
	private IEngine ie =null;
	
//	public Car(IEngine ie) {  //Constructor injection
//		this.ie=ie;
//	}
	
	
	public void setEng(IEngine ie){  //Setter injection
		this.ie=ie;
	}
	public void drive() {
		
	//	Engine eng=new Engine();//composition
	//	int status=eng.start();
		
	//	int status=super.start(); //inheritance
		
	int status=ie.start();
		if(status==0) {
			System.out.println("Journey started..");
		}
	}

}
