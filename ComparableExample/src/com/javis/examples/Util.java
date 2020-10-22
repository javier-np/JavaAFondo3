package com.javis.examples;

public class Util {
	
	@SuppressWarnings("unchecked")
	public static void sort(Comparable[] arr) {
		
		boolean sorted = false;
		
		while(!sorted) {
			
			sorted = true;
			
			for(int i = 0; i < arr.length-1; i++) {
				
				if(arr[i+1].compareTo(arr[i]) < 0) {
					
					Comparable<Student> aux = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = aux;
					
					sorted = false;
				}
			}
		}
	}
}
