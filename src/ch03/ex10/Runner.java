package ch03.ex10;

public class Runner {
	public static void main(String[] args) {
		Runnable run1 = () -> System.out.println("run1");
		Runnable run2 = () -> System.out.println("run2");
		Runnable run3 = () -> System.out.println("run3");
		
		runTogether(run1, run2, run3);
		runInOrder(run1, run2, run3);
	}
	
	public static void runTogether(Runnable... tasks) {
		for (Runnable task : tasks) {
			Thread thread = new Thread(task);
			thread.start();
		}
	}
	
	public static void runInOrder(Runnable... tasks) {
		for (Runnable task : tasks) {
			task.run();
		}
	}
}
