package com.soumyadeep.Tree;

public class MaxPathSumInBinary {

	public static void main(String[] args) {
		MaxPathSumInBinary.BinaryTree bt = new BinaryTree(1);
		/*bt.left = new BinaryTree(2);
		bt.right = new BinaryTree(3);
		bt.left.left = new BinaryTree(4);
		bt.left.right = new BinaryTree(5);
		bt.right.left = new BinaryTree(6);
		bt.right.right = new BinaryTree(7);*/
		
		bt.left=new BinaryTree(-1);
		bt.right = new BinaryTree(2);

		System.out.println(maxPathSum(bt));
	}

	public static int maxPathSum(BinaryTree tree) {
		// Write your code here.
		if(tree == null)
			return Integer.MIN_VALUE;
		else
			return maxPathSum(tree, null);
	}
	
	public static int maxPathSum(BinaryTree node, BinaryTree parent) {
		int left=0;
		int right=0;
		if(node.left==null && node.right==null){
			return node.value;
		}else if(parent!=null){
			if(parent.left!=null){
				left=maxPathSum(node.left,node);
			}
			if(parent.right!=null){
				right=maxPathSum(node.right, node);
			}
			return (left >= right ? left:right)+node.value;
		}else{
			left=maxPathSum(node.left,node);
			right=maxPathSum(node.right,node);
			int maxOfSubTree = left >= right ? left:right;
			int currentValue = node.value;
			if(left<0 && right<0 && node.value < 0){
				return currentValue >= maxOfSubTree ? currentValue : maxOfSubTree;
			}else if(currentValue < 0){
				return maxOfSubTree;
			}else if(left<=0 && right<=0 && currentValue >= 0){
				return currentValue;
			}else if(currentValue > 0){
				return currentValue + (left > right ? left : right);
			}else{
				return node.value+maxPathSum(node.left,node) + maxPathSum(node.right,node);
			}
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
