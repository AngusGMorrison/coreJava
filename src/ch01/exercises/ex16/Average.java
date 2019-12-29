package ch01.exercises.ex16;

public class Average {
	public static void main(String[] args) {
		System.out.println(average(12, 54, 3, 9));
	}
	
	public static double average(double first, double... rest) {
		int count = 1 + rest.length;
		double total = first;
		for (double n : rest) {
			total += n;
		}
		return total / count;
	}
}
