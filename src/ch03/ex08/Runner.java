package ch03.ex08;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class Runner {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.addAll(Arrays.asList("bb", "dddd", "ccc", "a"));
		Comparator<String> comp = (string1, string2) -> string1.length() - string2.length();
		
		LuckySorter.luckySort(strings, comp);
	}
}
