package ch06.ex01;

import java.util.ArrayList;

public class Stack<E> {
	private ArrayList<E> list;
	
	public Stack(ArrayList<E> list) {
		this.list = list;
		
	}
	
	public void push(E element) {
		list.add(element);
	}
	
	public E pop() {
		if (list.size() == 0) {
			throw new IllegalStateException("Stack is empty");
		}
		return list.remove(list.size() - 1);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
}
