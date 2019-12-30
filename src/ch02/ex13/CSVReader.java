package ch02.ex13;

import java.util.Map;
import java.io.FileReader;
import com.opencsv.CSVReaderHeaderAware;

public class CSVReader {
	public static void main(String[] args) throws Exception {
		Map<String, String> values = new CSVReaderHeaderAware(new FileReader("test.csv")).readMap();
	}
}
