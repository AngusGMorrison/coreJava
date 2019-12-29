package ch01.exercises.ex15;

import java.util.ArrayList;

public class PascalsTriangle {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> triangle = buildTriangle(4);
		printTriangle(triangle);
	}
	
	private static ArrayList<ArrayList<Integer>> buildTriangle(int height) {
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
		
		for (int i = 0; i < height; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			row.add(1);
			
			for (int j = 1; j < i; j++) {
				ArrayList<Integer> previousRow = triangle.get(i - 1);
				int newEntry = previousRow.get(j - 1) + previousRow.get(j);
				row.add(newEntry);
			}
			
			if (i > 0) row.add(1);
			triangle.add(row);
		}
		
		return triangle;
	}
	
	private static void printTriangle(ArrayList<ArrayList<Integer>> triangle) {
		for (ArrayList<Integer> list : triangle) {
			for (int n : list) {
				System.out.print(n + " ");
			}
			System.out.println("");
		}
	}
}
