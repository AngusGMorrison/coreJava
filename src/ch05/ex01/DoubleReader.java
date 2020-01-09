package ch05.ex01;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class DoubleReader {
	public static void main(String[] args) {
		try {
			sumOfValues("src/ch05/ex01/resources/doubles.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public static double sumOfValues(String filename)
		throws FileNotFoundException, IllegalArgumentException {
			ArrayList<Double> doubles = readValues(filename);
			double sum = 0;
			for (double d : doubles) {
				sum += d;
			}
			return sum;
	}
	
	public static ArrayList<Double> readValues(String filename)
		throws FileNotFoundException, IllegalArgumentException {
			File file = new File(filename);
			if (!file.exists()) {
				throw new FileNotFoundException("File not found");
			}
			
			ArrayList<Double> doubles = new ArrayList<>();
			try (Scanner scanner = new Scanner(file)) {
				while (scanner.hasNext()) {
					if (!scanner.hasNextDouble()) {
						throw new IllegalArgumentException("File contains non-floating point values");
					}
					doubles.add(scanner.nextDouble());
				}
			}
			return doubles;
	}
}
