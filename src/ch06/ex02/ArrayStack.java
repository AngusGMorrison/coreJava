package ch06.ex02;

import java.util.Arrays;

public class ArrayStack<E> {
	private E[] data;
	private int position = 0;
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		if (size <= 0) throw new IllegalArgumentException("Size must be positive");
		this.data = (E[]) new Object[size];
	}

	public void push(E element) {
		if (position == data.length) {
			data = Arrays.copyOf(data, data.length * 2);
		}
		data[position++] = element;
	}
	
	public E pop() {
		if (position == 0) {
			throw new IllegalStateException("Stack is empty");
		}
		E element = data[position];
		data[position--] = null;
		return element;
	}
	
	public boolean isEmpty() {
		return position == 0;
	}
}
