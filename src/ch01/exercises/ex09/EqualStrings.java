package ch01.exercises.ex09;

public class EqualStrings {
	public static void main(String[] args) {
		String str1 = "Hello";
		String stringToReplace = "Hello World";
		String str2 = stringToReplace.replace(" World", "");
		System.out.println(str1.equals(str2));
		System.out.println(str1 != str2);
	}
}
