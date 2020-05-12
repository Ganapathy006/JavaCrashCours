package com.lao.learnautomation;

public class Animal {
	
	String animal_name;
	String animal_type;
	
	Animal(){
		System.out.println("Animal object is created");
	}
	
	//Parameterized Constructor Example
	Animal(String name, String type){
		
		animal_name=name;
		animal_type=type;
	/*	System.out.println(name);
		System.out.println(type);*/
	}
	
	public void sayaboutAnimal(){
		System.out.println("Animal name is: " +animal_name  +" and Animal type is: " +animal_type);
	}

	public static void main(String[] args) {
		
		Animal animal = new Animal("Lion", "Omnivorous");
		Animal animal2 = new Animal("Tiger", "Omnivorous");
		animal.sayaboutAnimal();
		animal2.sayaboutAnimal();
		Animal animal1 = new Animal();
      
	}

}
