package com.soumyadeep.Tree;

public class ClosestValueInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClosestValueInBST.BST bst =new BST(10);
		bst.left=new BST(5);
		bst.right=new BST(15);
		
		bst.left.left=new BST(2);
		bst.left.right = new BST(5);
		
		bst.right.left=new BST(13);
		bst.right.right=new BST(22);
		
		System.out.println(findClosestValueInBst(bst, 2));
	}

	public static int findClosestValueInBst(BST tree, int target) {
		// Write your code here.
		int closest = 0;
		if (tree == null) {
			return -1;
		} else {
			int minimunDifference = Integer.MAX_VALUE;
			int currentDifference = Integer.MAX_VALUE;
			while (tree != null) {
				currentDifference = Math.abs(tree.value - target);
				if (currentDifference < minimunDifference) {
					minimunDifference = currentDifference;
					closest = tree.value;
				}
				if (tree.value == target) {
					return tree.value;
				} else if (target > tree.value) {
					tree = tree.right;
				} else {
					tree = tree.left;
				}
			}
			return closest;
		}
	}

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}

}
