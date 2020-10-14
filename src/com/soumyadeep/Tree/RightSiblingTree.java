package com.soumyadeep.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSiblingTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightSiblingTree.BinaryTree bt = new BinaryTree(1);
		bt.left=new BinaryTree(2);
		bt.right=new BinaryTree(3);
		bt.left.left=new BinaryTree(4);
		bt.left.right=new BinaryTree(5);
		bt.right.left=new BinaryTree(6);
		bt.right.right=new BinaryTree(7);
		bt.left.left.left=new BinaryTree(8);
		bt.left.left.right=new BinaryTree(9);
		bt.left.right.right=new BinaryTree(10);
		bt.right.left.left=new BinaryTree(11);
		bt.right.right.left=new BinaryTree(12);
		bt.right.right.right=new BinaryTree(13);
		bt.right.left.left.right=new BinaryTree(14);
		RightSiblingTree.BinaryTree btnew = rightSiblingTree(bt);
		while(btnew!=null){
			System.out.print(btnew.value+" ");
			btnew=btnew.left;
		}
	}

	public static BinaryTree rightSiblingTree(BinaryTree root) {
		List<BinaryTree> list = new LinkedList<BinaryTree>();
		Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(root);
		list = performBST(list, queue);
		list = makeRightSiblingTree(list);
		return list.get(0);
	}

	private static List<BinaryTree> performBST(List<BinaryTree> list, Queue<BinaryTree> queue) {
		if(queue.isEmpty()){
			return list;
		}else{
			BinaryTree currentNode = queue.peek();
			list.add(currentNode);
			queue.remove();
			if(currentNode==null){
				
			}else{
				queue.add(currentNode.left);
				queue.add(currentNode.right);
			}
			return performBST(list, queue);
		}
	}
	
	private static List<BinaryTree> makeRightSiblingTree(List<BinaryTree> list){
		if(list.isEmpty()){
			return list;
		}else{
			list.get(0).right=null;
			BinaryTree currentNode;
			BinaryTree nextNode;
			for(int i=1;i<list.size()-1;i++){
				currentNode=list.get(i);
				nextNode=list.get(i+1);
				if(currentNode!=null){
					currentNode.right = nextNode;
				}
			}
			return list;
		}
	}

	static class BinaryTree {
		int value;
		BinaryTree left = null;
		BinaryTree right = null;

		public BinaryTree(int value) {
			this.value = value;
		}
	}

}
