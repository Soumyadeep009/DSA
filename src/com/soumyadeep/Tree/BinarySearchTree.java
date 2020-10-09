package com.soumyadeep.Tree;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		
		
		BinarySearchTree.BST bstnew= new BST(10);
		bstnew.insert(15);
		bstnew.insert(5);
		bstnew.insert(2);
		bstnew.insert(5);
		bstnew.insert(1);
		bstnew.insert(13);
		bstnew.insert(22);
		bstnew.insert(14);

		System.out.println(bstnew.contains(17));
		bstnew.remove(2);
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
			BST newNode=new BST(value);
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
					}
					else{
						temp=temp.right;
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

		public BST remove(BST node, int value){
			if(node.left == null && node.right == null){
				return node;
			}
			

			if(value < node.value){
				node = remove(node.left,value);
			}else if(value > node.value){
				node = remove(node.right,value);
			}else{
				if(node.left==null || node.right==null){
					BST temp = null;
					temp = node.left == null ? node.right : node.left;
					return temp;
				}else{
					//Node inOrderSuccessor = getSuccessor(node.right);
				}
			}
			return node;
		}
		
		public BST remove(int value) {
			// Write your code here.
			// Do not edit the return statement of this method.
			
			return this;
		}
	}

}
