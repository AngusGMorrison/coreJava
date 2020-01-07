package ch04.ex04;

public class Circle extends Shape {
	private double radius;
	
	public Circle(Point point, double radius) {
		super(point);
		this.radius = radius;
	}

	@Override
	public Point getCenter() {
		return origin;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public Circle clone() {
		try {
			Point point = origin.clone();
			Circle cloned = new Circle(point, radius);
			return cloned;
		} catch (CloneNotSupportedException e) {
			return null; //Can't happen
		}
	}
}
