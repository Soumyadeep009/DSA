package com.soumyadeep.Tree;

import com.soumyadeep.Tree.BranchSumOfBinaryTree.BinaryTree;

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvertBinaryTree.BinaryTree bt = new BinaryTree(1);
		bt.left = new BinaryTree(2);
		bt.right = new BinaryTree(3);
		bt.left.left = new BinaryTree(4);
		bt.left.right = new BinaryTree(5);
		bt.right.left = new BinaryTree(6);
		bt.right.right = new BinaryTree(7);
		bt.left.left.left = new BinaryTree(8);
		bt.left.left.right = new BinaryTree(9);
		bt.left.right.left = new BinaryTree(10);
		
		invertBinaryTree(bt);
		System.out.println();
	}

	public static void invertBinaryTree(BinaryTree tree) {
		// Write your code here.
		if(tree == null){
			return;
		}else{
			BinaryTree temp=tree.left;
			tree.left=tree.right;
			tree.right=temp;
			invertBinaryTree(tree.left);
			invertBinaryTree(tree.right);
		}
	}

	static class BinaryTree {
		public int value;
		public BinaryTree left;
		public BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
		}
	}

}
