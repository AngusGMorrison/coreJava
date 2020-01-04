package ch03.ex04;

public interface IntSequence {
	default boolean hasNext() { return true; }
	int next() throws Exception;
	
	static IntSequence of(int... values) {
		return new IntSequence() {
			private int index = 0;
			
			public int next() throws Exception {
				if (hasNext()) {
					int current = values[index];
					index += 1;
					return current;
				}
				throw new Exception("IntSequence has no next value");
			}
			
			public boolean hasNext() {
				return index < values.length;
			}
		};
	}
	
	static IntSequence constant(int constant) {
		return () -> constant;
	}
}
