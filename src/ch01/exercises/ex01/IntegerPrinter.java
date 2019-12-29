package ch01.exercises.ex01;

public class IntegerPrinter {
	public static void main(String[] args) {
		printInteger(45);
	}
	
	public static void printInteger(int intToPrint) {
		String binary = Integer.toString(intToPrint, 2);
		String octal = Integer.toString(intToPrint, 8);
		String hex = Integer.toString(intToPrint, 16);
		String floatingHex = calculateFloatingReciprocalHex(intToPrint);
		
		System.out.println("Binary: " + binary);
		System.out.println("Octal: " + octal);
		System.out.println("Hex: " + hex);
		System.out.printf("Reciprocal: " + floatingHex);
		
	}
	
	private static String calculateFloatingReciprocalHex(int intToConvert) {
		double reciprocal = 1.0 / intToConvert;
		String floatingHex = Double.toHexString(reciprocal);
		return floatingHex;
	}
		
}
