package ch08.ex15;

import java.util.stream.Stream;

public class DoubleAverage {
	
	public static void main(String[] args) {
		Stream<Double> doubleStream = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0);
	}
	
	public static double average(Stream<Double> doubles) {
		AveragePair totalAndCount = doubles.reduce(
			new AveragePair(),
			(acc, el) -> {
				acc.add(el);
				return acc;
			},
			(pair1, pair2) -> new AveragePair(pair1.getTotal() + pair2.getTotal(), pair1.getCount() + pair2.getCount())
		);
		return totalAndCount.average();
	}
	
	private static class AveragePair {
		private double total;
		private int count;
		
		public AveragePair() {
			this.total = 0.0;
			this.count = 0;
		}
		
		public AveragePair(Double total, int count) {
			this.total = total;
			this.count = count;
		}
		
		public double getTotal() {
			return total;
		}
		
		public int getCount() {
			return count;
		}
		
		public void add(Double value) {
			total += value;
			count++;
		}
		
		public double average() {
			return total / count;
		}
	}
	
}
