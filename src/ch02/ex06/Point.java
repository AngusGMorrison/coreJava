package ch02.ex06;

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
	
	public void translate(int dX, int dY) {
		x += dX;
		y += dY;
	}
	
	public void scale(int factor) {
		x *= factor;
		y *= factor;
	}
}
