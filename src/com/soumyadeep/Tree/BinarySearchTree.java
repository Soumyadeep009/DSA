package com.soumyadeep.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		
		
		/*BinarySearchTree.BST bstnew= new BST(10);
		bstnew.insert(15);
		bstnew.insert(5);
		bstnew.insert(2);
		bstnew.insert(5);
		bstnew.insert(1);
		bstnew.insert(13);
		bstnew.insert(22);
		bstnew.insert(14);*/
		
		/*BinarySearchTree.BST bstnew= new BST(1);
		bstnew.insert(2);
		bstnew.insert(3);
		bstnew.insert(4);*/
		
		BinarySearchTree.BST bstnew= new BST(10);
		bstnew.insert(5);
		
		System.out.println(BinarySearchTree.BST.validateBst(bstnew));
		
		bstnew.printBST();
		System.out.println();
		bstnew.printTreeBFS();
		System.out.println();
		
		//System.out.println(bstnew.contains(17));
//		bstnew.remove(1);
		bstnew.remove(10);
		bstnew.printTreeBFS();
		System.out.println();

	}

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}

		public BST insert(int value) {
			// Write your code here.
			// Do not edit the return statement of this method.
			BST newNode= new BST(value);
			BST temp=this;
			
			while(true){
				if(value < temp.value){
					if(temp.left == null){
						temp.left=newNode;
						break;
					}else{
						temp=temp.left;
					}
				}else{
					if(temp.right == null){
						temp.right = newNode;
						break;
					}else{
						temp = temp.right;
					}
				}
			}
			return this;
		}

		public boolean contains(int value) {
			// Write your code here.
			BST temp = this;
			while(temp!=null){
				if(value < temp.value){
					temp = temp.left;
				}else if(value > temp.value){
					temp = temp.right;
				}else{
					return true;
				}
			}
			
			return false;
		}
		
		public void printBST(){
			List<Integer> list = new ArrayList<Integer>();
			list= dfsTraversalInOrder(this, list);
			list.forEach(l ->System.out.print(l+" "));
		}
		
		public static List<Integer> dfsTraversalInOrder(BST tree, List<Integer> list){
			if(tree == null){
				return null;
			}else{
				dfsTraversalInOrder(tree.left, list);
				list.add(tree.value);
				dfsTraversalInOrder(tree.right, list);
				return list;
			}
		}
		
		public static List<Integer> dfsTraversalPreOrder(BST tree, List<Integer> list){
			if(tree == null){
				return null;
			}else{
				list.add(tree.value);
				dfsTraversalPreOrder(tree.left, list);
				dfsTraversalPreOrder(tree.right, list);
				return list;
			}
		}
		
		public static List<Integer> dfsTraversalPostOrder(BST tree, List<Integer> list){
			if(tree == null){
				return null;
			}else{
				dfsTraversalPostOrder(tree.left, list);
				dfsTraversalPostOrder(tree.right, list);
				list.add(tree.value);
				return list;
			}
		}
		
		public void printTreeBFS(){
			if(this != null){
				List<Integer> list = new ArrayList<>();
				Queue<BST> queue = new LinkedList<BST>();
				queue.add(this);
				list = bfsTraversal(list, queue);
				
				for(Integer i: list){
					System.out.print(i+" ");
				}
			}
		}
		
		public static List<Integer> bfsTraversal(List<Integer> list, Queue<BST> queue){
			if(!queue.isEmpty()){
				BST currentNode = queue.peek();
				list.add(currentNode.value);
				queue.remove();
				if(currentNode.left!=null){
					queue.add(currentNode.left);
				}
				if(currentNode.right != null){
					queue.add(currentNode.right);
				}
				return bfsTraversal(list, queue);
			}else{
				return list;
			}
		}

		public BST remove(int value){
			remove(value,null);
			return this;
		}
		
		public void remove(int value, BST parent){
			BST currentNode= this;
			while(currentNode != null){
				if(value < currentNode.value){
					parent = currentNode;
					currentNode = currentNode.left;
				}else if(value > currentNode.value){
					parent = currentNode;
					currentNode = currentNode.right;
				}else{
					if(currentNode.left !=null && currentNode.right!=null){
						currentNode.value = currentNode.right.getMinimum();
						currentNode.right.remove(currentNode.value, currentNode);
					}else if(parent != null){
						if(parent.left == currentNode){
							parent.left= currentNode.left == null ? currentNode.right : currentNode.left;
						}else{
							parent.right= currentNode.right == null ? currentNode.left : currentNode.right;
						}
					}else{
						if(currentNode.right==null && currentNode.left==null){
							
						}else{
								if(currentNode.left!=null){
									currentNode.value = currentNode.left.value;
									currentNode.right = currentNode.left.right;
									currentNode.left= currentNode.left.left;
								}else{
									currentNode.value=currentNode.right.value;
									currentNode.left=currentNode.right.left;
									currentNode.right=currentNode.right.right;
								}
						}
					}
					break;
				}
			}
		}
		
		public int getMinimum(){
			BST currentNode = this;
			while(currentNode.left!=null){
				currentNode = currentNode.left;
			}
			return currentNode.value;
		}
		
		public static boolean validateBst(BST tree) {
		    // Write your code here.
			/*Queue<BST> queue = new LinkedList<>();
			queue.add(tree);
			if(tree!=null){
				int rootValue=tree.value;
				while(!queue.isEmpty()){
					BST currentNode = queue.peek();
					queue.remove();
					if(currentNode.left!=null){
						if(currentNode.left.value < currentNode.value  && currentNode.left.value < rootValue){
							queue.add(currentNode.left);
						}else{
							return false;
						}
					}if(currentNode.right!=null){
						if(currentNode.right.value >= currentNode.value && currentNode.right.value >= rootValue){
							queue.add(currentNode.right);
						}else{
							return false;
						}
					}
				}
			}
		    return true;*/
			
			return isBSTUtil(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
		  }
		
		static boolean isBSTUtil(BST node, int min, int max) 
	    { 
	        if (node == null) 
	            return true;
	        if (node.value < min || node.value >= max) 
	            return false; 
	        return (isBSTUtil(node.left, min, node.value) && 
	                isBSTUtil(node.right, node.value, max)); 
	    }
		   
		   
	}

}
