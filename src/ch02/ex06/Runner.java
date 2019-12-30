package ch02.ex06;

public class Runner {
	public static void main(String[] args) {
		Point p1 = new Point(1, 1);
		System.out.printf("%d, %d\n", p1.getX(), p1.getY());
		p1.translate(4, 4);
		System.out.printf("%d, %d\n", p1.getX(), p1.getY());
		p1.scale(2);
		p1.translate(8, 8);
		System.out.printf("%d, %d\n", p1.getX(), p1.getY());
	}
}
