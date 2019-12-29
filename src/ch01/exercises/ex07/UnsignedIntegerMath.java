package ch01.exercises.ex07;

import java.util.Scanner;

public class UnsignedIntegerMath {
	public static void main(String[] args) {
		int n = (int) getLongInUnsignedIntRange();		
		int m = (int) getLongInUnsignedIntRange();
		compute(n, m);
	}
	
	private static long getLongInUnsignedIntRange() {
		System.out.println("Enter a number between 0 and 4,294,967,295:");
		Scanner in = new Scanner(System.in);
		long l = in.nextLong();
		if (l < 0L || l > 4294967295L) {
			getLongInUnsignedIntRange();
		}
		
		return l;
	}
	
	private static int compute(int n, int m) {
		System.out.printf("%d\n", n + m);
		System.out.printf("%d\n", Math.max(n, m) - Math.min(m, n));
		System.out.printf("%d\n", Integer.valueOf(n) * Integer.valueOf(m));
		System.out.printf("%d\n", Integer.divideUnsigned(n, m));
		System.out.printf("%d\n", Integer.remainderUnsigned(n, m));
		return n;
	}
}
