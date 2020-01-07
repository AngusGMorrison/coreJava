package ch04.ex04;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(Point topLeft, double width, double height) {
		super(topLeft);
		this.width = width;
		this.height = height;
	}
	
	public Point getTopLeft() {
		return origin;
	}

	@Override
	public Point getCenter() {
		double x = origin.getX() + width / 2;
		double y = origin.getY() - height / 2;
		return new Point(x, y);
	}
	
	@Override
	public Rectangle clone() {
		try {
			Point point = origin.clone();
			Rectangle cloned = new Rectangle(point, width, height);
			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
