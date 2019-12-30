package ch02.ex06;

/** A <code>Point</code> object represents a point in space with an x and y coordinate.
*
* @author angus
* @version 1.0
*/

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
