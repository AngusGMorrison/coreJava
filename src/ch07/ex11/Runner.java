package ch07.ex11;

public class Runner {
	public static void main(String[] args) {
		SentenceShuffler shuffler = new SentenceShuffler("Hello my name is Angus and I am 27");
		shuffler.shuffle();
		System.out.println(shuffler.getSentence());
	}
}
