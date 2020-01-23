package ch07.ex10;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

public class Vertex implements Comparable<Vertex> {
	private String id;
	private List<Vertex> shortestPath = new LinkedList<>();
	private Double distance = Double.POSITIVE_INFINITY;
	private Map<Vertex, Double> adjacentVertices = new HashMap<>();
	
	
	public Vertex(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public List<Vertex> getShortestPath() {
		return shortestPath;
	}
	
	public void setShortestPath(List<Vertex> path) {
		shortestPath = path;
	}
	
	public Double getDistance() {
		return distance;
	}
	
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	
	public void addAdjacentVertex(Vertex vertex, Double edgeWeight) {
		adjacentVertices.put(vertex, edgeWeight);
	}
	
	public Map<Vertex, Double> getAdjacentVertices() {
		return adjacentVertices;
	}
	
	public int compareTo(Vertex vertexB) {
		return distance.intValue() - vertexB.distance.intValue();
	}
	
	@Override
	public String toString() {
		return id;
	}
}
