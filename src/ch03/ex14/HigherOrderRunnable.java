package ch03.ex14;

public class HigherOrderRunnable {

	public static void main(String[] args) {
		Runnable task1 = () -> System.out.println("task 1");
		Runnable task2 = () -> System.out.println("task 2");
		Runnable[] runnables = { task1, task2 };
		Runnable merged = mergeRunnables(runnables);
		merged.run();
	}
	
	public static Runnable mergeRunnables(Runnable[] runnables) {
		return () -> {
			for (Runnable task : runnables) {
				task.run();
			}
		};
	}

}
