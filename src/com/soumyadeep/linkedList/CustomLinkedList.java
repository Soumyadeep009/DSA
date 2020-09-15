package com.soumyadeep.linkedList;

public class CustomLinkedList {

	int value;
	CustomLinkedList next;

	CustomLinkedList(int value) {
		this.value = value;
		this.next = null;
	}
	
	public static CustomLinkedList add(CustomLinkedList list, int value){
		while(list.next!=null){
			list=list.next;
		}
		CustomLinkedList newNode=new CustomLinkedList(value);
		list.next=newNode;
		return list;
	}
	
	public static CustomLinkedList prepend(CustomLinkedList list, int value){
		CustomLinkedList newNode=new CustomLinkedList(value);
		newNode.next=list;
		return newNode;
	}
	
	public static void printList(CustomLinkedList myList){
		while(myList.next!=null){
			System.out.print(myList.value+"->");
			myList=myList.next;
		}
		System.out.println(myList.value);
	}

	public static void main(String args[]) {
		CustomLinkedList myLinkedList = new CustomLinkedList(10);

		/** Head is the pointer to the first node of the List */
		CustomLinkedList head = myLinkedList;
		//System.out.println(myLinkedList.value);

		/**
		 * Note if we change the value of head, the value of the first node
		 * changes too.
		 */
		/*head.value = 20;
		System.out.println(myLinkedList.value);
		System.out.println(head.value);
		System.out.println(myLinkedList.length);*/
		for(int i=1;i<=8;i++){
			myLinkedList=CustomLinkedList.add(head, i*2);
		}
		printList(head);
		
		myLinkedList=CustomLinkedList.prepend(head, 73);
		head=myLinkedList;
		printList(head);
	}

}
