package com.lao.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	//TreeSet is a class in Set and it implements from SortedSet(I) and NavigableSet(I)
	//duplicate values are not allowed
	//Elements will be retrieved on natural sorting order(ascending order)
	//Hetergenous objects are not allowed
	//null values are not allowed

	public void treesetsample(){

		TreeSet<Integer> treeset = new TreeSet<Integer>();

		treeset.add(0);
		treeset.add(1);
		treeset.add(2);
		treeset.add(3);
		treeset.add(5);
		treeset.add(6);
		treeset.add(7);
		treeset.add(8);
		treeset.add(9);


		System.out.println("Added elements in treeset: " +treeset);


		//retrieve the first element in the set
		System.out.println("Get the first element: " +treeset.first());

		//Retrieve the last element
		System.out.println("Get the last element: " +treeset.last());

		//Retrieve the immediate lower value before the given element 
		System.out.println("Lower value: " +treeset.lower(3));

		//Retrieve the immediate higher value after the given element
		System.out.println("Higher value: "+treeset.higher(7));

		treeset.remove(0);
		System.out.println("After removed the value: " +treeset);

		//Retrieve the value lesser than given value
		System.out.println("Values lesser than given value: " +treeset.headSet(3));

		//Retrieve the value equal to or greater than given value
		System.out.println("Values equal to or greater than given value: " +treeset.tailSet(7));

		//Retrieve the range of values given value
		System.out.println("Range of values: " +treeset.subSet(3, 7));

		//If the values is arranged by default then comparator will return null
		System.out.println(treeset.comparator());

		//Retrieve the firstvalue and remove it
		treeset.pollFirst();
		System.out.println("Retrieved and removed the value: "+treeset);

		//Retrieve the lastvalue and remove it
		treeset.pollLast();
		System.out.println("Retrieved and removed the value: "+treeset);

		//Retrieve the set in descending order
		System.out.println("Retrieve the set in descending order: "+treeset.descendingSet());
		
		//looping
		Iterator<Integer> iterator = treeset.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		//looping in descending order
		Iterator<Integer> iterator1 = treeset.descendingIterator();
		while(iterator1.hasNext()){
			System.out.println(iterator1.next());
		}
		
	}

	public static void main(String[] args) {

		TreeSetExample example = new TreeSetExample();
		example.treesetsample();

	}

}
