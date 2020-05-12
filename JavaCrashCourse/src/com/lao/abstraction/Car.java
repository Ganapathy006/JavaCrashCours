package com.lao.abstraction;

public abstract class Car {
	
	public abstract void enginesecret();
	
	public abstract void companyVault();
	
	//Cannot create object for abstract method
	//if the any of the method is abstract then the class should also be abstract
	//We can have both abstract and non abstract methods in abstract class
	
	public void method(){
		System.out.println("Method");
	}

}
