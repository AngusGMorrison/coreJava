package ch05.ex01;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DoubleReader {
	public static void main(String[] args) {
		try {
			ArrayList<Double> doubles = readValues("src/ch05/ex01/resources/doubles.txt");
		} catch (FileNotFoundException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public static ArrayList<Double> readValues(String filename)
		throws FileNotFoundException, IllegalArgumentException {
			File file = new File(filename);
			if (!file.exists()) {
				throw new FileNotFoundException("File not found");
			}
			
			ArrayList<Double> doubles = new ArrayList<>();
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				if (!scanner.hasNextDouble()) {
					throw new IllegalArgumentException("File contains non-floating point values");
				}
				doubles.add(scanner.nextDouble());
			}
			return doubles;
	}
}
