package ch07.ex03;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

public class Sets {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>(Set.of(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Set.of(4, 5, 6, 7, 8));
		
		Set<Integer> union = union(set1, set2);
		assert(Objects.equals(union, Set.of(1, 2, 3, 4, 5, 6, 7, 8)));
		
		Set<Integer> intersection = intersection(set1, set2);
		assert(Objects.equals(intersection, Set.of(4, 5)));
		
		Set<Integer> difference = difference(set1, set2);
		System.out.println(difference.toString());
		assert(Objects.equals(difference, Set.of(1, 2, 3, 6, 7, 8)));	
	}
	
	public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
		Set<T> union = new HashSet<>(set1);
		union.addAll(set2);
		return union;
	}
	
	public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
		Set<T> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		return intersection;
	}
	
	public static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
		Set<T> intersection = intersection(set1, set2);
		Set<T> difference = union(set1, set2);
		difference.removeAll(intersection);
		return difference;
	}
}
