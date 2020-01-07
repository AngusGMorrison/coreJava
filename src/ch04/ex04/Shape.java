package ch04.ex04;

public abstract class Shape {
	protected Point origin;
	
	public Shape(Point origin) {
		this.origin = origin;
	}
	
	public void moveBy(double dx, double dy) {
		origin.setCoords(origin.getX() + dx, origin.getY() + dy);
	}
	
	public abstract Point getCenter();
}