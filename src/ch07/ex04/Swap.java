package ch07.ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

public class Swap {
	public static void main(String[] args) {
		List<Integer> randomAccessList = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5));
		swap(randomAccessList, 3, 5);
		assert(Objects.equals(randomAccessList, List.of(0, 1, 2, 5, 4, 3)));
		
		List<Integer> sequentialList = new LinkedList<>(List.of(0, 1, 2, 3, 4, 5));
		swap(sequentialList, 3, 5);
		assert(Objects.equals(sequentialList, List.of(0, 1, 2, 5, 4, 3)));
	}
	
	
	public static void swap(List<?> list, int i, int j) {
		if (list instanceof RandomAccess) {
			randomAccessSwap(list, i, j);
		} else {
			iteratorSwap(list, i, j);
		}
	}
	
	public static <T> void randomAccessSwap(List<T> list, int i, int j) {
		T first = list.get(i);
		list.set(i, list.get(j));
		list.set(j, first);
	}
	
	public static <T> void iteratorSwap(List<T> list, int i, int j) {
		ListIterator<T> iter = list.listIterator(i);
		T first = iter.next();
		
		for (int k = i + 1; k < j; k++) {
			iter.next();
		}
		T second = iter.next();
		iter.set(first);
		
		for (int k = j + 1; k > i; k--) {
			iter.previous();
		}
		iter.set(second);
	}
}
