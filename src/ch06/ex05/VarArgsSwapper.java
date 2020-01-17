package ch06.ex05;

import java.util.Collections;

public class VarArgsSwapper {
	public static void main(String[] args) {
//		double[] doubles = { 1.5, 2.0, 3.0 };
		Double[] result = VarArgsSwapper.<Double>swap(0, 1, 1.5, 2.0, 3.0);
	}
	
	public static <T> T[] swap(int i, int j, T... values) {
		T temp = values[i];
		values[i] = values[j];
		values[j] = temp;
		return values;
	}
}
