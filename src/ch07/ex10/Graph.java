package ch07.ex10;

import java.util.Set;
import java.util.HashSet;

public class Graph {
	private Set<Vertex> vertices = new HashSet<>();
	
	public Graph(Set<Vertex> vertices) {
		this.vertices = vertices;
	}
	
	public void addVertex(Vertex vertex) {
		vertices.add(vertex);
	}
	
	public Set<Vertex> getVertices() {
		return vertices;
	}
}
