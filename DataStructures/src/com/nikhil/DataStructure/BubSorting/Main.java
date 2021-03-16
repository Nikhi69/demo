package com.nikhil.DataStructure.BubSorting;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int [] arr = {10,20,5,3,2,22,11,65,3,1,48};
		BubbleSort sorter=new BubbleSort();
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		sorter.sort(arr);
		System.out.println("After Sorting: "+Arrays.toString(arr));
	}

}
