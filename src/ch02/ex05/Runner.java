package ch02.ex05;

public class Runner {
	public static void main(String[] args) {
		Point p1 = new Point(1, 1);
		Point p2 = p1.translate(4, 4);
		Point p3 = p1.scale(2).translate(8, 8);
		System.out.printf("%d, %d\n", p1.getX(), p1.getY());
		System.out.printf("%d, %d\n", p2.getX(), p2.getY());
		System.out.printf("%d, %d\n", p3.getX(), p3.getY());
	}
}
