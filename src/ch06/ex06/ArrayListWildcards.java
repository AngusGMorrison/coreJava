package ch06.ex06;

import java.util.ArrayList;

public class ArrayListWildcards {
	public static <E> void appendExtends(ArrayList<E> destination, ArrayList<? extends E> source) {
		destination.addAll(source);
	}
	
	public static <E> void appendSuper(ArrayList<? super E> destination, ArrayList<E> source) {
		destination.addAll(source);
	}
}
