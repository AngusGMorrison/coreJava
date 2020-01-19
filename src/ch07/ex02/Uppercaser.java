package ch07.ex02;

import java.util.List;
import java.util.ArrayList;

public class Uppercaser {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(List.of("angus", "bianca"));
		upperWithReplaceAll(list);
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	public static void upperWithIterator(ArrayList<String> list) {
		for (String string : list) {
			string.toUpperCase();
		}
	}
	
	public static void upperWithIndex(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).toUpperCase();
		}
	}
	
	public static void upperWithReplaceAll(ArrayList<String> list) {
		list.replaceAll((String string) -> string.toUpperCase());
	}
}
