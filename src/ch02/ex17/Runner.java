package ch02.ex17;

public class Runner {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add("node 1");
		queue.add("node 2");
		queue.add("node 3");
		
		Queue.Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
