package ch03.ex01;

import java.util.Objects;

public interface Measurable {
	double getMeasure();
	
	static double average(Measurable[] objects) {
		double sum = 0;
		for (Measurable object : objects) {
			sum += object.getMeasure();
		}
		return sum / objects.length;
	}
	
	static Measurable largest(Measurable[] objects) {
		Measurable largest = null;
		for (Measurable object : objects) {
			if (Objects.isNull(largest)) {
				largest = object;
			} else if (object.getMeasure() > largest.getMeasure()) {
				largest = object;
			}
		}
		return largest;
	}
}
