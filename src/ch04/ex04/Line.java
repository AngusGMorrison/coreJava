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
	
	public void moveBy(double dx, double dy) {
		super.moveBy(dx, dy);
		to.setCoords(to.getX() + dx, to.getY() + dy);		
	}

	@Override
	public Point getCenter() {
		double x = to.getX() - origin.getX();
		double y = to.getY() - origin.getY();
		return new Point(x, y);
	}
	
	@Override
	public Line clone() {
		try {
			Line cloned = new Line(origin.clone(), to.clone());
			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
		
	}

}
