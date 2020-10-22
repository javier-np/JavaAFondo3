package com.javis.examples;

import java.util.Arrays;

public class StudentTest {
	
	public static void main(String... args) {
		
		Student[] students = {
				new Student("Pedro", 25, 85.7),
				new Student("Maria", 15, 66.6),
				new Student("Puchini", 8, 99.25)
		};
		
		Util.sort(students);
		
		System.out.println("Array sorted: " + Arrays.toString(students));
	}

}
