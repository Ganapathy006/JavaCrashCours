package com.lao.learnautomation;

public class BankOperation {
	
	long accountno = 1234567890l;
	String accountName = "Ganapathy";
	int accountbalance = 450;
	
	public void accountstatement(){
		System.out.println("Balance is: " +accountbalance);
	}

	public static void main(String[] args) {
		
		BankOperation operation = new BankOperation();
		operation.accountstatement();
		System.out.println(operation.accountno);
		

	}

}
