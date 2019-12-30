package ch02.ex05;

/** A <code>Point</code> object represents a point in space with an x and y coordinate.
* @author angus
* @version 1.0
*/

public class Point {
	private int x;
	private int y;
	
	/**
	 * Initialize a point with an x- and y- coordinate.
	 * @param x the x-coordinate
	 * @param y the y-coordinate
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Initialize a point with x- and y-coordinates set to the origin.
	 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Get the x-coordinate of the point.
	 * @return the x-coordinate
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Get the y-coordinate of the point.
	 * @return the y-coordinate
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Create a new point by modifying the x- and y-coordinates by the increments provided.
	 * @param dX the x-axis increment
	 * @param dY the y-axis increment
	 * @return the new <code>Point</code>
	 */
	public Point translate(int dX, int dY) {
		int translatedX = x + dX;
		int translatedY = y + dY;
		return new Point(translatedX, translatedY);
	}
	
	/**
	 * Create a new point by multiplying the x- and y-coordinates by the factor provided.
	 * @param factor the factor by which to scale both coordinates
	 * @return the new <code>Point</code>
	 */
	public Point scale(int factor) {
		int scaledX = x * factor;
		int scaledY = y * factor;
		return new Point(scaledX, scaledY);
	}
}
