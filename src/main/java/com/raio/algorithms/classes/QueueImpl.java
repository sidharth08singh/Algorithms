package com.raio.algorithms.classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.raio.algorithms.interfaces.Queue;

public class QueueImpl implements Queue {

	private List<Node> list;
	
	//default constructor
	public QueueImpl() {
		list = new LinkedList<Node>();
	}
	
	public List<Node> getList() {
		return list;
	}

	public void setList(List<Node> list) {
		this.list = list;
	}

	@Override
	public void enqueue(Node node) {
		// TODO Auto-generated method stub
		list.add(node);
	}

	@Override
	public Node dequeue() {
		// TODO Auto-generated method stub
		Node deleted = list.get(0);
		list.remove(0);
		return deleted;
	}

	@Override
	public List<Integer> peek() {
		// TODO Auto-generated method stub
		List<Integer> nodeidList = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++){
			nodeidList.add(list.get(i).getNodeId());
		}
		return nodeidList;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(list.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
