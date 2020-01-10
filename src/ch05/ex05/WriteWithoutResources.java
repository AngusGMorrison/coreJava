package ch05.ex05;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteWithoutResources {
	private String outPath;
	
	public WriteWithoutResources(String outPath) {
		this.outPath = outPath;
	}
	
	public void write(String inPath) {
		Scanner in = null;
		PrintWriter out = null;
		try {
			in = new Scanner(inPath);
			out = new PrintWriter(outPath);
			while (in.hasNext()) {
				out.println(in.next().toLowerCase());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (SecurityException e) {
			System.out.println("PrintWriter doesn't have permissions to access that file");
		} catch (IllegalStateException e) {
			System.out.println("Scanner is closed");
		} finally {
			if (in != null) in.close();
			if (out != null) out.close();	
		}
	}
}
