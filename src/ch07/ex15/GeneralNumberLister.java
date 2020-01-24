package ch07.ex15;

import java.util.AbstractList;
import java.util.List;
import java.util.function.IntFunction;

public class GeneralNumberLister {
	public static <R> List<R> createList(IntFunction<R> function) {
		
		return new AbstractList<>() {
			@Override
			public R get(int index) {
				return function.apply(index);
			}
			
			@Override
			public int size() {
				throw new UnsupportedOperationException();
			}
			
			@Override
			public R[] toArray() {
				throw new UnsupportedOperationException();
			}
		};
	}
}
