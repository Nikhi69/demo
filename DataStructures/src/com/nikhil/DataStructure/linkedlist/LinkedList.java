package com.nikhil.DataStructure.linkedlist;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		// constructor
		Node(int d) {
			data = d;
			next = null;
		}

	}

	// To insert new node at the front
	public void push(int new_data) {
		Node new_node =new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	//To insert new node after the previous node or specific location
	
	public void insertAfter(Node prev_node,int new_data) {
		//to check given node is null or not
		if(prev_node==null) {
			System.out.println("It cant be null");
			return;
		}
		
		Node new_node =new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	
	//To add new node at the end
	
	public void append(int new_data) {
		Node new_node =new Node(new_data);
		if(head==null) {
			head =new Node(new_data);
			return;
		}
		
	new_node.next =null;
	Node last= head;
	while(last.next!=null)
		last =last.next;
	
	last.next=new_node;
	return;
	}

	public void printlist()
	{
		Node tnode =head;
		while(tnode!=null) {
			System.out.println(tnode.data+ " ");
			tnode=tnode.next;
		}
	}
	
	public static void main(String [] args) {
		LinkedList list =new LinkedList();
		list.append(10);
//		list.push(20);
//		list.push(25);
//		list.push(35);
////		list.append(40);
//		list.insertAfter(list.head, 100);
		System.out.println("\nCreated linked list");
		list.printlist();
	}
}
