package ch08.ex13;

import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamZipper {
	public static void main(String[] args) {
		Stream<Integer> first = Stream.of(1, 3, 5, 7);
		Stream<Integer> second = Stream.of(2, 4, 6);
		List<Integer> zipped = zip(first, second).collect(Collectors.toList());
		System.out.println(zipped.toString());
	}

	public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
		List<T> firstElements = first.collect(Collectors.toList());
		List<T> secondElements = second.collect(Collectors.toList());
		
		List<T> longest = firstElements.size() > secondElements.size() ? firstElements : secondElements;
		List<T> shortest = longest == firstElements ? secondElements : firstElements;
		
		Iterator<T> iter = shortest.iterator();
		return longest.stream().flatMap(longEl -> {
			if (iter.hasNext()) {
				T shortEl = iter.next();
				return Stream.of(longEl, shortEl);
			}
			return Stream.of(longEl, null);
		});
	}
	
}
