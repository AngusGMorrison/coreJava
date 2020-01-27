package ch08.ex05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch08.ex05.CodePointStream;

public class FileTokens {
	
	public static void main(String[] args) {
		String contents = null;
		try {
			contents = Files.readString(Paths.get("./src/ch08/ex02/resources/warAndPeace.txt"));
		} catch (IOException e) {
			e.printStackTrace();	
		}
		
		System.out.println(countMostFrequentWords(contents).toString());
	}
	
	public static List<String> first100words(String s) {
		Stream<String> words = new Scanner(s).tokens().limit(100);
		return words
				.filter(w -> CodePointStream.isWord(w))
				.collect(Collectors.toList());
	}
	
	public static Map<String, Long> countMostFrequentWords(String s) {
		Stream<String> words = new Scanner(s).tokens();
		
		Map<String, Long> frequencies = words
				.filter(CodePointStream::isWord)
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Stream<Map.Entry<String, Long>> entryStream = frequencies.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(10);
		
		return entryStream.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
	
}
