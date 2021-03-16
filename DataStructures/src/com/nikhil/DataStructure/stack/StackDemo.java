package com.nikhil.DataStructure.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// built in Stack class provided by java
		Stack<String> st = new Stack<>();
		st.push("Dog");
		st.push("Cat");
		st.push("Cow");
		System.out.println("Items in Stack " + st);
		
		System.out.println("\nPeeking element from stack " + st.peek());
		
		System.out.println("\nRemoving item from stack -" + st.pop());
		
		System.out.println("\nAfter pop " + st);
		
//		for (int i = 0; i < st.capacity(); i++) {
//			System.out.println(st.pop());
//		}
	}
}
