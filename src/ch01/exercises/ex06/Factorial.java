package ch01.exercises.ex06;

import java.math.BigInteger;

public class Factorial {
	public static void main(String[] args) {
		// Long overflows to 0
		System.out.println(calculateBigIntFactorial(1000));
		System.out.println(calculateLongFactorial(1000));
	}
	
	private static BigInteger calculateBigIntFactorial(int n) {
		BigInteger acc = BigInteger.valueOf(1);
		for (int i = 1; i <= n; i++) {
			acc = acc.multiply(BigInteger.valueOf(i));
		}
		return acc;
	}
	
	private static long calculateLongFactorial(int n) {
		long acc = 1;
		for (int i = 1; i <= n; i++) {
			acc = Math.multiplyExact(acc, i);
		}
		return acc;
	}
}
