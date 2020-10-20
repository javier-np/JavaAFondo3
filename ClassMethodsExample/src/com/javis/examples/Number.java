package com.javis.examples;

public class Number {
	private int value;
	
	public Number(int value) {
		this.value = value;
	}
	
	public Number add(int number) {
		value += number;
		return this;
	}
	
	public static int add(int number1, int number2) {
		return number1 + number2;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Number [value=" + value + "]";
	}
}
