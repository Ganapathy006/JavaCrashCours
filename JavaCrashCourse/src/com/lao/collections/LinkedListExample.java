package com.lao.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	
	public void linklst(){
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(4);
		linkedlist.add(5);
		
		System.out.println("Values are added:" +linkedlist);
		
		//copy all the element to another list
		LinkedList<Integer> anotherlist = new LinkedList<Integer>();
		anotherlist.addAll(linkedlist);
		System.out.println("Copied elements: " +anotherlist);
		
		//add another values
		anotherlist.add(8);
		anotherlist.addFirst(9);
		anotherlist.addLast(2);
		System.out.println("after added values to another list: "+anotherlist);
		
		//Add an element to first
		linkedlist.addFirst(2);
		System.out.println("After added the first element: " +linkedlist);
		
		//Add an element to last
		linkedlist.addLast(6);
		System.out.println("After added the last element: " +linkedlist);
		
		//Get the first value
		System.out.println("Retrieve the first element:" +linkedlist.getFirst());
		
		//Get the last value
		System.out.println("Retrieve the last element: " +linkedlist.getLast());
		
		//Remove first and remove last
		linkedlist.removeFirst();
		System.out.println("Removed the first element: " +linkedlist);
		linkedlist.removeLast();
		System.out.println("Removed the last element: " +linkedlist);
		
		//Remove the element with index
		linkedlist.remove(0);
		System.out.println("removed the element using index: "+linkedlist);
		
		//Poll method and Pollfirst deletes the first element in the list
		linkedlist.poll();
		System.out.println("After polling: "+linkedlist);
		linkedlist.pollFirst();
		System.out.println("After polling first: " +linkedlist);
		
		linkedlist.pollLast();
		System.out.println("After polling last: "+linkedlist);
		
		//remove the first element
		linkedlist.remove();
		System.out.println("removed the first value: "+linkedlist);
		
		//remove first occurance
		anotherlist.removeFirstOccurrence(9);
		System.out.println("After removed first occurance:" +anotherlist);
		
		//remove last occurance
		anotherlist.removeLastOccurrence(2);
		System.out.println("After removed last occurance:" +anotherlist);
		
		//Looping using for each
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("d");
		lst.add("e");
		
		for (String string : lst) {
			System.out.println("for each loop: " +string);
		}
		
		//Using for loop
		System.out.println("-----------------------------------------------------");
		for(int i=0; i<lst.size();i++){
			System.out.println("for loop: " +lst.get(i));
		}
		
		System.out.println("------------------------------------------------------");
		
		//Using ListIterator looping
		ListIterator<String> list_iterator = lst.listIterator();
		while(list_iterator.hasNext()){//forward traversing
			System.out.println("Using List iterator: " +list_iterator.next());
		}
		
		System.out.println("-------------------------------------------------------");
		
		//Reverse traversing
		while(list_iterator.hasPrevious()){
			System.out.println("List_iterator reverse traversing: " +list_iterator.previous());
		}
		
		//Using Iterator looping
		Iterator<String> iterator = lst.iterator();
		while(iterator.hasNext()){
			System.out.println("Using iterator: " +iterator.next());
		}
		
		
	}

	public static void main(String[] args) {
		

		LinkedListExample example = new LinkedListExample();
		
		example.linklst();
	}

}
