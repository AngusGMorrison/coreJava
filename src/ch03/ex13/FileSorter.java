package ch03.ex13;

import java.io.File;
import java.util.Comparator;
import java.util.Arrays;

public class FileSorter {

	public static void main(String[] args) {
		File directory = new File(System.getProperty("user.home") + "/Documents");
		File[] children = directory.listFiles();
		sortWithLambda(children);
		for (File file : children) {
			System.out.println(file.getName());
		}
	}
	
	public static void sortWithComparator(File[] files) {
		Arrays.sort(files, Comparator
			.comparing((File file) -> file.isFile())
			.thenComparing((File file) -> file.getName().toLowerCase()));
	}
	
	public static void sortWithLambda(File[] files) {
		Arrays.sort(files, (file1, file2) -> {
			if (file1.isDirectory() && !file2.isDirectory()) {
				return -1;
			} else if (!file1.isDirectory() && file2.isDirectory()) {
				return 1;
			} else {
				return file1.getName().toLowerCase().compareTo(file2.getName().toLowerCase());
			}
		});
	}

}
