package com.javis.examples;

public class TestNumber {
	public static void main(String... args) {
		
		int result = Number.add(3, 5);
		System.out.println(result);
		
		Number n1 = new Number(5);
		n1.add(4);
		
		System.out.println(n1);
		
		n1.add(4).add(6).add(8).add(1);
		System.out.println(n1);
	}
}
