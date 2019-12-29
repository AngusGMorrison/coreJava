package ch01.exercises.ex11;

public class NonAsciiPrinter {
	public static void main(String[] args) {
		printUnicodeChars("Helló₱㊕");
	}
	
	private static void printUnicodeChars(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if ((int) ch > 127) {
				String unicode = getUnicode(ch);
				System.out.println(ch + " (" + unicode + ")");
			}
		}
	}
	
	private static String getUnicode(char ch) {
		String hexString = Integer.toHexString(ch);
		while (hexString.length() < 4) {
			hexString = "0" + hexString;
		}
		String unicode = "\\u" + hexString;
		return unicode;
	}
}
