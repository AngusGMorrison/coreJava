package ch07.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SentenceShuffler {
	private List<String> words;
	
	public SentenceShuffler(String sentence) {
		this.words = new ArrayList<>(Arrays.asList(sentence.split(" ")));
		if (words.size() < 2) throw new IllegalArgumentException("Sentence must be at least two words");
	}
	
	public String getSentence() {
		return String.join(" ", words);
	}
	
	public void shuffle() {
		List<String> sublist = words.subList(1, words.size() - 1);
		Collections.shuffle(sublist);
	}
}
