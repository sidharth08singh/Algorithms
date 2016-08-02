package com.raio.algorithms.classes;

public class TreeNode {
	private int nodeID;
	private TreeNode parent;
	private TreeNode lchild;
	private TreeNode rchild;
	
	public TreeNode() {
		
	}
	
	public TreeNode(int nodeID) {
		this.nodeID = nodeID;
		parent = null;
		lchild = null;
		rchild = null;
	}
	
	public int getNodeID() {
		return nodeID;
	}
	public void setNodeID(int nodeID) {
		this.nodeID = nodeID;
	}
	public TreeNode getParent() {
		return parent;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	public TreeNode getLchild() {
		return lchild;
	}
	public void setLchild(TreeNode lchild) {
		this.lchild = lchild;
	}
	public TreeNode getRchild() {
		return rchild;
	}
	public void setRchild(TreeNode rchild) {
		this.rchild = rchild;
	}
}
