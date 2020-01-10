package ch05.ex11;

public class FactorialStackTracer {
	
	public static void main(String args[]) {
		trace(5);
	}
	
	public static long trace(long i) {
		long result = i;
		if (i > 1) {
			result = i * trace(i - 1);
		}
		Exception e = new Exception();
		e.printStackTrace();
		return result;
	}
}
