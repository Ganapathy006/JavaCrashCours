package com.lao.conditionalExample;

public class LetsHaveCoffee {
	
	boolean cupIsEmpty=false;
	
	

	public static void main(String[] args) {
		
		LetsHaveCoffee coffee = new LetsHaveCoffee();
		
		if(coffee.cupIsEmpty){
			System.out.println("Fill the coffee");
		} else{
			System.out.println("Drink the coffee");
		}

	}

}
