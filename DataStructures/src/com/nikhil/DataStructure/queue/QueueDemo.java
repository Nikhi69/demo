package com.nikhil.DataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
	
		q.add("Dog");
		q.add("Cat");
		q.add("Cow");
		System.out.println("Items in Queue " + q);
		
		System.out.println("\nPeeking element from queue " +q.peek());
		
		System.out.println("\nRemoving item from queue -" + q.remove());
		
		System.out.println("\nAfter removing " + q);
	}

}
