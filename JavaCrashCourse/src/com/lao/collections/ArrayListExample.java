package com.lao.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	
	public void arrlist(){
		
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Benz");
		arrayList.add("Toyota");
		arrayList.add("Maruti");
		arrayList.add("BMW");
		arrayList.add("Royce");
		arrayList.add("Royce"); //can add duplicate values in arraylist
		
		System.out.println(arrayList);
		
		//To retrieve the element 
		System.out.println(arrayList.get(1));
		
		//To find the element index position
		System.out.println(arrayList.indexOf("Maruti"));
		
		//To find the last element index value
		System.out.println(arrayList.lastIndexOf("Royce"));
		
		//If we are retrieving the element which is not in the list then it will return -1 value
		System.out.println(arrayList.indexOf("Suzuki"));
		
		//To copy the arrayList to another List
		List<String> anotherList = new ArrayList<>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);
		
		//To delete all the elements
		anotherList.clear();
		System.out.println(anotherList);
		
		//To remove the particular element in the list by index
		arrayList.remove(0);
		System.out.println(arrayList);
		//To remove the particular element in the list by value
		arrayList.remove("Royce");
		System.out.println(arrayList);
		
		//null insertion is possible
		arrayList.add(null);
		System.out.println(arrayList);
		
		//To update the value of the element in the particular index
		arrayList.set(0, "Chevrolet");
		System.out.println(arrayList);
		arrayList.set(4, "Bugatti");
		System.out.println(arrayList);
		
		//To check whether the list is empty
		System.out.println(anotherList.isEmpty());
		System.out.println(arrayList.isEmpty());
		
		System.out.println("************************************************");
		
		//Iterate in different types
		for (String string : arrayList) {
			System.out.println("Using for each loop: " +string);
		}
		
		System.out.println("---------------------------------------------------");
		
		for(int i=0; i<arrayList.size();i++){
			System.out.println("Using for loop: " +arrayList.get(i));
		}
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("*****List Iterator******");
		
		ListIterator<String> list_iterator = arrayList.listIterator();
		while(list_iterator.hasNext()){         //forward traversing
			System.out.println(list_iterator.next());
		}
		
		System.out.println("--***------*****----");
		
		while(list_iterator.hasPrevious()){   //reverse traversing
			System.out.println(list_iterator.previous());
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Using Iterator");
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()){  //Only forward traversing is possible in iterator
			System.out.println(iterator.next());
		}
		
		
		
		
	}

	public static void main(String[] args) {
		
		ArrayListExample example = new ArrayListExample();
		example.arrlist();
		

	}

}
