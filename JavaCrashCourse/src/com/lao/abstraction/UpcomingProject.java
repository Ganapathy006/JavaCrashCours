package com.lao.abstraction;

public interface UpcomingProject extends UpcomingProject2{

	String upcomingproject = "Ganapathy"; //Interface should have the variable type as public, static and final.
	
	public void method1();
	
	public void method2(); //Interface should have the methods with only abstract & public.
	
}
