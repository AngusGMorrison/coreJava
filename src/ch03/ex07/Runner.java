package ch03.ex07;

public class Runner {
	public static void main(String[] args) {
		DigitSequence sequence = new DigitSequence(1234);
		while (sequence.hasNext()) {
			System.out.println(sequence.next());
		}
	}
}
