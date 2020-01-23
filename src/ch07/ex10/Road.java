package ch07.ex10;

public class Road {
	private final City source;
	private final City destination;
	private final int distance;
	
	public Road(City source, City destination, int distance) {
		this.source = source;
		this.destination = destination;
		this.distance = distance;
	}
	
	public City getSource() {
		return source;
	}
	
	public City getDestination() {
		return destination;
	}
	
	public int getDistance() {
		return distance;
	}
}
