package ch06.ex03;

public class Runner {
	public static void main(String[] args) {
		Table<String, Integer> table = new Table<>();
		
		table.put("One", 1);
		assert(table.get("One") == 1);
		
		table.put("One", 2);
		assert(table.get("One") == 2);
		
		assert(table.remove("One") == 2);
		assert(table.get("One") == null);
	}
}
