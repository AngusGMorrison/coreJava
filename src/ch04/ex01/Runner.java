package ch04.ex01;

import ch04.ex03.XYZPoint;

public class Runner {

	public static void main(String[] args) {
		LabeledPoint point = new LabeledPoint("point", 12.3, 20.3);
		System.out.println(point.getLabel() + " " + point.getX() + " " + point.getY());
		System.out.println(point.toString());
		
		LabeledPoint point2 = new LabeledPoint("point", 12.3, 20.3);
		System.out.println(point.equals(point2));
		System.out.println(point.hashCode() + " " + point2.hashCode());
		
		XYZPoint point3 = new XYZPoint(12.3, 20.3, 10);
		LabeledPoint.illegalAccess(point2, point3);
		System.out.println(point2.x);
		System.out.println(point3.x);
		
	}

}
