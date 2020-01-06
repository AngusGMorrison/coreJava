package ch03.ex16;

import java.util.Random;

public class RandomSequenceGenerator {
	private static Random generator = new Random();
	
	private static class RandomSequence implements IntSequence {
		int low;
		int high;
		
		private RandomSequence(int low, int high) {
			this.low = low;
			this.high = high;
		}
		
		public int next() { return low + generator.nextInt(high - low + 1); }
		public boolean hasNext() { return true; }
	}
	
	public static IntSequence randomInts(int low, int high) {
		return new RandomSequence(low, high);
	}
}
