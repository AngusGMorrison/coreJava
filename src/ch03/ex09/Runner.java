package ch03.ex09;

public class Runner {
	public static void main(String[] args) {
		Greeter greeter1 = new Greeter(2, "Angus");
		Greeter greeter2 = new Greeter(3, "Bianca");
		Thread thread1 = new Thread(greeter1);
		Thread thread2 = new Thread(greeter2::run);
		thread1.start();
		thread2.start();
	}
}
