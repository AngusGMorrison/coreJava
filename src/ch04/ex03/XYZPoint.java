package ch04.ex03;

public class XYZPoint extends Point {
	private double z;
	
	public XYZPoint(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	public double getZ() {
		return z;
	}
}
