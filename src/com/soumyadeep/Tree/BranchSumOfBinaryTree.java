package com.soumyadeep.Tree;

import java.util.ArrayList;
import java.util.List;

public class BranchSumOfBinaryTree {
	public static class BinaryTree {
	    int value;
	    BinaryTree left;
	    BinaryTree right;

	    BinaryTree(int value) {
	      this.value = value;
	      this.left = null;
	      this.right = null;
	    }
	  }

	public static void main(String[] args) {
		BranchSumOfBinaryTree.BinaryTree bt = new  BinaryTree(1);
		bt.left = new BinaryTree(2);
		bt.right = new BinaryTree(3);
		bt.left.left = new BinaryTree(4);
		bt.left.right = new BinaryTree(5);
		bt.right.left = new BinaryTree(6);
		bt.right.right = new BinaryTree(7);
		bt.left.left.left = new BinaryTree(8);
		bt.left.left.right = new BinaryTree(9);
		bt.left.right.left = new BinaryTree(10);
		
		List<Integer> list = new ArrayList<>();
		list = branchSums(bt);
		for(Integer i:list){
			System.out.print(i+" ");
		}
	}
	
	public static List<Integer> branchSums(BinaryTree root){
		List<Integer> list = new ArrayList<Integer>();
		list = branchSums(root, 0, list);
		return list;
	}
	
	public static List<Integer> branchSums(BinaryTree node, int sumTillParent,List<Integer> list){
		if(node.left==null && node.right == null){
			list.add(sumTillParent+node.value);
			return list;
		}
		else{
			if(node.left!=null)
				branchSums(node.left, sumTillParent+node.value,list);
			if(node.right!=null)
				branchSums(node.right,sumTillParent+node.value,list);
			return list;
		}
	}

}
