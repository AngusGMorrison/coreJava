package ch03.ex01;

public interface Identified {
	default int getId() { return Math.abs(hashCode()); }
}
