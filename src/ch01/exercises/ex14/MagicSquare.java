package ch01.exercises.ex14;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MagicSquare {
	private static final Scanner in = new Scanner(System.in);
	private static int[][] square;
	
	public static void main(String[] args) {
		getSquare();
		if (isMagicSquare()) {
			System.out.println("You've entered a magic square!");
		} else {
			System.out.println("That's not a magic square.");
		}
	}
	
	private static void getSquare() {
		int[] row1 = getFirstRow();
		square = new int[row1.length][row1.length];
		square[0] = row1;
		for (int i = 1; i < square.length; i++) {
			square[i] = getNextRow(square.length);
		}
	}
	
	private static int[] getFirstRow() {
		Pattern pattern = Pattern.compile("^([0-9]+ )+[0-9]+$");
		System.out.println("Enter a row of integers, separated by spaces:");
		String input = in.nextLine();
		Matcher matcher = pattern.matcher(input);
		return matcher.matches() ? getRowFromInput(input) : getFirstRow(); 
	}
	
	private static int[] getNextRow(int length) {
		System.out.println("Enter " + length + " integers, separated by spaces:");
		Pattern pattern = Pattern.compile("^([0-9]+ ){" + (length - 1) + "}[0-9]+$");
		String input = in.nextLine();
		Matcher matcher = pattern.matcher(input);
		return matcher.matches() ? getRowFromInput(input) : getNextRow(length);
	}
	
	private static int[] getRowFromInput(String input) {
		String[] rowStrings = input.split(" ");
		int[] row = new int[rowStrings.length];
		for (int i = 0; i < row.length; i++) {
			row[i] = Integer.parseInt(rowStrings[i]);
		}
		return row;
	}
	
	private static boolean isMagicSquare() {
		int targetTotal = calculateRowTotal(square[0]);
		return(
			hasMagicRows(targetTotal) &&
			hasMagicColumns(targetTotal) &&
			hasMagicDiagonals(targetTotal)
		);
	}
	
	private static boolean hasMagicRows(int targetTotal) {
		// i = 1 because targetTotal was already calculated from square[0]
		for (int i = 1; i < square.length; i++) {
			if (calculateRowTotal(square[i]) != targetTotal) return false;
		}
		return true;
	}
	
	private static int calculateRowTotal(int[] row) {
		int total = 0;
		for (int i = 0; i < row.length; i++) {
			total += row[i];
		}
		return total;
	}
	
	private static boolean hasMagicColumns(int targetTotal) {
		for (int col = 0; col < square.length; col++) {
			for (int row = 0; row < square.length; row++) {
				if (calculateColumnTotal(col) != targetTotal) return false;
			}
		}
		return true;
	}
	
	private static int calculateColumnTotal(int col) {
		int total = 0;
		for (int row = 0; row < square.length; row++) {
			total += square[row][col];
		}
		return total;
	}
	
	private static boolean hasMagicDiagonals(int targetTotal) {
		return(
			targetTotal == calculateLeftDiagonal() &&
			targetTotal == calculateRightDiagonal()
		);
	}
	
	private static int calculateLeftDiagonal() {
		int total = 0;
		for (int i = 0; i < square.length; i++) {
			total += square[i][i];
		}
		return total;
	}
	
	private static int calculateRightDiagonal() {
		int total = 0;
		for (int i = (square.length - 1); i >= 0; i--) {
			total += square[i][i];
		}
		return total;
	}
}
