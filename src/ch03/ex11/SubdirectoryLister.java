package ch03.ex11;

import java.io.File;
import java.io.FileFilter;

public class SubdirectoryLister {

	public static void main(String[] args) {
		String home = System.getProperty("user.home");
		File directory = new File(home);
		System.out.println(lambdaFilter(directory).length);
		System.out.println(methodFilter(directory).length);
		System.out.println(anonClassFilter(directory).length);
	}
	
	public static File[] lambdaFilter(File directory) {
		return directory.listFiles((File file) -> file.isDirectory());
	}
	
	public static File[] methodFilter(File directory) {
		return directory.listFiles(File::isDirectory);
	}
	
	public static File[] anonClassFilter(File directory) {
		FileFilter filter = new FileFilter() {
			public boolean accept(File file) { return file.isDirectory(); }
		};
		return directory.listFiles(filter);
	}

}
