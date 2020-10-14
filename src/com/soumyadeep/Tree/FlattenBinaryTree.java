package com.soumyadeep.Tree;

public class FlattenBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlattenBinaryTree.BinaryTree bt = new BinaryTree(1);
		/*bt.left=new BinaryTree(2);
		bt.right=new BinaryTree(3);
		bt.left.left=new BinaryTree(4);
		bt.left.right=new BinaryTree(5);
		bt.right.left=new BinaryTree(6);
		bt.left.right.left=new BinaryTree(7);
		bt.left.right.right=new BinaryTree(8);*/
		
		System.out.println("Before Flattening : ");
		dfsTraversalInOrder(bt);
		bt = flattenBinaryTree(bt);
		System.out.println("After Flattening : ");
		while(bt!= null){
			System.out.print(bt.value + "<->");
			bt=bt.right;
		}
		System.out.println();

	}

	public static BinaryTree flattenBinaryTree(BinaryTree root) {
		// Write your code here.
		flattenBinaryTreeUtil(root, null);
		root = getFirstNode(root);
		return root;
	}
	
	public static void flattenBinaryTreeUtil(BinaryTree node, BinaryTree parent) {
		// Write your code here.
		if(node==null){
			return;
		}else{
			BinaryTree left= getRightMostNode(node.left);
			BinaryTree right= getLeftMostNode(node.right);
			flattenBinaryTreeUtil(node.left, node);
			flattenBinaryTreeUtil(node.right, node);
			
			//leaf node conditions
			if(left==null && right==null && parent!=null){
				if(node == parent.left){
					node.right=parent;
				}
				if(node == parent.right){
					node.left=parent;
				}
			}
			//single child node
			else if(left==null || right==null){
				if(left==null){
					node.right=right;
				}
				if(right==null){
					node.left=left;
				}
			}
			//two child node
			else{
				node.left=left;
				left.right = node;
				node.right=right;
				right.left=node;
			}
		}
	}
	
	public static BinaryTree getRightMostNode(BinaryTree node){
		if(node==null){
			return null;
		}else{
			while(node.right != null){
				node = node.right;
			}
			return node;	
		}
	}
	
	public static BinaryTree getLeftMostNode(BinaryTree node){
		if(node==null){
			return null;
		}else{
			while(node.left != null){
				node = node.left;
			}
			return node;	
		}
	}
	
	public static void dfsTraversalInOrder(BinaryTree tree){
		if(tree == null){
			return;
		}else{
			dfsTraversalInOrder(tree.left);
			System.out.print(tree.value+" ");
			dfsTraversalInOrder(tree.right);
		}
	}
	
	public static BinaryTree getFirstNode(BinaryTree node){
		if(node!=null){
			while(node.left!=null){
				node=node.left;
			}
			return node;
		}
		return null;
	}

	// This is the class of the input root. Do not edit it.
	static class BinaryTree {
		int value;
		BinaryTree left = null;
		BinaryTree right = null;

		public BinaryTree(int value) {
			this.value = value;
		}
	}

}
