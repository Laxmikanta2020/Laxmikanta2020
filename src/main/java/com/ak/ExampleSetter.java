package com.ak;

public class ExampleSetter {

	
	String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ExampleSetter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExampleSetter( String name) {
		super();
		
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ExampleSetter [ name=" + name + "]";
	}
	
	
	
}
