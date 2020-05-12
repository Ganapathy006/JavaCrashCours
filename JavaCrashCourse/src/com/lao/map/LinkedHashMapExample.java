package com.lao.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	
	//Only difference between Hashmap and linkedhashmap is - Insertion in hashmap is not maintained and LinkedHashmap insertions are maintained
	//Except this everything is same in both...methods as well
	
	
	public void linkedhashmapsample(){
		
		LinkedHashMap<String, String> linkedhashmap = new LinkedHashMap<String, String>();
		linkedhashmap.put("Thalapathy", "Vijay");
		linkedhashmap.put("Thala", "Ajith");
		linkedhashmap.put("Super star", "Rajini");
		linkedhashmap.put("Ulaga nayagan", "Kamal");
		
		
		System.out.println("LinkeHashmap: " +linkedhashmap);
		
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("Thalapathy", "Vijay");
		hashmap.put("Thala", "Ajith");
		hashmap.put("Super star", "Rajini");
		hashmap.put("Ulaga nayagan", "Kamal");
		
		System.out.println("Hashmap: "+hashmap);
		
	}

	public static void main(String[] args) {
		
		LinkedHashMapExample example = new LinkedHashMapExample();
		example.linkedhashmapsample();

	}

}
