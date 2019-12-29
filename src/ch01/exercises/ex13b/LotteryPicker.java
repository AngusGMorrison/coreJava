package ch01.exercises.ex13b;

import java.util.Random;
import java.util.Arrays;

public class LotteryPicker {
	public static void main(String[] args) {
		drawNumbers();
	}
	
	private static void drawNumbers() {
		int[] pool = createPool();
		Random picker = new Random();
		int[] winningNumbers = new int[6];
		
		for (int i = 0; i < 6; i++) {
			winningNumbers[i] = drawNumber(pool, picker);
		}
		
		Arrays.sort(winningNumbers);
		System.out.println(Arrays.toString(winningNumbers));
	}
	
	private static int[] createPool() {
		int[] pool = new int[49];
		for (int i = 0; i < 49; i++) {
			pool[i] = i + 1;
		}
		return pool;
	}
	
	private static int drawNumber(int[] pool, Random picker) {
		int index = picker.nextInt(49);
		if (pool[index] == 0) {
			return drawNumber(pool, picker);		
		} else {
			int winningNumber = pool[index];
			pool[index] = 0;
			return winningNumber;
		}
	}
}
