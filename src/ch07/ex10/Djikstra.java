package ch07.ex10;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Djikstra {
	private Set<Vertex> settledVertices = new HashSet<>();
	private PriorityQueue<Vertex> unsettledVertices = new PriorityQueue<>();
	
	public void pathfind(Vertex source) {
		source.setDistance(0D);
		unsettledVertices.add(source);
		
		while (unsettledVertices.size() > 0) {
			Vertex currentVertex = unsettledVertices.remove();
			for (Entry<Vertex, Double> adjacencyPair : currentVertex.getAdjacentVertices().entrySet()) {
				Vertex adjacentVertex = adjacencyPair.getKey();
				Double edgeWeight = adjacencyPair.getValue();
				if (!settledVertices.contains(adjacentVertex)) {
					calculateMinimumDistance(adjacentVertex, edgeWeight, currentVertex);
					unsettledVertices.add(adjacentVertex);
				}
			}
			settledVertices.add(currentVertex);
		}
		
	}
	
	private void calculateMinimumDistance(Vertex evaluationVertex, Double edgeWeight, Vertex referenceVertex) {
		Double sourceDistance = referenceVertex.getDistance();
		if (sourceDistance + edgeWeight < evaluationVertex.getDistance()) {
			evaluationVertex.setDistance(sourceDistance + edgeWeight);
			List<Vertex> shortestPath = new LinkedList<>(referenceVertex.getShortestPath());
			shortestPath.add(referenceVertex);
			evaluationVertex.setShortestPath(shortestPath);
		}
	}
}
