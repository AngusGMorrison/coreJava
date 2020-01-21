package ch07.ex04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapVHashMap {
	public static void main(String[] args) {
		HashMap<String, HashSet<Integer>> hashMap = new HashMap<>();
		test(hashMap);
	}
	
	public static <T extends Set<Integer>> void test(Map<String, T> map) {
		// Test compilation
	}
}
