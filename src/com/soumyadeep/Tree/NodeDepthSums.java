package com.soumyadeep.Tree;

import com.soumyadeep.Tree.BranchSumOfBinaryTree.BinaryTree;

public class NodeDepthSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeDepthSums.BinaryTree bt = new BinaryTree(1);
		bt.left = new BinaryTree(2);
		bt.right = new BinaryTree(3);
		bt.left.left = new BinaryTree(4);
		bt.left.right = new BinaryTree(5);
		bt.right.left = new BinaryTree(6);
		bt.right.right = new BinaryTree(7);
		bt.left.left.left = new BinaryTree(8);
		bt.left.left.right = new BinaryTree(9);
		
		System.out.println(nodeDepths(bt));
	}
	
	public static int nodeDepths(BinaryTree root) {
	    // Write your code here.
		if(root == null)
			return -1;
		else
			return nodeDepths(root, 0);
	}

	public static int nodeDepths(BinaryTree node,int currentDepth) {
	   int leftBranchSum=0;
	   int rightBranchSum=0;
	   if(node.left==null && node.right==null){
		   return currentDepth;
	   }else{
		   if(node.left!=null)
			   leftBranchSum= nodeDepths(node.left, currentDepth+1);
		   if(node.right!=null)
			   rightBranchSum= nodeDepths(node.right, currentDepth+1);
		   return currentDepth + leftBranchSum + rightBranchSum;
	   }
	}
	
	  static class BinaryTree {
	    int value;
	    BinaryTree left;
	    BinaryTree right;

	    public BinaryTree(int value) {
	      this.value = value;
	      left = null;
	      right = null;
	    }
	  }

}
