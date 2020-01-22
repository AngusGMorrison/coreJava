package ch07.ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Runner {
	public static void main(String[] args) {
		File file = new File("./src/ch07/ex07/resources/wordsToCount.txt");
		WordCounter counter = new WordCounter(file);
		
		try {
			TreeMap<String, Integer> histogram = counter.count();
			System.out.println(histogram.toString());
			
			Map<String, HashSet<Integer>> wordsByLine = counter.wordsByLine();
			System.out.println(wordsByLine.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
