package ch08.ex01;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongWords {

	public static void main(String[] args) {
		Stream<String> words = Stream.of("hello", "garbleblarble", "and", "truncated", "heliotrope", "maximums", "marauders", "the", "fictionality", "carabiner", "corduroy", "Colindale");
		List<String> longWords = words.filter(w -> {
			System.out.println("filtering");
			return w.length() > 5;
		}).limit(5)
		  .collect(Collectors.toList());
	}

}
