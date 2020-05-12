package com.lao.learnautomation;

public class ConstructorWithNoArgExample {
	
	int EmployeeID;
	String EmployeeName;
	
	public ConstructorWithNoArgExample() {
		
		EmployeeName = "Ganapathy";
		EmployeeID = 123;
		System.out.println("Employee object is created");
				
	}
	public static void main(String[] args) {
		
		ConstructorWithNoArgExample constructorwithNoArg = new ConstructorWithNoArgExample();
		
		//System.out.println(constructorwithNoArg.EmployeeID);
		

	}

}
