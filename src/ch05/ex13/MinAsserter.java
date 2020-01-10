package ch05.ex13;

public class MinAsserter {
	public static int min(int[] values) {
		Integer min = null;
		for (int i : values) {
			if (min == null) {
				min = i;
			} else {
				min = i < min ? i : min;
			}
		}
//		assertMin(min, values);
		return min;
	}
	
	private static void assertMin(int min, int[] values) {
		for (int i : values) {
			assert min <= i;
		}
	}
}
