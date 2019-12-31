package ch02.ex16;

public class Runner {
	public static void main(String[] args) {
		Queue queue = new Queue();
		String first = queue.add("node 1");
		assert first.equals("node 1");
		assert queue.length() == 1;
		queue.add("node 2");
		first = queue.remove();
		assert first.equals("node 1");
		assert queue.length() == 1;
	}
}
