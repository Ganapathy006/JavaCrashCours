package com.lao.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	//In Linked Hashset duplicates are not allowed
	//In Linked hashset insertion orders are maintain
	
	public void linkhash(){
		
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
		
		linkedhashset.add("a");
		linkedhashset.add("c");
		linkedhashset.add("d");
		linkedhashset.add("f");
		linkedhashset.add("b");
		
		System.out.println("Added the values: " +linkedhashset);
		
		//remaining methods are all same to hashset
	}

	public static void main(String[] args) {
		
		LinkedHashSetExample example = new LinkedHashSetExample();
		example.linkhash();
		

	}

}
