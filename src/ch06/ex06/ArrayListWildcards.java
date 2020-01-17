package ch06.ex06;

import java.util.ArrayList;

public class ArrayListWildcards {
	public static <E> void appendExtends(ArrayList<E> receiver, ArrayList<? extends E> listToAppend) {
		receiver.addAll(listToAppend);
	}
	
	public static <E> void appendSuper(ArrayList<? super E> receiver, ArrayList<E> listToAppend) {
		receiver.addAll(listToAppend);
	}
}
