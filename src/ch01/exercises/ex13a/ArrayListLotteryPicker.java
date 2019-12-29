package ch01.exercises.ex13a;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class ArrayListLotteryPicker {
	public static void main(String[] args) {
		drawNumbers();
	}
	
	private static void drawNumbers() {
		ArrayList<Integer> pool = createPool();
		Random picker = new Random();
		ArrayList<Integer> winningNumbers = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			winningNumbers.add(drawNumber(pool, picker));
		}
		printWinningNumbers(winningNumbers);
	}
	
	private static ArrayList<Integer> createPool() {
		ArrayList<Integer> pool = new ArrayList<>();
		for (int i = 1; i < 50; i++) {
			pool.add(i);
		}
		return pool;
	}
	
	private static int drawNumber(ArrayList<Integer> pool, Random picker) {
		int index = picker.nextInt(pool.size());
		int winningNumber = pool.get(index);
		pool.remove(index);
		return winningNumber;
	}
	
	private static void printWinningNumbers(ArrayList<Integer> winningNumbers) {
		Collections.sort(winningNumbers);
		for (int winningNumber : winningNumbers) {
			System.out.println(winningNumber);
		}
	}
	
}
