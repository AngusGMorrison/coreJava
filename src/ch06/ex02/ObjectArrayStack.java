package ch06.ex02;

import java.util.Arrays;

public class ObjectArrayStack<E> {
	private Object[] data;
	private int position = 0;
	
	public ObjectArrayStack(int size) {
		if (size <= 0) throw new IllegalArgumentException("Size must be positive");
		this.data = new Object[size];
	}
	
	public void push(E element) {
		if (position == data.length) {
			data = Arrays.copyOf(data, data.length * 2);
		}
		data[position++] = element;
	}
	
	@SuppressWarnings("unchecked")
	public E pop() {
		if (position == 0) {
			throw new IllegalStateException("Stack is empty");
		}
		E element = (E) data[position];
		data[position--] = null;
		return element;
	}
	
	public boolean isEmpty() {
		return position == 0;
	}
}
