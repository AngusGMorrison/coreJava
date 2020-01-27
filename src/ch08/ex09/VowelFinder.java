package ch08.ex09;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VowelFinder {
	
	public static void main(String[] args) {
		for (String word : findWordsAllVowels(getStream())) {
			System.out.println(word);
		}
		
		System.out.println(avgWordLength(getStream()));
		
		System.out.println(wordsOfMaxLength(getStream()).toString());
		
	}
	
	public static String[] findWordsAllVowels(Stream<String> s) {
		return s.filter(word -> word.matches("^(?=\\w*?a)(?=\\w*?e)(?=\\w*?i)(?=\\w*?o)(?=\\w*?u)[a-zA-Z]+$"))
				.toArray(String[]::new);
	}
	
	public static int avgWordLength(Stream<String> s) {
		return (int) getSummaryStatistics(s).getAverage();
	}
	
	public static List<String> wordsOfMaxLength(Stream<String> s) {
		String[] words = s.toArray(String[]::new);
		Supplier<Stream<String>> streamSupplier = () -> Stream.of(words);
		
		int max = getSummaryStatistics(streamSupplier.get()).getMax();
		return streamSupplier.get().filter(w -> w.length() == max)
				.collect(Collectors.toList());
	}
	
	public static IntSummaryStatistics getSummaryStatistics(Stream<String> s) {
		return s.collect(Collectors.summarizingInt(String::length));
	}
	
	public static Stream<String> getStream() {
		Stream<String> stream = null;
		try {
			stream = new Scanner(Paths.get("/usr/share/dict/words")).tokens();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stream;
	}

}
