package ch08.ex02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WarAndPeace {
	String warAndPeace;
	List<String> words;
	
	public static void main(String[] args) {
		WarAndPeace wap = new WarAndPeace();
		wap.timeSerial();
		wap.timeParallel();
	}
	
	public WarAndPeace() {
		try {
			warAndPeace = new String(Files.readAllBytes(Paths.get("./src/ch08/ex02/resources/warAndPeace.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		words = List.of(warAndPeace.split("\\PL+"));
	}
	
	public void timeSerial() {
		long startTime = System.currentTimeMillis();
		long count = words.stream()
			.filter(w -> w.length() > 12)
			.count();
		long endTime = System.currentTimeMillis();
		System.out.println("Serial: " + (endTime - startTime) + " (" + count + " words)");
	}
	
	public void timeParallel() {
		long startTime = System.currentTimeMillis();
		long count = words.parallelStream()
			.filter(w -> w.length() > 12)
			.count();
		long endTime = System.currentTimeMillis();
		System.out.println("Parallel: " + (endTime - startTime) + " (" + count + " words)");
	}
	
}
