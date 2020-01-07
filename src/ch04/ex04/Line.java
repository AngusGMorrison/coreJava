package ch04.ex04;

public class Line extends Shape {
	private Point to;
	
	public Line(Point from, Point to) {
		super(from);
		this.to = to;
	}
	
	public Point getFrom() {
		return origin;
	}
	
	public Point getTo() {
		return to;
	}

	@Override
	public Point getCenter() {
		double x = to.getX() - origin.getX();
		double y = to.getY() - origin.getY();
		return new Point(x, y);
	}

}
