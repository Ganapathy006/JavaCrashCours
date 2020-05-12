package com.lao.abstraction;

public class Bmw extends Car implements UpcomingProject,UpcomingProject2{
	
	@Override
	public void enginesecret(){
		System.out.println("BMW engine secret");
	}
	
	@Override
	public void companyVault(){
		System.out.println("BMW company vault");
	}
	
	public static void main(String[] args) {
		

		Car car = new Bmw(); //dynamic polymorphism
		car.enginesecret();
		car.companyVault();
		
		Bmw bmw = new Bmw();
		bmw.method1();
		bmw.method2();
		
	}

	@Override
	public void method1() {
		System.out.println("Method 1");
		
	}

	@Override
	public void method2() {
		System.out.println("Method 2");
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

}
