package com.lao.learnautomation;

public class ReturntypeExample {
	
	public Integer collectamount = 1000;
	
	public Integer amountcollected(){
		
		System.out.println("Collected amount is:" +collectamount + " and Sent it to you");
		return collectamount;
	}

	public static void main(String[] args) {
		
		ReturntypeExample mySon = new ReturntypeExample();
		
		Integer amount = mySon.amountcollected();
		
		System.out.println("Got the amount: " +amount);

	}

}
