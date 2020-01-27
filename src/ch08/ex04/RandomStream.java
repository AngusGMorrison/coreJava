package ch08.ex04;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class RandomStream {

	public static void main(String[] args) {
		Stream<Long> generator = createGenerator(23L, 25214903917L, 11L, (long) Math.pow(2, 48));
		System.out.println(generator.limit(5).collect(Collectors.toList()));
	}
		
	
	public static Stream<Long> createGenerator(long seed, long a, long c, long m) {
		return Stream.iterate(seed, prev -> (a * prev + c) % m);
	}

}
