package com.lao.staticExample;

public class StaticBlockExample {
	
	//If we make the block as static then static variable should print/work before the main method execution. 
	static{
		System.out.println("I am static block");
	}
	
	static{
		System.out.println("I am static block2");
	}

	public static void main(String[] args) {
		
		System.out.println("I am main method");

	}

}
