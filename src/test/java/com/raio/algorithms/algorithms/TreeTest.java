package com.raio.algorithms.algorithms;

import org.testng.annotations.Test;
import com.raio.algorithms.classes.TreeFunctions;
import com.raio.algorithms.classes.TreeNode;

public class TreeTest {
	
	@Test()
	public void TestBSTInsertion() {
		TreeFunctions treeFunctions = new TreeFunctions();
		treeFunctions.insertNode(30); 
		
		treeFunctions.insertNode(20);
		
		treeFunctions.insertNode(40);
		
		treeFunctions.insertNode(10);
		
		treeFunctions.insertNode(25);
		
		treeFunctions.insertNode(35);
		
		treeFunctions.insertNode(45);
		
		System.out.println("\nAscending order");
		treeFunctions.printBSTPreorderRecursive(treeFunctions.getRoot());	
		
		System.out.println("\nDescending order");
		treeFunctions.printBSTPostorderRecursive(treeFunctions.getRoot());
		
		System.out.println("\nIn order");
		treeFunctions.printBSTInorderRecursive(treeFunctions.getRoot());
		
		System.out.print("\nMinimum element ");
		System.out.println(treeFunctions.findMinBST(treeFunctions.getRoot()));
		
		System.out.print("\nMaximum element ");
		System.out.println(treeFunctions.findMaxBST(treeFunctions.getRoot()));
	}
}
