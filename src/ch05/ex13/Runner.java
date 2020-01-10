package ch05.ex13;

public class Runner {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int[] values = new int[1_000_000];
		MinAsserter.min(values);
		long finishTime = System.currentTimeMillis();
		System.out.println((finishTime - startTime));
	}

}
