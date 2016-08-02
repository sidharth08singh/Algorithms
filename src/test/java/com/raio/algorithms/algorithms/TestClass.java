package com.raio.algorithms.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

import com.raio.algorithms.classes.Graph;
import com.raio.algorithms.classes.Node;

public class TestClass {
	@Test()
    public void testgraph() throws Exception {
		Node node1 = new Node(1, false);
		Node node2 = new Node(2, false);
		Node node3 = new Node(3, false);
		Node node4 = new Node(4, false);
		Node node5 = new Node(5, false);
		Node node6 = new Node(6, false);
		Node node7 = new Node(7, false);
		node1.setLinks(new LinkedList<Node>(Arrays.asList(node2, node3)));
		node2.setLinks(new LinkedList<Node>(Arrays.asList(node1, node3, node4)));
		node3.setLinks(new LinkedList<Node>(Arrays.asList(node1, node2, node5, node6)));
		node4.setLinks(new LinkedList<Node>(Arrays.asList(node2, node7)));
		node5.setLinks(new LinkedList<Node>(Arrays.asList(node3, node7)));
		node6.setLinks(new LinkedList<Node>(Arrays.asList(node3, node7)));
		node7.setLinks(new LinkedList<Node>(Arrays.asList(node4, node5, node6)));
		
        List<Node> graph = new ArrayList<Node>();
        graph.add(node1);
        graph.add(node2);
        graph.add(node3);
        graph.add(node4);
        graph.add(node5);
        graph.add(node6);
        graph.add(node7);
        
        Graph graphObj = new Graph(graph);
        for(int i = 0; i < graph.size(); i++) {
            System.out.println(graphObj.getGraph().get(i).getNodeId() + ":" + graphObj.getGraph().get(i).getLinks());
        }
    }
}
