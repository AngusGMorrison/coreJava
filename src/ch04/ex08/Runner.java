package ch04.ex08;

import static java.lang.System.out;
import java.util.ArrayList;

public class Runner {
	
	private class InnerClass {}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		classPrinter(array);
		ArrayList<String> arrayList = new ArrayList<>();
		classPrinter(arrayList);
		classPrinter('c');
		classPrinter(InnerClass.class);

	}
	
	private static void classPrinter(Object obj) {
		Class<?> cl = obj.getClass();
		out.println(cl.getCanonicalName());
		out.println(cl.getSimpleName());
		out.println(cl.getTypeName());
		out.println(cl.getName());
		out.println(cl.toString());
		out.println(cl.toGenericString() + "\n\n");
	}

}
