package com.soumyadeep.Tree;

import java.util.Stack;
import java.util.function.Function;

public class IterativeInOrderTreeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IterativeInOrderTreeTraversal.BinaryTree bt = new BinaryTree(1);
		bt.left = new BinaryTree(2);
		bt.right = new BinaryTree(3);
		bt.left.left = new BinaryTree(4);
		bt.left.right = new BinaryTree(5);
		bt.right.left = new BinaryTree(6);
		bt.left.right.left = new BinaryTree(7);
		bt.left.right.right = new BinaryTree(8);

		iterativeInOrderTraversal(bt);
	}

	public static void iterativeInOrderTraversal(BinaryTree tree, Function<BinaryTree, Void> callback) {
		// Write your code here.
		Stack<BinaryTree> stack = new Stack<>();
		BinaryTree currentNode = tree;
		while (currentNode != null || !stack.isEmpty()) {
			while (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			callback.apply(currentNode);
			currentNode = currentNode.right;
		}
	}

	public static void iterativeInOrderTraversal(BinaryTree tree) {
		Stack<BinaryTree> stack = new Stack<>();
		BinaryTree currentNode = tree;
		while (currentNode != null || !stack.isEmpty()) {
			while (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			System.out.print(currentNode.value + " ");
			currentNode = currentNode.right;
		}
	}

	static class BinaryTree {
		public int value;
		public BinaryTree left;
		public BinaryTree right;
		public BinaryTree parent;

		public BinaryTree(int value) {
			this.value = value;
		}

		public BinaryTree(int value, BinaryTree parent) {
			this.value = value;
			this.parent = parent;
		}
	}

}
