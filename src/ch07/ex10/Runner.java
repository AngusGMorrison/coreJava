package ch07.ex10;

import java.util.HashSet;
import java.util.Set;

public class Runner {
	public static void main(String[] args) {
		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexC = new Vertex("C");
		Vertex vertexD = new Vertex("D");
		Vertex vertexE = new Vertex("E");
		Vertex vertexF = new Vertex("F");
		
		vertexA.addAdjacentVertex(vertexB, 10D);
		vertexA.addAdjacentVertex(vertexC, 15D);
		
		vertexB.addAdjacentVertex(vertexD, 12D);
		vertexB.addAdjacentVertex(vertexF, 15D);
		
		vertexC.addAdjacentVertex(vertexE, 10D);
		
		vertexD.addAdjacentVertex(vertexE, 2D);
		vertexD.addAdjacentVertex(vertexF, 1D);
		
		vertexF.addAdjacentVertex(vertexE, 5D);
		
		Graph graph = new Graph(Set.of(vertexA, vertexB, vertexC, vertexD, vertexE, vertexF));
		Djikstra pathfinder = new Djikstra();
		pathfinder.pathfind(vertexA);
		
		System.out.println(vertexE.getShortestPath().toString());
		System.out.println(vertexF.getShortestPath().toString());
	}
	
	
	
}
