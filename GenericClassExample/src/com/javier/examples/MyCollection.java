package com.javier.examples;

public class MyCollection<T> {
	private Object[] data = null;
	private int length = 0;
	
	public MyCollection(int initialCap) {
		data = new Object[initialCap];
	}
	
	public void addElement(T element) {
		insert(element,length);
	}
	
	public void insert(T element, int index) {
		if(length == data.length) {
			Object[] aux = data;
			data = new Object[length*2];
			for(int i = 0; i < length; i++) {
				data[i] = aux[i];
			}
			
			aux = null;
		}
		
		for(int i = length-1; i >= index; i--) {
			data[i+1] = data[i];
		}
		
		data[index] = element;
	}
	
	public int search(T element) {
		int i = 0;
		for( ; i<length && !data[i].equals(element); i++) {}
		return i<length ? i : -1;
	}
	
	@SuppressWarnings("unchecked")
	public T delete(int index) {
		Object aux = data[index];
		
		for(int i = index; i < length-1 ; i++) {
			data[i] = data[i + 1];
		}
		
		length--;
		
		return (T)aux;
	}
	
	@SuppressWarnings("unchecked")
	public T getElement(int index) {
		return (T)data[index];
	}
}
