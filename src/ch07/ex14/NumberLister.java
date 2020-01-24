package ch07.ex14;

import java.util.AbstractList;
import java.util.List;

public class NumberLister {
	public static List<Integer> listTo(int n) {
		
		return new AbstractList<>() {
			@Override
			public Integer get(int index) {
				if (index < 0 || index > n) throw new IndexOutOfBoundsException();
				return index;
			}
			
			@Override
			public int size() {
				return n;
			}
		};
	}
}
