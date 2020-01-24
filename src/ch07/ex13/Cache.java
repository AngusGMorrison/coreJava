package ch07.ex13;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache<K, V> extends LinkedHashMap<K, V> {
	private final int MAX_SIZE;
	private Map<K, V> map;
	
	public Cache(int maxSize) {
		this.MAX_SIZE = maxSize;
		map = new LinkedHashMap<>();
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return map.size() > MAX_SIZE;
	}
}
