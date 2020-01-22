package ch07.ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCounter {
	private File file;
	
	public WordCounter(File file) {
		this.file = file;
	}
	
	public TreeMap<String, Integer> count() throws FileNotFoundException {
		TreeMap<String, Integer> histogram = new TreeMap<>();
		
		try (Scanner in = new Scanner(file)) {
			while (in.hasNext()) {
				histogram.merge(in.next().toLowerCase(), 1, Integer::sum);
			}
		}	
		return histogram;
	}
	
	public Map<String, HashSet<Integer>> wordsByLine() throws FileNotFoundException {
		Map<String, HashSet<Integer>> wordsByLine = new HashMap<String, HashSet<Integer>>();
			
		try (Scanner in = new Scanner(file)) {
			int lineCount = 1;
			while (in.hasNextLine()) {
				String[] words = in.nextLine().split(" ");
				for (String word : words) {
					HashSet<Integer> lineSet = wordsByLine.getOrDefault(word, new HashSet<>());
					lineSet.add(lineCount);
					wordsByLine.put(word, lineSet);
				}
				lineCount++;
			}
		}
		return wordsByLine;
	}
}
