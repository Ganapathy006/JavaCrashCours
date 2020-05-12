package com.lao.polymorphism;

public class OverloadingExample {
	
	public int add(int a, int b){
		return a+b;
		
	}
	
	public int add(int a, int b, int c){
		return a+b+c;
		
	}
	
	public float add(float a, float b){
		return a+b;
		
	}
	

	public static void main(String[] args) {
		
		OverloadingExample example = new OverloadingExample();
		System.out.println(example.add(20, 40));
		System.out.println(example.add(10, 20, 30));
		System.out.println(example.add(10, 20));
		
		

	}

}
