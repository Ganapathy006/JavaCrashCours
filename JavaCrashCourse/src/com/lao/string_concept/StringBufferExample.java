package com.lao.string_concept;

public class StringBufferExample {

	public static void main(String[] args) {
		
		System.out.println("String is Immutable object");
		String name = "Ganapathy";
		System.out.println("Appending a name to original:" +name.concat("Alagiri"));
		System.out.println("Original name:" +name);
		System.out.println("*********************************************************");
		System.out.println("String buffer is mutable");
		StringBuffer name1 = new StringBuffer("Karthikeyan");
		System.out.println("Appending a name to original:" +name1.append("Alagiri"));
		System.out.println("Original name:" +name1);
		
		System.out.println("Reverse the string: " +name1.reverse());
		
		StringBuffer replacethis = new StringBuffer("Arul");
		System.out.println("Replace the string: " +replacethis.replace(0, 2, "Riya"));
		
		StringBuffer deletethis = new StringBuffer("xyzRiya");
		System.out.println("Delete the string: " +deletethis.delete(0, 3));
		
		StringBuffer insertthis = new StringBuffer("Moni");
		System.out.println("Insert the string: " +insertthis.insert(4, "sha"));
		System.out.println("Capacity: " +insertthis.capacity() );

	}

}
