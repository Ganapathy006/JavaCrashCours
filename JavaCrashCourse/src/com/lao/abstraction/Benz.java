package com.lao.abstraction;

public class Benz extends Car{
	
	@Override
	public void enginesecret(){
		System.out.println("Benz engine secret");
	}
	
	@Override
	public void companyVault(){
		System.out.println("Benz company vault");
	}

	public static void main(String[] args) {
		
      Car car = new Benz(); //dynamic polymorphism
		
      car.enginesecret();
      car.companyVault();
	}

}
