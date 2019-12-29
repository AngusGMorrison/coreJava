package ch01.exercises.ex10;

import java.util.Random;

public class RandomStringGenerator {
	public static void main(String[] args) {
		Random generator = new Random();
		long l = generator.nextLong();
		System.out.println(Long.toString(l, 36));
	}
}
