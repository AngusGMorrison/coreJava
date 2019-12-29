package ch01.exercises.ex08;

public class SubstringPrinter {
	public static void main(String[] args) {
		printSubstrings("Hello World");
	}
	
	private static void printSubstrings(String input) {
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.substring(i));
		}
	}
}
