package ch03.ex07;

import java.util.Iterator;

public class DigitSequence implements Iterator<Integer> {
	private int number;
	
	public DigitSequence(int n) {
		this.number = n;
	}
	
	public boolean hasNext() {
		return number != 0;
	}
	
	public Integer next() {
		int result = number % 10;
		number /= 10;
		return result;
	}
	
	public void remove() {}
	
	public int rest() {
		return number;
	}
}
