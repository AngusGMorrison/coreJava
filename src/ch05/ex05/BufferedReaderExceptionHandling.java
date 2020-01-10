package ch05.ex05;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.IOException;

public class BufferedReaderExceptionHandling {

	public static void main(String[] args) {
		
		// 1. Catch the exception in the finally clause
		BufferedReader in = null;
		try {
			in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			//Read from in
		} catch (IOException ex) {
			System.err.println("Caught IOException: " + ex.getMessage());
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				System.err.println("Caught IOException: " + ex.getMessage());
			}
		}
		
		// 2. A try/catch statement containing a try finally statement
		BufferedReader in = null;
		try {
			try {
				in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
				//Read from in
			} finally {
				if (in != null) {
					in.close();
				}
			}
		} catch (IOException ex) {
			System.err.println("Caught IOException: " + ex.getMessage());
		}
		
		// 3. A try-with-resources statement
		try (BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			//Read from in
		} catch (IOException ex) {
			System.err.println("Caught IOException: " + ex.getMessage());
		}
	}
	

}
