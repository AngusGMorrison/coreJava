package ch01.exercises.ex04;

public class MinMaxDouble {
	public static void main(String[] args) {
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(getMaxUsingNextDown());
	}
	
	public static double getMaxUsingNextDown() {
		return Math.nextDown(Double.POSITIVE_INFINITY);
	}
}