package com.lao.map;

import java.util.HashMap;

public class HashMapExample {
	
	//Map is not the childinterface of collection(I) and hence it is not consider to be a true collection.
	//It represents data in Key-Value pair
	//Duplicate Keys are not allowed in Map
	//Duplicate values are allowed in map
	
	
	public void hashmapsample(){
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		//To add/insert an element use PUT method
		hashmap.put(1, "Arul"); //This is called as entry and all the entries or combination of entries are called as entryset
		hashmap.put(2, "Ram");
		hashmap.put(3, "Gana");
		hashmap.put(4, "Gana");
		hashmap.put(5, "Karthick");
		
		System.out.println("Insert the element:" +hashmap);
		
		//To make copy of existing map
		HashMap<Integer, String> anothermap = new HashMap<Integer, String>();
		anothermap.putAll(hashmap);
		System.out.println("Copy of hash map: " +anothermap);
		
		//clear to delete the map content
		anothermap.clear();
		System.out.println(anothermap);
		
		//check the map isempty
		System.out.println("Map is empty?: "+anothermap.isEmpty());
		
		//To check the given key is present or not in the map
		System.out.println("Given key is present or not in map: " +hashmap.containsKey(1));
		
		//To check the given value is present or not in the map
		System.out.println("Given value is present or not in map: " +hashmap.containsValue("Gana"));
		
		//clone the map or copy the map
		System.out.println("Clone the map: " +hashmap.clone());
		
		//To retrieve only the keys in the map
		System.out.println("Get the Keys: "+hashmap.keySet());
		
		//To retrieve only the values in the map
		System.out.println("Get the values: "+hashmap.values());
		
		//retrieve the key value using get method
		System.out.println("Get the values of key:" +hashmap.get(1));
		
		//retrieve all the entries using entryset
		System.out.println("Get all the values: " +hashmap.entrySet());
		
		
	}

	public static void main(String[] args) {
		
		HashMapExample example = new HashMapExample();
		example.hashmapsample();

	}

}
