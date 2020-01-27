package ch08.ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListReducer {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
		ArrayList<Integer> list2 = new ArrayList<>(List.of(4, 5, 6));
		ArrayList<Integer> list3 = new ArrayList<>(List.of(7, 8, 9));
		
		Stream<ArrayList<Integer>> stream1 = Stream.of(list1, list2, list3);
		System.out.println(reduceLists1(stream1).toString());
		
		Stream<ArrayList<Integer>> stream2 = Stream.of(list1, list2, list3);
		System.out.println(reduceLists2(stream2).toString());
		
		Stream<ArrayList<Integer>> stream3 = Stream.of(list1, list2, list3);
		System.out.println(reduceLists3(stream3).toString());
		
	}
	
	public static <T> ArrayList<T> reduceLists1(Stream<ArrayList<T>> stream) {
		return stream.reduce((acc, list) -> {
			acc.addAll(list);
			return acc;
		}).orElse(new ArrayList<>());
	}
	
	public static <T> ArrayList<T> reduceLists2(Stream<ArrayList<T>> stream) {
		return stream.reduce(
				new ArrayList<T>(),
				(acc, list) -> {
					acc.addAll(list);
					return acc;
				});
	}
	
	public static <T> ArrayList<T> reduceLists3(Stream<ArrayList<T>> stream) {
		return stream.reduce(
				new ArrayList<T>(),
				(acc, list) -> {
					acc.addAll(list);
					return acc;
				}, (a, b) -> {
					a.addAll(b);
					return a;
				});
	}
}
