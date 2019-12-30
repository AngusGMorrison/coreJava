package ch02.ex05;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Point translate(int dX, int dY) {
		int translatedX = x + dX;
		int translatedY = y + dY;
		return new Point(translatedX, translatedY);
	}
	
	public Point scale(int factor) {
		int scaledX = x * factor;
		int scaledY = y * factor;
		return new Point(scaledX, scaledY);
	}
}
