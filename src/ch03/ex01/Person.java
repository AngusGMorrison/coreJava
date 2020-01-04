package ch03.ex01;

public interface Person {
	String getName();
	default int getId() { return 0; }
}
