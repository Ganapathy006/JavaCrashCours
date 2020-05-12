package com.lao.inheritence;

public class ChildClass extends ParentClass {
	
	public void myProperties(){
		System.out.println("Child properties");
	}

	public static void main(String[] args) {

		ChildClass child = new ChildClass();
		child.properties();
		child.things();
		child.myProperties();

		
		/*ParentClass parent = new ParentClass();
		parent.properties();
		parent.things();
		*/
	}

}
