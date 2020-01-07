package ch04.ex01;

import java.util.Objects;
import ch04.ex03.XYZPoint;

public class LabeledPoint extends Point {
	private String label;
	
	public LabeledPoint(String label, double x, double y) {
		super(x, y);
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[label=" + label + "]"; 
	}
	
	@Override
	public boolean equals(Object otherObj) {
		if (!super.equals(otherObj)) return false;
		LabeledPoint other = (LabeledPoint) otherObj;
		return Objects.equals(label, other.label);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(label);
	}
	
	public static void illegalAccess(LabeledPoint point1, XYZPoint point2) {
		point1.x += point2.x;
	}
}
