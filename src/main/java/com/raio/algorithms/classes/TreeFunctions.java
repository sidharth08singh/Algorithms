package com.raio.algorithms.classes;

public class TreeFunctions {
	
	private TreeNode root;
	
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public TreeFunctions() {
		this.root = null;
	}
	
	//print the nodes of the binary search tree in pre-order (ascending order) - recursively
	public void printBSTPreorderRecursive(TreeNode root) {
		if(root != null) {
			printBSTPreorderRecursive(root.getLchild());
			System.out.print(root.getNodeID() + " -> ");
			printBSTPreorderRecursive(root.getRchild());
		}
	}
	
	//print the nodes of the binary search tree in pre-order (ascending order) - recursively
	public void printBSTPostorderRecursive(TreeNode root) {
		if(root != null) {
			printBSTPostorderRecursive(root.getRchild());
			System.out.print(root.getNodeID() + " -> ");
			printBSTPostorderRecursive(root.getLchild());
		}
	}
	
	//print the nodes of the binary search tree in pre-order (ascending order) - recursively
	public void printBSTInorderRecursive(TreeNode root) {
		if(root != null) {
			System.out.print(root.getNodeID() + " -> ");
			printBSTInorderRecursive(root.getLchild());
			printBSTInorderRecursive(root.getRchild());
		}
	}
	
	//search for a nodeID in the binary search tree
	public boolean searchBST(int nodeID) {
		if(getRoot() == null) {
			return false;
		}
		
		TreeNode current = root;
		while(true) {
			if(nodeID == current.getNodeID()) {
				return true;
			}
			if(nodeID < current.getNodeID()) {
				current = current.getLchild();
				if(current == null) {
					return false;
				}
			}
			else {
				current = current.getRchild();
				if(current == null) {
					return false;
				}
			}
		}
		
	}
	
	//find minimum in the binary search tree
	public int findMinBST(TreeNode root) {
		//if tree has no nodes
		if(root == null) {
			return -1;
		}
		//recurse on the left subtree
		while(true) {
			if(root.getLchild() == null) {
				return root.getNodeID();
			}
			root = root.getLchild();
		}
	}
	
	//find maximum in the binary search tree
	public int findMaxBST(TreeNode root) {
		//if tree has no nodes
		if(root == null) {
			return -1;
		}
		//recurse on the left subtree
		while(true) {
			if(root.getRchild() == null) {
				return root.getNodeID();
			}
			root = root.getRchild();
		}
	}
	
	//print the nodes of the binary search tree - iteratively
	public void printBSTIterative(TreeNode root) {
		
	}
	
	//insert a node into the binary search tree
	public void insertNode(int nodeID) {
		TreeNode newnode = new TreeNode(nodeID);
		//check if tree has no nodes
		if(getRoot() == null) {
			root = newnode;
			return;
		}
		
		//if the tree has 1 or more nodes
		TreeNode current = getRoot();
		TreeNode parent = null;
		while(true) {
			parent = current;
			if(nodeID < current.getNodeID()) {
				current = current.getLchild();
				if(current == null) {
					parent.setLchild(newnode);
					return;
				}
			}
			else {
				current = current.getRchild();
				if(current == null) {
					parent.setRchild(newnode);
					return;
				}
			}
		}
	}
}
