package com.raio.algorithms.classes;

import java.util.List;

public class GraphSearch {
	
	public void BFS(Graph graph, Node source) {
		//add source to queue
		System.out.println("*** Breadth First Search ***");
		QueueImpl q = new QueueImpl();
		q.enqueue(source);
		source.setVisited(true);
		Node node;
		List<Node> links;
		while(!q.isEmpty()) {
			//System.out.println("Current state of q:" + q.peek());
			node = q.dequeue();
			System.out.print(node.getNodeId() + ":");
			links = (List<Node>) node.getLinks();
			for(int i=0; i<links.size(); i++) {
				if(!links.get(i).isVisited()) {
					q.enqueue(links.get(i));
					links.get(i).setVisited(true);
				}
			}
		}
	}
	
	public void DFS(Graph graph, Node source) {
		
	}
	
	public void Dijkstra(Graph graph, Node source) {
		
	}	
}
