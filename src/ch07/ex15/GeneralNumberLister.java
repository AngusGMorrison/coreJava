package ch07.ex15;

import java.util.AbstractList;
import java.util.List;
import java.util.function.IntFunction;
import ch07.ex13.Cache;

public class GeneralNumberLister {
	public static <R> List<R> createList(IntFunction<R> function) {
		
		return new AbstractList<>() {
			private Cache<Integer, R> cache = new Cache(100);
			
			@Override
			public R get(int index) {
				if (cache.containsKey(index)) {
					return cache.get(index);
				}
				
				cache.put(index, function.apply(index));
				return cache.get(index);
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
