package com.lao.staticExample;

public class StaticMethodExample {
	
	//Once the method is declared as static it should be common for all the instances without creating an object
	public static void method1(){
		System.out.println("I am static method");
	}
	
	public void nonStatic(){
		method1();
		System.out.println("I am non static method");
	}

	public static void main(String[] args) {
		
		method1();
		
		StaticMethodExample method2 = new StaticMethodExample();
		method2.nonStatic();
		

	}

}
