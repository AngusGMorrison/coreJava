package ch06.ex15;

import java.util.ArrayList;
import java.util.function.Function;

public class Mapper {
	public static <T, R> ArrayList<R> map(ArrayList<T> input, Function<T, R> function) {
		ArrayList<R> output = new ArrayList<>();
		for (T elem : input) {
			R result = function.apply(elem);
			output.add(result);
		}
		return output;
	}
}
