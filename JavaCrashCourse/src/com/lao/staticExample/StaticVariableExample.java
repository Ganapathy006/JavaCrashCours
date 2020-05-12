package com.lao.staticExample;

public class StaticVariableExample {
	
	//Once the variable is declared as static it should be shared amoungt all the methods
	static int accountbalance=0;
	String depositedBy;

	public static void main(String[] args) {
		
		StaticVariableExample variableexample = new StaticVariableExample();
		variableexample.accountbalance=1000;
		variableexample.depositedBy="Ganapathy";
		
		StaticVariableExample variableExample2 = new StaticVariableExample();
		variableExample2.accountbalance=2000;
		variableExample2.depositedBy="Karthick";
		
		System.out.println("Account balance is : " +variableexample.accountbalance);
		System.out.println("Deposited By is :" +variableexample.depositedBy);

		System.out.println("Account balance is : " +variableExample2.accountbalance);
		System.out.println("Deposited By is :" +variableExample2.depositedBy);
	}

}
