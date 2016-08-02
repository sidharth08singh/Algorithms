package com.raio.algorithms.classes;

import java.util.List;

/**
 * Node Class - A node is a single object in a graph.
 * To represent a node, we use a node id which is essentially the name of the node and a list that contains the
 * name of each node to which this node has a direct connection with.
 *
 */
public class Node
{
    private int nodeId;
    private List<Node> links;
    private boolean visited;

	//default constructor
    public Node() {

    }

    //parameterised constructor
    public Node(int nodeId, boolean visited) {
        this.nodeId = nodeId;
        this.visited = visited;
    }

    public int getNodeId() {
        return nodeId;
    }

    public List<Node> getLinks() {
        return links;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public void setLinks(List<Node> links) {
        this.links = links;
    }
    
    public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}
