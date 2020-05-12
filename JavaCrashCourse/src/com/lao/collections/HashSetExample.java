package com.lao.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public void hashsetexm(){
		
		HashSet<String> hashset = new HashSet<String>(); //default capacity size is 16 and default fill ratio or load factor is 0.75 or 75%
		
		//Hashset will not maintain inserted values
		//Hashset will not allow duplicate values
		
		hashset.add("B");
		hashset.add("A");
		hashset.add("A");
		hashset.add("C");
		hashset.add("F");
		hashset.add("D");
		hashset.add("null");
		
		System.out.println("Added values: " +hashset);
		
		System.out.println("Comparing the values: " +hashset.contains("G"));
		
		System.out.println("Comparing the set of values: " +hashset.containsAll(hashset));
		
		HashSet<String> anotherset = new HashSet<String>();
		anotherset.addAll(hashset);
		System.out.println("Copying all the values to anotherset: " +anotherset);
		
		System.out.println(anotherset.containsAll(anotherset));
		
		anotherset.remove("null");
		System.out.println("After removed the value: " +anotherset);
		
		
	    //Looping
		Iterator<String> iterator = hashset.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
				
	}
	
	

	public static void main(String[] args) {
		
		HashSetExample example = new HashSetExample();
		example.hashsetexm();
		
		

	}

}
