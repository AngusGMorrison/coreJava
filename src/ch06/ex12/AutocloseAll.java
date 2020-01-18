package ch06.ex12;

import java.util.ArrayList;

public class AutocloseAll {
	public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
		Exception closeException = null;
				
		for (T elem : elems) {
			try {
				elem.close();
			} catch (Exception ex) {
				closeException = ex;
			}
		}
		
		if (closeException != null) {
			throw closeException;
		}
	}
}
