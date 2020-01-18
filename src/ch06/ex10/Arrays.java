package ch06.ex10;

import ch06.ex07.Pair;

public class Arrays {
	public static <T extends Comparable<T>> T min(T[] array) {
		T min = null;
		for (T elem : array) {
			if (min == null || elem.compareTo(min) < 0) {
				min = elem;
			}
		}
		return min;
	}
	
	public static <T extends Comparable<T>> T max(T[] array) {
		T max = null;
		for (T elem : array) {
			if (max == null || elem.compareTo(max) > 0) {
				max = elem;
			}
		}
		return max;
	}
	
	public static <T extends Comparable<T>> Pair<T> minMax(T[] array) {
		return new Pair<T>(min(array), max(array));
	}
}
