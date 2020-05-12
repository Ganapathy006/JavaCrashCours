package com.lao.learnautomation;

public class ChildClass extends ParentClass {

	public ChildClass() {
		//After extends the another class by default we have super keyword
		//super();
		System.out.println("Child Constructor");
	}
	
	public static void main(String[] args) {
		
        ChildClass childclass = new ChildClass();
		
	}

}
