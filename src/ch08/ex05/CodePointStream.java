package ch08.ex05;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class CodePointStream {
	
	public static void main(String[] args) {
		String testString = "Eversong Woods";
		ArrayList<String> substrings = new ArrayList<>();
		
		IntStream offsets = streamOffsets(testString);
		offsets.forEach(offset -> substrings.add(testString.substring(offset, testString.offsetByCodePoints(offset, 1))));
		
		System.out.println(substrings.toString());
		
		System.out.println(isWord("1234"));
		System.out.println(isWord("hello"));
		
		System.out.println(isJavaIdentifier("1greatName"));
		System.out.println(isJavaIdentifier("greatName1"));
		
	}
	
	public static IntStream streamOffsets(String s) {
		int codePointCount = s.codePointCount(0, s.length());
		return IntStream.iterate(
				0,
				prev -> prev < codePointCount,
				prev -> s.offsetByCodePoints(prev, 1));
	}
	
	public static boolean isWord(String s) {
		return s.codePoints().allMatch(c -> Character.isAlphabetic(c));
	}
	
	public static boolean isJavaIdentifier(String s) {
		if (s.substring(0, 1).codePoints().noneMatch(c -> Character.isJavaIdentifierStart(c))) {
			return false;
		}
		return s.substring(1).codePoints().allMatch(c -> Character.isJavaIdentifierPart(c));
	}

}
