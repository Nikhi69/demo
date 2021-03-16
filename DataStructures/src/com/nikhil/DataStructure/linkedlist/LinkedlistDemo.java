package com.nikhil.DataStructure.linkedlist;

import java.util.LinkedList;

public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList<String> q = new LinkedList<>();
		q.push("Tiger");
		q.add(1, "Lion");
		q.add("Dog");
		q.add("Cat");
		q.add("Cow");
		System.out.println("Items in Queue " + q);
		
		System.out.println("\nPeeking element from queue " +q.peek());
		
		System.out.println("\nRemoving item from queue -" + q.remove(3));
		
		System.out.println("\nRemoving item from queue -" + q.pop());
		
		System.out.println("\nAfter removing " + q);
	}
}
