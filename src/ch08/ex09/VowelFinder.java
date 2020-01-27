package ch08.ex09;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class VowelFinder {
	public static void main(String[] args) {
		try {
			Stream<String> words = new Scanner(Paths.get("/usr/share/dict/words")).tokens();
			for (String word : findWordsAllVowels(words)) {
				System.out.println(word);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String[] findWordsAllVowels(Stream<String> s) {
		return s.filter(word -> word.matches("^(?=\\w*?a)(?=\\w*?e)(?=\\w*?i)(?=\\w*?o)(?=\\w*?u)[a-zA-Z]+$"))
				.toArray(String[]::new);
	}
}
