package ch03.ex04;

public class Runner {
	public static void main(String[] args) {
		IntSequence sequence = IntSequence.of(1, 2, 3);
		try {
			System.out.println(sequence.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
