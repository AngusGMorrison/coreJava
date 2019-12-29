package ch01.exercises.ex03;

public class MaxCalculator {
	public static void main(String[] args) {
		System.out.println(conditionalMax(5, 117, -4));
		System.out.println(builtinMax(5, 117, -4));
	}
	
	private static int conditionalMax(int first, int second, int third) {
		int firstMax = first > second ? first : second;
		int secondMax = second > third ? second : third;
		int max = firstMax > secondMax ? firstMax : secondMax;
		return max;
	}
	
	private static int builtinMax(int first, int second, int third) {
		int firstMax = Math.max(first, second);
		int secondMax = Math.max(second, third);
		int max = Math.max(firstMax, secondMax);
		return max;
	}
}
