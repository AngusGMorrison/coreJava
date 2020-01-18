package ch06.ex12;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinMaxToList {
	public static <T> void minMax(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
		result.add(min(elements, comp));
		result.add(max(elements, comp));
	}
	
	private static <T> T min(List<T> elements, Comparator<? super T> comp) {
		T min = null;
		for (T elem : elements) {
			if (min == null || comp.compare(elem, min) < 0) {
				min = elem;
			}
		}
		return min;
	}
	
	private static <T> T max(List<T> elements, Comparator<? super T> comp) {
		T max = null;
		for (T elem : elements) {
			if (max == null || comp.compare(elem, max) > 0) {
				max = elem;
			}
		}
		return max;
	}
	
	public static <T> void maxMin(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
		minMax(elements, comp, result);
		Collections.swap(result, 0, 1);
	}
}
