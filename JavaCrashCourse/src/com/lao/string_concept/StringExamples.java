package com.lao.string_concept;

public class StringExamples {

	public static void main(String[] args) {
		
		String name="GanapathyAlagiri";
		int number=4;
		
		System.out.println(name.charAt(2));
		
		System.out.println(name.contains("A"));
		
		System.out.println(name.equals("ganapathy"));
		
		System.out.println(name.equalsIgnoreCase("ganapathyalagiri"));
		
		System.out.println(name.concat("Genius"));
		
		System.out.println(name.length());
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.replace("A", "a"));
		
		System.out.println(name.substring(1));
		
		System.out.println(name.substring(1, 6));//it give give the first index and wont give the last index
		
		System.out.println(name.trim());
		
		System.out.println(name.indexOf("A"));
		
		System.out.println(name.indexOf("a"));
		
		System.out.println(name.indexOf("a", 4));

		System.out.println(name.indexOf("pathy", 0));
		
		System.out.println(name.contains("a"));
		
		System.out.println(String.valueOf(number));
		
		String uppercase="KARTHIKEYAN";
		System.out.println(uppercase.toLowerCase());
		
		String lowecase="sriharish";
		System.out.println(lowecase.toUpperCase());
		
		//Return a joined string with the given delimeter
		System.out.println(String.join("-", "learn", "automation", "online"));
		System.out.println(String.join("/", "06","03","1990"));
		
		//Split this
		String splitthis = "Am,I,learning,java,correctly";
		String[] splittedwords = splitthis.split(",");
	    for (String string : splittedwords) {
			System.out.println(string);
		}
		
	}

}
