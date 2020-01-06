package ch03.ex12;

import java.io.File;

public class FilenameMatcher {
	private static File directory;
	static {
		String home = System.getProperty("user.home");
		directory = new File(home + "/Documents");
	}

	public static void main(String[] args) {
		String[] filenames = findFilesWithExtension(".jpg");
		for (String name : filenames) {
			System.out.println(name);
		}

	}
	
	public static String[] findFilesWithExtension(String extension) {
		return directory.list((File dir, String name) -> name.contains(extension));
	}

}
