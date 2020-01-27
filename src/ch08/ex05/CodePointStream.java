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
		
	}
	
	public static IntStream streamOffsets(String s) {
		int codePointCount = s.codePointCount(0, s.length());
		return IntStream.iterate(
				0,
				prev -> prev < codePointCount,
				prev -> s.offsetByCodePoints(prev, 1));
	}

}
