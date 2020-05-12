package com.lao.polymorphism;

public class Childclass extends Parentclass{

	//Overriding otherwise called as runtime polymorphism, latebinding and dymanic
	
	@Override
	public void marriage(){
		System.out.println("My marriage my rule...!!!");
	}
	
	public static void main(String[] args) {
	
		Parentclass parent = new Childclass(); //Parentclass referencename = new Childclass()

		parent.properties();
		parent.marriage();
		
	}

}
