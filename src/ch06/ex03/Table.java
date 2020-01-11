package ch06.ex03;

import java.util.ArrayList;
import java.util.Objects;

public class Table<K, V> {
	
	private class Entry {
		K key;
		V value;
		
		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	private ArrayList<Entry> data;
	
	public V get(K key) {
		Entry entry = find(key);
		if (entry == null) return null;
		return entry.value;
	}
	
	public void put(K key, V value) {
		Entry entry = find(key);
		if (entry == null) {
			createEntry(key, value);
		} else {
			entry.value = value;
		}
	}
	
	private void createEntry(K key, V value) {
		Entry newEntry = new Entry(key, value);
		data.add(newEntry);
	}
	
	public V remove(K key) {
		Entry entry = find(key);
		if (entry == null) return null;
		
		int index = data.indexOf(entry);
		data.remove(index);
		return entry.value;
	}
	
	private Entry find(K key) {
		for (Entry entry : data) {
			if (Objects.equals(entry.key, key)) {
				return entry;
			}
		}
		return null;
	}
	
}
