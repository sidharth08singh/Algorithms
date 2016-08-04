package com.raio.algorithms.classes;

import java.util.List;

/**
 * Graph Class - A graph is a collection of nodes and their interconnections.
 * To represent a graph, we use an adjacency list.
 *
 */
public class Graph
{
    private List<Node> graph;

    //default constructor
    public Graph() {

    }

    //parameterized constructor
    public Graph(List<Node> graph) {
        this.graph = graph;
    }

    public List<Node> getGraph() {
        return graph;
    }

    public void setGraph(List<Node> graph) {
        this.graph = graph;
    }
}
