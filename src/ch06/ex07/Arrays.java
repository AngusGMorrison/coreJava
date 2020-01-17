package ch06.ex07;

import java.util.ArrayList;

public class Arrays {
	public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> a) {
		E first = a.get(0);
		E last = a.get(a.size() - 1);
		return new Pair<E>(first, last);
	}
}
