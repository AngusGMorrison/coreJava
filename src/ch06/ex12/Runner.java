package ch06.ex12;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			list.add(i);
		}
		
		ArrayList<Integer> output = new ArrayList<>();
				
		MinMaxToList.minMax(list, Integer::compareTo, output);
		
		assert(output.get(0) == 1);
		assert(output.get(1) == 5);
	}

}
