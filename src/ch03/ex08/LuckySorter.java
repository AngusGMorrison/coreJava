package ch03.ex08;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class LuckySorter {
	public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
		ArrayList<String> sortedStrings = new ArrayList<>(strings);
		Collections.sort(sortedStrings, comp);
		
		while (!strings.equals(sortedStrings)) {
			System.out.println("Shuffling...");
			Collections.shuffle(strings);
		}
	}
}
