package com.raio.algorithms.interfaces;

import java.util.List;

import com.raio.algorithms.classes.Node;

public interface Queue {
	void enqueue(Node item);
	Node dequeue();
	List<Integer> peek();
	int size();
	boolean isEmpty();
}
